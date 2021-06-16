package GUI.Common;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:18:56
 * @ Description:Clam and Analyze;
 */

import DAO.Implements.Admin_Imp;
import Listener.SepcialListener.Refresh;
import Models.Report;
import Models.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DormReleated extends Stage {
    public DormReleated(String dorm_number){
        setHeight(700);
        setWidth(500);
        Group group = new Group();
        TableView table = new TableView();
        setTitle("宿舍舍友信息表");
        table.setEditable(false);

        TableColumn name = new TableColumn("姓名");
        TableColumn serial_num = new TableColumn("学号");
        TableColumn mail = new TableColumn("邮箱");

        /*
        添加tableview和User类的绑定关系
         */
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        serial_num.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
        mail.setCellValueFactory(new PropertyValueFactory<>("mail"));
        /*
        将所获得到的ReportList转为可以放在tableView中的List
         */
        ObservableList<User> reportObservableList = FXCollections.observableArrayList(new Admin_Imp().get_User_By_Dorm(dorm_number));

        table.getColumns().addAll(name,serial_num,mail);
        table.setItems(reportObservableList);
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));

        HBox hBox = new HBox();
        vbox.getChildren().add(hBox);
        vbox.getChildren().add(table);
        group.getChildren().add(vbox);
        setScene(new Scene(group,500,600));
        show();
    }
}
