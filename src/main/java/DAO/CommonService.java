package DAO;

import models.Report;
import models.User;

import java.util.List;

public interface CommonService {

    List<User> get_User_By_Dorm(String serial_number);

    void change_Info(User admin);

    void send_Report(Report report);
}
