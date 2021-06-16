package Tools;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/2
 * @ LastChangeTime:15:45
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Models.User;

public class Checker {
    String mail;
    String id;
    String passwd;
    User user;
    public Checker(String var1, String passwd) {

        this.passwd = passwd;
        String regex = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";
        if(var1.matches(regex)){
            this.mail = var1;
        }
        else
            this.id = var1;
        System.out.println("你好！欢迎您，亲爱的" + mail + "<------->" + id +" ");
    }

    public int isRight(){
        Admin_Imp root = new Admin_Imp();
        if(mail == null) {
            user = root.get_By_ID(id);
        }
        else{
            user = root.get_By_Mail(mail);
        }
        String base64_passwd = Encryptor.getMD5(passwd);
        try{
            if (user.getPasswd().trim().equals(base64_passwd))
                return user.getUser_level();
            else
                return 0;
        }
        catch (Exception e){
            System.out.println("没用获取到对象" );
            return 0;
        }
    }
    public User getUser(){
        return user;
    }

}
