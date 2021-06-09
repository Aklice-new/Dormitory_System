package Tools;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/2
 * @ LastChangeTime:15:45
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import models.User;

public class Checker {
    String mail;
    String id;
    String passwd;

    public Checker(String var1, @org.jetbrains.annotations.NotNull String passwd) {

        this.passwd = passwd;
        String regex = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";
        if(passwd.matches(regex)){
            this.mail = var1;
        }
        else
            this.id = var1;
    }

    public boolean isRight(){
        Admin_Imp root = new Admin_Imp();
        User temp;
        if(mail == null) {
            temp = root.get_By_ID(id);
        }
        else{
            temp = root.get_By_Mail(mail);
        }
        String base64_passwd = Encryptor.getMD5(passwd);
        if (temp.getPasswd().equals(base64_passwd)) return true;
        return false;
    }


}
