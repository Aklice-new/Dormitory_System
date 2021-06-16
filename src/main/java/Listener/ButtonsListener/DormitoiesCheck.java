package Listener.ButtonsListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:19:07
 * @ Description:Clam and Analyze;
 */

import GUI.Common.DormReleated;
import javafx.event.Event;
import javafx.event.EventHandler;

public class DormitoiesCheck implements EventHandler {
    String dormitory_num;
    @Override
    public void handle(Event event) {
        new DormReleated(dormitory_num);
    }
    public DormitoiesCheck(String str){
        dormitory_num = str;
    }

}
