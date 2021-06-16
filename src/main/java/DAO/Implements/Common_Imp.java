package DAO.Implements;

import DAO.CommonService;
import Factory.ConnectorFactory;
import Factory.UserFactory;
import Tools.Connector;
import Models.Report;
import Models.User;

;import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:15:43
 * @ Description:Clam and Analyze;
 */
public class Common_Imp implements CommonService {

    public List<User> get_User_By_Dorm(String dormitory_num) {

        List<User>userList = new ArrayList<User>();
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;select * from users where dormitory = ?"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,dormitory_num);
            ResultSet result = preparedStatement.executeQuery();
            User user = UserFactory.getUser();
            while(result.next()){
                user.setSerial_number(result.getString("serial_number"));
                user.setDormitory_number(result.getString("dormitory_num"));
                user.setUser_level(result.getInt("user_level"));
                user.setName(result.getString("name"));
                user.setSex(result.getString("sex"));
                user.setMail(result.getString("mail"));
                user.setBuilding_num(result.getInt("building_num"));
                user.setPasswd(result.getString("passwd"));
            }
            userList.add(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void change_Info(User admin) {

    }

    public void send_Report(Report report) {
        Connector connector = ConnectorFactory.getConnector();
        String sql = "user Dormitory;insert into transactions values (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = connector.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,report.getDormitory_num());
            preparedStatement.setString(2,report.getType());
            preparedStatement.setString(3,report.getContent());
            preparedStatement.setString(4,report.getTel());
            preparedStatement.setString(5,report.getDate());
            preparedStatement.setInt(6,report.getState());

            preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
