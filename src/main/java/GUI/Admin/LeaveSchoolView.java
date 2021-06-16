package GUI.Admin;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:10:33
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Listener.SepcialListener.ReFreshLeave;
import Listener.SepcialListener.Refresh;
import Models.LeaveSchool;
import Models.Report;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class LeaveSchoolView extends Stage {
    ComboBox<String> comboBox = null;
    public LeaveSchoolView(){
        setHeight(700);
        setWidth(500);
        Group group = new Group();
        TableView table = new TableView();
        setTitle("离校信息表");
        //table.setEditable(true);

        TableColumn serial_num = new TableColumn("学号");
        TableColumn name = new TableColumn("姓名");
        TableColumn reason = new TableColumn("原因");
        TableColumn result = new TableColumn("结果");
        TableColumn status = new TableColumn("处理状态");

        /*
        添加tableview和LeaveSchool类的绑定关系
         */
        serial_num.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        reason.setCellValueFactory(new PropertyValueFactory<>("reason"));
        status.setCellValueFactory(new PropertyValueFactory<>("state"));
        result.setCellValueFactory(new PropertyValueFactory<>("result"));
        /*
        将所获得到的ReportList转为可以放在tableView中的List
         */
        ObservableList<LeaveSchool> reportObservableList = FXCollections.observableArrayList(new Admin_Imp().get_LeaveSchool(0));

        table.getColumns().addAll(serial_num,name,reason,status,result);
        table.setItems(reportObservableList);
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10) );
        getComboBox(vbox);
        HBox hBox = new HBox();
        Button refresh = new Button("刷新");
        refresh.setOnAction(new ReFreshLeave(comboBox,reportObservableList));
        hBox.getChildren().add(refresh);
        vbox.getChildren().add(hBox);
        vbox.getChildren().add(table);
        group.getChildren().add(vbox);
        setScene(new Scene(group,500,600));
        show();
    }
    private void getComboBox(VBox borderPane) {
        // 初始化选择列表
        List<String> snackList = Arrays.asList("已处理", "未处理");
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
