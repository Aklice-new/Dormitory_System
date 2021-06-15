package Tools;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/15
 * @ LastChangeTime:22:15
 * @ Description:Clam and Analyze;
 */

import models.Report;

import java.util.Comparator;

public class Comparator_building_num_up implements Comparator<Report> {
    public int compare(Report o1, Report o2) {
        if(o1.getDormitory_num().compareTo(o2.getDormitory_num())<0) return 0;
        else return 1;
    }
}
