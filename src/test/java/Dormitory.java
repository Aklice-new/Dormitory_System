import Factory.ConnectorFactory;
import GUI.LogIn;
import GUI.MainStage_Admin;
import GUI.StudentRelated;
import Tools.Connector;
import Tools.Encryptor;
import javafx.application.Application;
import javafx.stage.Stage;
import models.User;


/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:18:30
 * @ Description:Clam and Analyze;
 */
public class Dormitory extends Application {

    @Override

    public void start(Stage primaryStage){
        // new MainStage_Admin(new User());
        new LogIn();
        // new StudentRelated();
    }

    public static void main(String[] args) {    //name : kiki passwd:kikiyyds
        launch();
        // System.out.println(Encryptor.getMD5("kikiyyds"));
        //Connector connector = ConnectorFactory.getConnector();
    }
}
