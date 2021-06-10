package models;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/9
 * @ LastChangeTime:19:52
 * @ Description:Clam and Analyze;
 */


public class Report {
    private String content;
    private String dormitory_num;
    private String date;
    private String type;
    private String tel;
    private int status;

    public Report() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDormitory_num() {
        return dormitory_num;
    }

    public void setDormitory_num(String dormitory_num) {
        this.dormitory_num = dormitory_num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
