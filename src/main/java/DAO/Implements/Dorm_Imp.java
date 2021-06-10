package DAO.Implements;

import DAO.DormService;
import Factory.ConnectorFactory;
import Factory.UserFactory;
import Tools.Connector;
import models.Dorm;
import models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static StcData.Constants.COMMON_SIZE;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:15:44
 * @ Description:Clam and Analyze;
 */
public class Dorm_Imp implements DormService {
    public void add(Dorm dorm) {
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;insert into dorm values(?,?,?,?,?)"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,dorm.getSerial_number());
            preparedStatement.setInt(2,dorm.getFloor());
            preparedStatement.setInt(3,dorm.getBuilding());
            preparedStatement.setString(4,dorm.getTel());
            preparedStatement.setInt(5,dorm.getPeople_num());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String serial_number) {
        Connector connection =  ConnectorFactory.getConnector();
        String sql = "use Dormitory_System;drop from dorm where dormitory_num == ?"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setString(1,serial_number);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Dorm> get_unoccupied() {
        List<Dorm>dormList = new ArrayList<Dorm>();
        Connector connection = new Connector();
        String sql = "use Dormitory_System;select * from dorm where ? - people_num > 0"; //需要填补adminlist中的一些字段
        PreparedStatement preparedStatement ;
        try {
            preparedStatement = connection.getConnector().prepareStatement(sql);
            preparedStatement.setInt(1, COMMON_SIZE);
            ResultSet result = preparedStatement.executeQuery();
            Dorm dorm  = new Dorm();
            while (result.next()) {
                dorm.setSerial_number(result.getString("serial_number"));
                dorm.setPeople_num(result.getInt("people_num"));
                dorm.setBuilding(result.getInt("building_num"));
                dorm.setTel(result.getString("tel"));
                dorm.setFloor(result.getInt("floor"));
                dormList.add(dorm);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return dormList;
    }
}
