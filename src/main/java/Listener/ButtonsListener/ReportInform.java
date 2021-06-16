package Listener.ButtonsListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:19:13
 * @ Description:Clam and Analyze;
 */

import GUI.Common.reportInformation;
import Models.User;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ReportInform implements EventHandler {
    User user = null;
    @Override
    public void handle(Event event) {
        new reportInformation(user);
    }
    public ReportInform(User user){
        this.user = user;
    }

}
