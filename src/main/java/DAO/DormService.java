package DAO;


import models.Dorm;

import java.util.List;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:15:37
 * @ Description:Clam and Analyze;
 */
public interface DormService {
    void add(Dorm dorm);

    void delete(String serial_number);

    List<Dorm> get_unoccupied();

}
