package StcData;

;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:15:04
 * @ Description:Clam and Analyze;
 */
public class NumberGenerator {
    public static String static_number;
    public NumberGenerator(){
        static_number = "0000000000";
    }
    public NumberGenerator(long now) {
        static_number = String.valueOf(now);
    }
}
