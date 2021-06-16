package Listener.ButtonsListener.Student_infom;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/15
 * @ LastChangeTime:17:29
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Factory.UserFactory;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import Models.User;

public class change_confirm implements EventHandler {
    TextField building_num;
    TextField dormitory_num;
    String serial_num;
    @Override
    public void handle(Event event) {
        User user = UserFactory.getUser();
        user.setDormitory_number(dormitory_num.getText());
        user.setBuilding_num(Integer.parseInt(building_num.getText()));
        user.setSerial_number(serial_num);
        new Admin_Imp().change_Info(user);
    }
    public change_confirm(TextField building_num,TextField dormitory_num,String serial_num){
        this.building_num = building_num;
        this.dormitory_num = dormitory_num;
        this.serial_num = serial_num;
    }

}
