package DAO;


/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:15:37
 * @ Description:Clam and Analyze;
 */
public interface DormService {
    void add(DormService dorm);

    void delete(String serial_number);

    DormService get_By_ID(String serial_number);

}
