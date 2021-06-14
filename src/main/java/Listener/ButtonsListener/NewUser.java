package Listener.ButtonsListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/9
 * @ LastChangeTime:11:41
 * @ Description:Clam and Analyze;
 */

import GUI.StudentRelated;
import javafx.event.Event;
import javafx.event.EventHandler;

public class NewUser implements EventHandler {
    public void handle(Event event) {
        new StudentRelated();
    }
}
