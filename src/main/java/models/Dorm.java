package models;


import java.util.List;

import static StcData.Constants.COMMON_SIZE;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:15:16
 * @ Description:Clam and Analyze;
 */

public class Dorm {
    private String serial_number;
    private static int size = COMMON_SIZE;
    private int floor;
    private int tel;
    private List<User> dorm_mates;
    public Dorm(){}

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

}
