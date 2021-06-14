package Listener.ButtonsListener.Student_infom;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/11
 * @ LastChangeTime:18:30
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Tools.Encryptor;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import models.User;

import javax.swing.*;
import java.util.List;

public class AddConfirmListener implements EventHandler {
    static List<TextField> fieldList = null;

    @Override
    public void handle(Event event) {
        int flag = -1;
        User user = new User();
        for (int i = 0;i < 8;i ++) {
            String now_str = fieldList.get(i).getText();
            if(!check(i,now_str,user)){
                flag = i;
                break;
            }
        }
        if(flag != -1){
            JOptionPane.showMessageDialog(null,"信息错误" + flag);
        }
        else{
            new Admin_Imp().add_Common(user);
            JOptionPane.showMessageDialog(null,"添加完成");
        }

    }
    public AddConfirmListener(List<TextField>fieldList){
        this.fieldList = fieldList;
    }
    public static boolean check(int idx,String str,User user){
        String regex = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";
        switch (idx){
            case 0: user.setSerial_number(str);return true;
            case 1: user.setName(str);return true;
            case 2: user.setBuilding_num(Integer.valueOf(str));return true;
            case 4: user.setDormitory_number(str);return true;  //可以添加对building_num的限定
            case 3: if(str == "男" || str == "女") {
                        user.setSex(str);
                        return true;
                    }
                    else return false;
            case 5: if(regex.matches(str)){
                        user.setMail(str);
                        return true;
                    }
                    else return false;
            case 6: return true;
            case 7: String str1 = fieldList.get(idx - 1).getText();
                    if(str1 != str)
                        return false;
                    else user.setPasswd(Encryptor.getMD5(str));
        }
        return false;
    }

}
