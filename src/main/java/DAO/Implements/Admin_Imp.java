package DAO.Implements;

import DAO.AdminService;
import Models.LeaveSchool;
import Tools.Connector;
import Factory.ConnectorFactory;
import Factory.UserFactory;
import Models.Report;
import Models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:15:42
 * @ Description:Clam and Analyze;
 */
public class Admin_Imp implements AdminService {

    public void add_Special(User admin) {
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;insert into admins values(?,?,?,?,?,?,?,?)"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setInt(4,admin.getUser_level());
            preparedStatement.setInt(5,admin.getBuilding_num());
            preparedStatement.setString(1,admin.getSerial_number());
            preparedStatement.setString(2,admin.getName());
            preparedStatement.setString(3, admin.getSex());
            preparedStatement.setString(6, admin.getDormitory_number());
            preparedStatement.setString(7, admin.getMail());
            preparedStatement.setString(8, admin.getPasswd());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add_Common(User user){
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;insert into users values(?,?,?,?,?,?,?,?)"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setInt(4,user.getUser_level());
            preparedStatement.setInt(5,user.getBuilding_num());
            preparedStatement.setString(1,user.getSerial_number());
            preparedStatement.setString(2,user.getName());
            preparedStatement.setString(3, user.getSex());
            preparedStatement.setString(6, user.getDormitory_number());
            preparedStatement.setString(7, user.getMail());
            preparedStatement.setString(8, user.getPasswd());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> get_User_By_Dorm(String dormitory_num) {

        List<User>userList = new ArrayList<User>();
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;select * from users where dormitory_num = ?"; //需要填补adminlist中的一些字段
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
                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public User get_By_ID(String serial_number) {

        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;select * from users where serial_number = ?"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,serial_number);
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
            return user;
        } catch (SQLException e) {
            //e.printStackTrace();
            return null;
        }

    }

    public User get_By_Mail(String mail){
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;select * from users where mail = ?"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,mail);
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
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete_By_ID(String serial_number,int level) {
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;delete  from users where serial_number = ? and user_level < ?"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,serial_number);
            preparedStatement.setInt(2,level);
            int result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void change_Info(User admin) {
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "update users set building_num = ? ,dormitory_num = ? where serial_number = ?";
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(2,admin.getDormitory_number());
            preparedStatement.setInt(1,admin.getBuilding_num());
            preparedStatement.setString(3,admin.getSerial_number());
            int result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Report> get_Reporters(String type){
        List<Report>reporters_List = new ArrayList<Report>();
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;select * from transactions where type = ?"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,type);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                Report report = new Report();
                report.setTel(result.getString("tel"));
                report.setContent(result.getString("excuse"));
                report.setDate(result.getString("date_"));
                report.setDormitory_num(result.getString("dormitory_num"));
                report.setType(result.getString("type"));
                report.setState(result.getInt("state"));
                reporters_List.add(report);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reporters_List;
    }

    public List<LeaveSchool> get_LeaveSchool(int type) {
        List<LeaveSchool>reporters_List = new ArrayList<LeaveSchool>();
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;select * from leaves where state = ?;"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setInt(1,type);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                LeaveSchool report = new LeaveSchool();
                report.setSerial_number(result.getString("serial_number"));
                report.setName(result.getString("name"));
                report.setReason(result.getString("reason"));
                report.setState(result.getInt("state"));
                report.setMail(result.getString("mail"));
                report.setResult(result.getString("result"));
                reporters_List.add(report);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reporters_List;
    }
}
