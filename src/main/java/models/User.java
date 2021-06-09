package models;


/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:14:56
 * @ Description:Clam and Analyze;
 */
public class User {
    private String serial_number;
    private String name;
    private int building_num;
    private String sex;
    private int dormitory_number;
    private String mail;
    private String passwd;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User(){}
    public User(String serial_number){
        this.serial_number = serial_number;
    }

    public User(String serial_number, String name, int building_num, String sex, int dormitory_number) {
        this.serial_number = serial_number;
        this.name = name;
        this.building_num = building_num;
        this.sex = sex;
        this.dormitory_number = dormitory_number;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuilding_num() {
        return building_num;
    }

    public void setBuilding_num(int building_num) {
        this.building_num = building_num;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDormitory_number() {
        return dormitory_number;
    }

    public void setDormitory_number(int dormitory_number) {
        this.dormitory_number = dormitory_number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
