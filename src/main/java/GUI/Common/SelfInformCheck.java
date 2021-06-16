package GUI.Common;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:18:40
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Models.User;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class SelfInformCheck extends Stage {
    public SelfInformCheck(User user){
        setHeight(700);
        setWidth(500);
        GridPane pane = new GridPane();
        List<TextField> fieldList = new ArrayList<TextField>();
        TextField sno = new TextField(user.getSerial_number()); fieldList.add(sno);
        TextField sname = new TextField(user.getName()); fieldList.add(sname);
        TextField building_num = new TextField(String.valueOf(user.getBuilding_num())); fieldList.add(building_num);
        TextField sex = new TextField(user.getSex());  fieldList.add(sex);
        TextField dormitory_num = new TextField(user.getDormitory_number()); fieldList.add(dormitory_num);
        TextField mail = new TextField(user.getMail()); fieldList.add(mail);

        int i = 0;
        for (TextField x : fieldList) {
            pane.add(x,2,i);
            if(i == 5)i ++;
            x.setEditable(false);
            i ++;
        }

        pane.add(new Label("学号"),0,0);
        pane.add(new Label("姓名"),0,1);
        pane.add(new Label("宿舍楼号"),0,2);
        pane.add(new Label("性别"),0,3);
        pane.add(new Label("宿舍号"),0,4);
        pane.add(new Label("电子邮箱"),0,5);
        setScene(new Scene(pane,500,600));
        show();
    }


}
