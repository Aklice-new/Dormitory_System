package Listener.ButtonsListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/9
 * @ LastChangeTime:11:43
 * @ Description:Clam and Analyze;
 */

import GUI.Admin.ReporterView;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ReportNews implements EventHandler {
    public void handle(Event event) {
        new ReporterView();
    }
}
