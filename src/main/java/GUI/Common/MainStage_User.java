package GUI.Common;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/2
 * @ LastChangeTime:19:50
 * @ Description:Clam and Analyze;
 */

import Listener.ButtonsListener.*;
import Models.User;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class MainStage_User extends Stage {
    // 获取下拉框的界面
    Button user_info;
    Button report_info;
    Button dorm_info;
    Text basic_information;
    GridPane gridPane;
    VBox vBox;
    public MainStage_User(User admin){
        setTitle("用户");
        setResizable(true);
        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15,10,20,10));

        String str = "欢迎" + admin.getName() + "使用宿舍管理系统，您的id是 " + admin.getSerial_number();
        basic_information = new Text(str);

        vBox = new VBox();
        vBox.setPadding(new Insets(15,10,10,10));
        vBox.setAlignment(Pos.CENTER_LEFT);
        vBox.setSpacing(20);

        vBox.getChildren().add(user_info = new Button("个人信息查询"));
        vBox.getChildren().add(dorm_info = new Button("宿舍相关人员"));
        vBox.getChildren().add(report_info = new Button("上报信息"));

        /*
        为按钮添加事件驱动
         */
        user_info.setOnAction(new SelfInform(admin));
        dorm_info.setOnAction(new DormitoiesCheck(admin.getDormitory_number()));
        report_info.setOnAction(new ReportInform(admin));
        gridPane.add(vBox,1,1);
        gridPane.add(basic_information,1,0);
        setScene(new Scene(gridPane,500,600));
        show();
    }

}
