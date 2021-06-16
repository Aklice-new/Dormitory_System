package Models;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:14:56
 * @ Description:Clam and Analyze;
 */
public class User {
    private SimpleStringProperty serial_number;
    private SimpleStringProperty name;
    private SimpleIntegerProperty building_num;
    private SimpleIntegerProperty user_level;
    private SimpleStringProperty sex;
    private SimpleStringProperty dormitory_number;
    private SimpleStringProperty mail;
    private String passwd;

    public User(){
        serial_number = new SimpleStringProperty();
        name = new SimpleStringProperty();
        building_num = new SimpleIntegerProperty();
        user_level = new SimpleIntegerProperty();
        sex = new SimpleStringProperty();
        dormitory_number = new SimpleStringProperty();
        mail = new SimpleStringProperty();
    }
    public String getSerial_number() {
        return serial_number.get();
    }

    public SimpleStringProperty serial_numberProperty() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number.set(serial_number);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getBuilding_num() {
        return building_num.get();
    }

    public SimpleIntegerProperty building_numProperty() {
        return building_num;
    }

    public void setBuilding_num(int building_num) {
        this.building_num.set(building_num);
    }

    public int getUser_level() {
        return user_level.get();
    }

    public SimpleIntegerProperty user_levelProperty() {
        return user_level;
    }

    public void setUser_level(int user_level) {
        this.user_level.set(user_level);
    }

    public String getSex() {
        return sex.get();
    }

    public SimpleStringProperty sexProperty() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex.set(sex);
    }

    public String getDormitory_number() {
        return dormitory_number.get();
    }

    public SimpleStringProperty dormitory_numberProperty() {
        return dormitory_number;
    }

    public void setDormitory_number(String dormitory_number) {
        this.dormitory_number.set(dormitory_number);
    }

    public String getMail() {
        return mail.get();
    }

    public SimpleStringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
