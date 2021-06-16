package Listener.ButtonsListener.Student_infom;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/15
 * @ LastChangeTime:10:32
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import Models.User;

import javax.swing.*;

public class ChangeButton implements EventHandler {
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
                    Button confirm = new Button("确认修改");
                    TextField building_num = new TextField();
                    TextField dormitory_num = new TextField();
                    pane.add(building_num,1,0);
                    pane.add(dormitory_num,1,2);
                    pane.add(confirm,1,3);
                    building_num.setText(String.valueOf(user.getBuilding_num()));
                    dormitory_num.setText(user.getDormitory_number());
                    confirm.setOnAction(new  change_confirm(building_num,dormitory_num,studentID.getText()));
                }
            }
        });

    }
    public ChangeButton(GridPane pane){
        this.pane = pane;
    }
}
