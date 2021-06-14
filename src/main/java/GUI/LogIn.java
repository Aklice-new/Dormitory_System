package GUI;


import Listener.ButtonsListener.LoginButton;
import Tools.Checker;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/2
 * @ LastChangeTime:14:46
 * @ Description:Clam and Analyze;
 */
public class LogIn extends Stage {
    Button confirmBn;   //确认按钮
    Button cancelBn;    //取消按钮
    TextField mailFd;   //邮箱/用户名输入栏
    TextField passwdFd; //密码栏
    Text title;
    GridPane gridPane;
    public LogIn(){
        setTitle("登录");
        setResizable(true);
        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15,10,20,10));
        gridPane.add(title = new Text("欢迎使用宿舍管理系统"),1,0);
        title.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        gridPane.add(new Text("学号/邮箱 ："),0,1);
        gridPane.add(new Text(("密码 ：")),0,2);
        gridPane.add(mailFd = new TextField(),1,1);
        gridPane.add(passwdFd = new TextField(),1,2);
        gridPane.add(confirmBn = new Button("确认"),1,3);
        gridPane.add(cancelBn = new Button("取消"),2,3);
        Scene scene = new Scene(gridPane,400 ,600);
        setScene(scene);
        show();
        confirmBn.setOnAction(new LoginButton(this,mailFd,passwdFd));
    }

}
