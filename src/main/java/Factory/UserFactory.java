package Factory;

import Models.Admin;
import Models.Dorm;
import Models.User;


/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:16:57
 * @ Description:Clam and Analyze;
 */
public class UserFactory {
    public static User getUser(){
        return new User();
    }
    public static Admin  getAdmin(){
        return new Admin();
    }

    public static Dorm getDorm(){
        return new Dorm();
    }
}
