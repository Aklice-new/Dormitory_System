import GUI.Common.MainStage_User;
import GUI.Common.reportInformation;
import GUI.LogIn;
import Listener.ButtonsListener.ReportInform;
import Models.User;
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
        new LogIn();
    }
    public static void main(String[] args) {    //name : kiki passwd:kikiyyds
        launch();

    }
}
