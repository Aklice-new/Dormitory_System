package GUI;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/10
 * @ LastChangeTime:15:11
 * @ Description:Clam and Analyze;
 */

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class ReporterView extends Stage {
    public ReporterView(){
        setHeight(500);
        setWidth(300);
        Group group = new Group();
        TableView table = new TableView();
        Label label = new Label("上报信息表");
        table.setEditable(true);
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");

        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
        getComboBox(group);
        group.getChildren().addAll(vbox);
        setScene(new Scene(group,500,600));
        show();
    }

    private void getComboBox(Group borderPane) {
        VBox vbox = new VBox(); // 创建一个垂直箱子
        // 初始化选择列表
        List<String> snackList = Arrays.asList("按日期排序", "按宿舍楼号排序升序", "按宿舍楼号降序",
                "未处理", "已处理");
        // 把清单对象转换为JavaFX控件能够识别的数据对象
        ObservableList<String> obList = FXCollections.observableArrayList(snackList);
        final ComboBox<String> comboBox = new ComboBox<String>(obList); // 依据指定数据创建下拉框
        comboBox.setItems(obList); // 设置下拉框的数据来源
        comboBox.getSelectionModel().select(0); // 设置下拉框默认选中第1项
        Font font = Font.font("NSimSun", 16); // 创建一个字体对象
        comboBox.setStyle(String.format("-fx-font: %f \"%s\";", font.getSize(), font.getFamily())); // 设置下拉框的字体
        comboBox.setEditable(false); // 设置下拉框能否编辑。默认不允许编辑
        borderPane.getChildren().add(vbox);
        // 设置下拉框的选择监听器
        //borderPane.setCenter(vbox); // 把垂直箱子放到边界窗格的中央
    }

}
