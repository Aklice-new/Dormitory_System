package GUI;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/10
 * @ LastChangeTime:15:11
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Listener.SepcialListener.Refresh;
import Tools.Comparator_date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import models.Report;

import java.util.Arrays;
import java.util.List;

public class ReporterView extends Stage {
    ComboBox<String> comboBox = null;
    public ReporterView(){
        setHeight(700);
        setWidth(500);
        Group group = new Group();
        TableView table = new TableView();
        setTitle("上报信息表");
        table.setEditable(false);

        TableColumn dormitory = new TableColumn("宿舍");
        TableColumn report_date = new TableColumn("上报日期");
        TableColumn type = new TableColumn("类型");
        TableColumn content = new TableColumn("内容");
        TableColumn status = new TableColumn("处理状态");
        TableColumn tel = new TableColumn("电话");

        /*
        添加tableview和Report类的绑定关系
         */
        dormitory.setCellValueFactory(new PropertyValueFactory<>("dormitory_num"));
        report_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        content.setCellValueFactory(new PropertyValueFactory<>("content"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));
        tel.setCellValueFactory(new PropertyValueFactory<>("tel"));

        /*
        将所获得到的ReportList转为可以放在tableView中的List
         */
        ObservableList<Report>reportObservableList = FXCollections.observableArrayList(new Admin_Imp().get_Reporters("报修"));

        table.getColumns().addAll(dormitory,report_date,type,content,status,tel);
        table.setItems(reportObservableList);
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));

        HBox hBox = new HBox();
        getComboBox(vbox);
        Button refresh = new Button("刷新");
        refresh.setOnAction(new Refresh(comboBox,reportObservableList));
        hBox.getChildren().add(refresh);
        vbox.getChildren().add(hBox);
        vbox.getChildren().add(table);
        group.getChildren().add(vbox);
        setScene(new Scene(group,500,600));
        show();
    }

    private void getComboBox(VBox borderPane) {
        // 初始化选择列表
        List<String> snackList = Arrays.asList("按日期排序", "按宿舍楼号排序升序", "按宿舍楼号降序",
                "未处理", "已处理");
        // 把清单对象转换为JavaFX控件能够识别的数据对象
        ObservableList<String> obList = FXCollections.observableArrayList(snackList);
        comboBox = new ComboBox<String>(obList); // 依据指定数据创建下拉框
        comboBox.setItems(obList); // 设置下拉框的数据来源
        comboBox.getSelectionModel().select(0); // 设置下拉框默认选中第1项
        Font font = Font.font("NSimSun", 16); // 创建一个字体对象
        comboBox.setStyle(String.format("-fx-font: %f \"%s\";", font.getSize(), font.getFamily())); // 设置下拉框的字体
        comboBox.setEditable(false); // 设置下拉框能否编辑。默认不允许编辑
        borderPane.getChildren().add(comboBox);

    }

}
