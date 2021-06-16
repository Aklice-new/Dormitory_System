package Models;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/16
 * @ LastChangeTime:10:27
 * @ Description:Clam and Analyze;
 */

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class LeaveSchool {
    private SimpleStringProperty serial_number;
    private SimpleStringProperty name;
    private SimpleStringProperty reason;
    private SimpleStringProperty result;
    private SimpleIntegerProperty state;
    private String mail;


    public LeaveSchool(){
        serial_number = new SimpleStringProperty();
        name = new SimpleStringProperty();
        reason = new SimpleStringProperty();
        result = new SimpleStringProperty();
        state = new SimpleIntegerProperty();
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getResult() {
        return result.get();
    }

    public SimpleStringProperty resultProperty() {
        return result;
    }

    public void setResult(String result) {
        this.result.set(result);
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

    public String getReason() {
        return reason.get();
    }

    public SimpleStringProperty reasonProperty() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason.set(reason);
    }

    public int getState() {
        return state.get();
    }

    public SimpleIntegerProperty stateProperty() {
        return state;
    }

    public void setState(int state) {
        this.state.set(state);
    }
}
