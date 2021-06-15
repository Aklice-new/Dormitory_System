package GUI;


/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/11
 * @ LastChangeTime:10:52
 * @ Description:Clam and Analyze;
 */

import Listener.ButtonsListener.Student_infom.ChangeButton;
import Listener.ButtonsListener.Student_infom.add_Button;
import Listener.ButtonsListener.Student_infom.delete_stu;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class StudentRelated extends Stage {

    private VBox vBox = null;
    private Button add_stu = null;
    private Button change_stu = null;
    private Button get_stu = null;
    private Button del_stu = null;
    private GridPane gridPane = null;

    public StudentRelated(){
        setTitle("学生信息处理");
        setResizable(false);
        vBox = new VBox();
        vBox.setPadding(new Insets(15,10,10,10));
        vBox.setAlignment(Pos.CENTER_LEFT);
        vBox.setSpacing(40);

        //String file = "src\\main\\resources\\background.jpg";
        //Image image = new Image(file);
        //ImageView imageView = new ImageView(image);

        List<Button>buttonList = new ArrayList<Button>();

        add_stu = new Button("添加学生");
        change_stu = new Button("修改学生");
        get_stu = new Button("获取学生信息");
        del_stu = new Button("删除学生");
        buttonList.add(add_stu);
        buttonList.add(change_stu);
        buttonList.add(get_stu);
        buttonList.add(del_stu);
        for (Button  v : buttonList) {
            v.setMinHeight(50);
            v.setMinWidth(110);
        }
        vBox.getChildren().addAll(buttonList);
        GridPane anotherPane = new GridPane();
        anotherPane.setHgap(20);
        anotherPane.setVgap(5);
        anotherPane.setPadding(new Insets(10,10,10,10));
        add_stu.setOnAction(new add_Button(anotherPane));
        change_stu.setOnAction(new ChangeButton(anotherPane));
        del_stu.setOnAction(new delete_stu(anotherPane));
        gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15,10,20,10));
        gridPane.add(vBox,0,0);
        gridPane.add(anotherPane,1,0);

        setScene(new Scene(gridPane,700,500));
        show();
    }


}
