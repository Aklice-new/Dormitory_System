package Tools;/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/15
 * @ LastChangeTime:22:16
 * @ Description:Clam and Analyze;
 */

import models.Report;

import java.util.Comparator;

public class Comparator_status implements Comparator<Report> {
    public int compare(Report o1, Report o2) {
        if(o1.getStatus() <= o2.getStatus()) return 1;
        else return 0;
    }
}
