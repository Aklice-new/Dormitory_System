package Listener.SepcialListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:10:55
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Models.LeaveSchool;
import Models.Report;
import Tools.Comparator_building_num_down;
import Tools.Comparator_building_num_up;
import Tools.Comparator_date;
import Tools.Comparator_status;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

import java.util.Collections;

import static javafx.collections.FXCollections.observableArrayList;

public class ReFreshLeave implements EventHandler  {
    ComboBox<String> comboBox;
    ObservableList<LeaveSchool> reportObservableList;

    @Override
    public void handle(Event event) {
        int selectIndex = comboBox.getSelectionModel().getSelectedIndex();
        switch (selectIndex){
            case 0: reportObservableList = observableArrayList(new Admin_Imp().get_LeaveSchool(0));break;
            case 1: reportObservableList = observableArrayList(new Admin_Imp().get_LeaveSchool(1));break;
        }
    }
    public ReFreshLeave(ComboBox<String> comboBox, ObservableList<LeaveSchool> reportObservableList){
        this.comboBox = comboBox;
        this.reportObservableList = reportObservableList;
    }

}
