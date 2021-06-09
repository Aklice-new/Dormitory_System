package DAO.Implements;

import DAO.AdminService;
import Tools.Connector;
import Factory.ConnectorFactory;
import Factory.UserFactory;
import models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql = "insert into admin_list() values(?,?,?,?,?)"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add_Common(User user){
        Connector connection =  ConnectorFactory.getConnector();
    }

    public List<User> get_User_By_Dorm(String serial_number) {

        Connector connection =  ConnectorFactory.getConnector();
        return null;
    }

    public User get_By_ID(String serial_number) {

        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_DB;select * from user_inform where id = ?"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,serial_number);
            ResultSet result = preparedStatement.executeQuery();
            User user = UserFactory.getUser();
            while(result.next()){
                user.setSerial_number(result.getString("Sno"));
                user.setDormitory_number(result.getInt("Dormitory"));
                user.setName(result.getString("Sname"));
                user.setSex(result.getString("Sex"));
                user.setMail(result.getString("Mail"));
                user.setPasswd(result.getString("Passwd"));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User get_By_Mail(String serial_number){
        Connector connection =  ConnectorFactory.getConnector();
        return null;
    }

    public void delete_By_ID(String serial_number) {
        Connector connection =  ConnectorFactory.getConnector();
    }

    public void change_Info(User admin) {
        Connector connection =  ConnectorFactory.getConnector();
    }
}
