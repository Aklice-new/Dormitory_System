package Listener.ButtonsListener;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:18:30
 * @ Description:Clam and Analyze;
 */

import GUI.Common.SelfInformCheck;
import Models.User;
import javafx.event.Event;
import javafx.event.EventHandler;

public class SelfInform implements EventHandler {
    User user = null;
    @Override
    public void handle(Event event) {
        new SelfInformCheck(user);
    }
    public SelfInform(User user){
        this.user = user;
    }

}
