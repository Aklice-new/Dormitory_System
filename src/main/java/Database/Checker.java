package Database;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/2
 * @ LastChangeTime:15:45
 * @ Description:Clam and Analyze;
 */

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class Checker {
    String mail;
    String name;
    String passwd;

    public Checker(String var1, String passwd) {

        this.name = name;
        String regex = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";
        if(passwd.matches(regex)){
            this.mail = var1;
        }
        else
            this.passwd = passwd;
    }

    public boolean isRight(){
        return true;
    }

}
