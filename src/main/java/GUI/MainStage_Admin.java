package GUI;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/2
 * @ LastChangeTime:15:39
 * @ Description:Clam and Analyze;
 */

import Listener.ButtonsListener.LeaveSchInform;
import Listener.ButtonsListener.NewUser;
import Listener.ButtonsListener.ReportNews;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import models.User;


public class MainStage_Admin extends Stage {
    Button user_info;
    Button leave_sch_info;
    Button report_info;
    Text basic_information;
    GridPane gridPane;
    VBox vBox;
    public MainStage_Admin(User admin){
        setTitle("管理员");
        setResizable(true);
        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15,10,20,10));

        //String str = "欢迎" + admin.getName() + "使用宿舍管理系统，您的id是 " + admin.getSerial_number();
        basic_information = new Text("nihaoya");

        vBox = new VBox();
        vBox.setPadding(new Insets(15,10,10,10));
        vBox.setAlignment(Pos.CENTER_LEFT);
        vBox.setSpacing(20);
        vBox.getChildren().add(user_info = new Button("学生用户信息查询"));
        vBox.getChildren().add(leave_sch_info = new Button("离校信息查询"));
        vBox.getChildren().add(report_info = new Button("上报信息查询"));

        /*
        为按钮添加时间驱动
         */
        user_info.setOnAction(new NewUser());
        leave_sch_info.setOnAction(new LeaveSchInform());
        report_info.setOnAction(new ReportNews());
        gridPane.add(vBox,1,1);
        //gridPane.add(new Pane(),1,2);
        gridPane.add(basic_information,1,0);
        setScene(new Scene(gridPane,500,600));
        show();
    }

}
