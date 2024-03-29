package Tools;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static StcData.Constants.*;

public class Connector {


    Connection connector = null;
    /*
    create a connector to SQL-Server ;
    */
    public Connector()  {
        try{
            Class.forName(JDBC_Driver);
            connector = DriverManager.getConnection(JD_URl,USER,PASSWORD);
            System.out.println("connect success");
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("connect fails");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnector() {
        return connector;
    }
}
