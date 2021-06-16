package Listener.ButtonsListener.Student_infom;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/15
 * @ LastChangeTime:18:22
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

public class delete_stu implements EventHandler{
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
                        Button confirm = new Button("确认删除");
                        pane.add(confirm,1,3);
                        confirm.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                new Admin_Imp().delete_By_ID(studentID.getText(),2);
                            }
                        });
                    }
                }
            });

        }
        public delete_stu(GridPane pane){
            this.pane = pane;
        }
}
