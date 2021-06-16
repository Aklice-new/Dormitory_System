package GUI.Common;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:19:12
 * @ Description:Clam and Analyze;
 */

import Models.User;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class reportInformation extends Stage {

    public reportInformation(User user){
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,10,20,10));
        Label type  = new Label("类型");
        Label content = new Label("内容");
        Label tel = new Label("电话");
        content.setMinSize(70,200);
        TextField type_field = new TextField();
        TextField content_field = new TextField();
        TextField tel_field = new TextField();

        gridPane.add(type,0,1);
        gridPane.add(content,0,2);
        gridPane.add(tel,0,3);
        gridPane.add(type_field,1,1);
        gridPane.add(content_field,1,2);
        gridPane.add(tel_field,1,3);
        setScene(new Scene(gridPane,500,700));
        show();
    }

}
