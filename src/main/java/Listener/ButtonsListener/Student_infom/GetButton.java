package Listener.ButtonsListener.Student_infom;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:15:22
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Models.User;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GetButton implements EventHandler{
    GridPane pane = null;
    @Override
    public void handle(Event event) {
        pane.getChildren().clear();
        pane.add(new Label("请输入学号 ： "),0,0);
        final TextField studentID = new TextField();
        Button confirm_stu = new Button("确认是该学生");
        pane.add(confirm_stu,0,2);
        pane.add(studentID,0,1);
        confirm_stu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                User user = new Admin_Imp().get_By_ID(studentID.getText());
                if (user.getSerial_number() == null) {
                    JOptionPane.showMessageDialog(null, "没有查找到该学生");
                }
                else{
                    pane.getChildren().clear();
                    List<TextField>fieldList = new ArrayList<>();
                    TextField sno = new TextField(user.getSerial_number()); fieldList.add(sno);
                    TextField sname = new TextField(user.getName()); fieldList.add(sname);
                    TextField building_num = new TextField(String.valueOf(user.getBuilding_num())); fieldList.add(building_num);
                    TextField sex = new TextField(user.getSex());  fieldList.add(sex);
                    TextField dormitory_num = new TextField(user.getDormitory_number()); fieldList.add(dormitory_num);
                    TextField mail = new TextField(user.getMail()); fieldList.add(mail);

                    int i = 0;
                    for (TextField x : fieldList) {
                        x.setEditable(false);
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
                }
            }
        });

    }
    public GetButton(GridPane pane){
        this.pane = pane;
    }
}
