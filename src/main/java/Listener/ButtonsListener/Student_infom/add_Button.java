package Listener.ButtonsListener.Student_infom;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/11
 * @ LastChangeTime:11:37
 * @ Description:Clam and Analyze;
 */

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class add_Button implements EventHandler {

    GridPane pane = null;
    public add_Button(GridPane pane){
        this.pane = pane;
    }

    @Override
    public void handle(Event event) {
        pane.getChildren().clear();
        //Map<Integer, TextField>textFieldMap = new HashMap<Integer, TextField>();
        List<TextField>fieldList = new ArrayList<TextField>();
        TextField sno = new TextField(); fieldList.add(sno);
        TextField sname = new TextField(); fieldList.add(sname);
        TextField building_num = new TextField(); fieldList.add(building_num);
        TextField sex = new TextField();  fieldList.add(sex);
        TextField dormitory_num = new TextField(); fieldList.add(dormitory_num);
        TextField mail = new TextField(); fieldList.add(mail);
        TextField passwd = new PasswordField(); fieldList.add(passwd);
        TextField confirmPasswd = new PasswordField(); fieldList.add(confirmPasswd);

        Button confirm_but = new Button("确认");
        pane.add(confirm_but,1,9);

        confirm_but.setOnAction(new AddConfirmListener(fieldList));

        int i = 0;
        for (TextField x : fieldList) {
            pane.add(x,2,i);
            if(i == 5)i ++;
            i ++;
        }

        pane.add(new Label("学号"),0,0);
        pane.add(new Label("姓名"),0,1);
        pane.add(new Label("宿舍楼号"),0,2);
        pane.add(new Label("性别"),0,3);
        pane.add(new Label("宿舍号"),0,4);
        pane.add(new Label("电子邮箱"),0,5);
        pane.add(new Label("密码"),0,7);
        pane.add(new Label("确认密码 "),0,8);
        pane.add(new Label("8~16位至少数字、字符、特殊字符三种组合的密码"),2,6);

    }

}
