package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static StcData.Constants.*;

public class Connector {


    Connection connector = null;
    /*
    create a connector to mysql ;
    */
    public Connector()  {
        try{
            Connection connector = DriverManager.getConnection(JD_URl,USER,PASSWORD);
            System.out.println("connect success");
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("connect fails");
        }

    }

    public Connection getConnector() {
        return connector;
    }
}
