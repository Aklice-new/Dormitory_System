package Listener.ButtonsListener;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/7
 * @ LastChangeTime:23:42
 * @ Description:Clam and Analyze;
 */

import GUI.MainStage_Admin;
import GUI.MainStage_User;
import Tools.Checker;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.User;


import static StcData.Constants.COMMON_USER;
import static StcData.Constants.SUPER_USER;


public class LoginButton implements EventHandler {
    Stage stage = null;
    TextField userName  = null;
    TextField passwd = null;
    User user;
    public LoginButton(Stage stage, TextField var1, TextField var2){
        this.stage = stage;
        this.userName = var1;
        this.passwd = var2;
    }
    public void handle(Event event) {
        Checker checker = new Checker(userName.getText(),passwd.getText());
        int option = checker.isRight();
        if(option == SUPER_USER){
            // 进入管理员的界面
            user = checker.getUser();
            stage.close();
            new MainStage_Admin(user);
        }
        else if(option == COMMON_USER){
            // 进入用户界面
            user = checker.getUser();
            stage.close();
            //new MainStage_User(user);
        }
        else{
            // 退出提示密码错误

        }
    }
}
