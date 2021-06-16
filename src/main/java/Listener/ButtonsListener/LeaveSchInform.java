package Listener.ButtonsListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/9
 * @ LastChangeTime:11:42
 * @ Description:Clam and Analyze;
 */

import GUI.Admin.LeaveSchoolView;
import javafx.event.Event;
import javafx.event.EventHandler;

public class LeaveSchInform implements EventHandler {
    public void handle(Event event) {
        new LeaveSchoolView();
    }
}
