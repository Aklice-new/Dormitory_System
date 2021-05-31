package DAO.Implements;

import DAO.AdminService;
import Database.Connector;
import Factory.ConnectorFactory;
import models.User;

import java.sql.PreparedStatement;
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
        return null;
    }

    public void delete_By_ID(String serial_number) {
        Connector connection =  ConnectorFactory.getConnector();
    }

    public void change_Info(User admin) {
        Connector connection =  ConnectorFactory.getConnector();
    }
}
