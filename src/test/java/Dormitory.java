import Factory.ConnectorFactory;
import GUI.LogIn;
import Tools.Connector;
import Tools.Encryptor;
import javafx.application.Application;
import javafx.stage.Stage;


/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:18:30
 * @ Description:Clam and Analyze;
 */
public class Dormitory extends Application {

    @Override

    public void start(Stage primaryStage){
        //new LogIn();
    }

    public static void main(String[] args) {
        //launch();
        Connector connector = ConnectorFactory.getConnector();
    }
}
