package Listener.ButtonsListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/9
 * @ LastChangeTime:11:43
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import GUI.ReporterView;
import javafx.event.Event;
import javafx.event.EventHandler;
import models.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportNews implements EventHandler {
    public void handle(Event event) {
        Admin_Imp admin = new Admin_Imp();
        List<Report>reportList = admin.get_Reporters(1);
    }
}
