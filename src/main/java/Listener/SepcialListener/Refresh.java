package Listener.SepcialListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/15
 * @ LastChangeTime:21:45
 * @ Description:Clam and Analyze;
 */


import Tools.Comparator_building_num_down;
import Tools.Comparator_building_num_up;
import Tools.Comparator_date;
import Tools.Comparator_status;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import models.Report;

import java.util.Collections;

public class Refresh implements EventHandler {
    ComboBox<String> comboBox;
    ObservableList<Report> reportObservableList;

    @Override
    public void handle(Event event) {
        int selectIndex = comboBox.getSelectionModel().getSelectedIndex();
        System.out.println(selectIndex);
        switch (selectIndex){
            case 0:Collections.sort(reportObservableList,new Comparator_date());break;
            case 1:Collections.sort(reportObservableList,new Comparator_building_num_up());break;
            case 2:Collections.sort(reportObservableList,new Comparator_building_num_down());break;
            case 3:Collections.sort(reportObservableList,new Comparator_status());break;
        }
    }
    public Refresh(ComboBox<String> comboBox, ObservableList<Report> reportObservableList){
        this.comboBox = comboBox;
        this.reportObservableList = reportObservableList;
    }

}
