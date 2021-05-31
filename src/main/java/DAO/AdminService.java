package DAO;

import models.User;

import java.util.List;

public interface AdminService {
    void add_Special(User admin);

    void add_Common(User user);

    List<User>get_User_By_Dorm(String serial_number);

    User get_By_ID(String serial_number);

    void delete_By_ID(String serial_number);

    void change_Info(User admin);
}
