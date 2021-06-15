package models;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/9
 * @ LastChangeTime:19:52
 * @ Description:Clam and Analyze;
 */


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Report {
    private SimpleStringProperty content;
    private SimpleStringProperty dormitory_num;
    private SimpleStringProperty date;
    private SimpleStringProperty type;
    private SimpleStringProperty tel;
    private SimpleIntegerProperty status;

    public Report() {
        content = new SimpleStringProperty();
        dormitory_num = new SimpleStringProperty();
        date = new SimpleStringProperty();
        type = new SimpleStringProperty();
        tel = new SimpleStringProperty();
        status = new SimpleIntegerProperty();
    }

    public String getContent() {
        return content.get();
    }

    public void setContent(String content) {
        this.content.set(content);
    }

    public String getDormitory_num() {
        return dormitory_num.get();
    }

    public void setDormitory_num(String dormitory_num) {
        this.dormitory_num.set(dormitory_num);
    }

    public String getDate() {
        return date.get();
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getTel() {
        return tel.get();
    }

    public void setTel(String tel) {
        this.tel.set(tel);
    }

    public int getStatus() {
        return status.get();
    }
    public void setStatus(int status) {
        this.status.set(status);
    }
}
