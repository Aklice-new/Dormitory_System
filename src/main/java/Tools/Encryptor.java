package Tools;
/*
 * @ Author:  Aklice
 * @ CreateTime:2021/6/3
 * @ LastChangeTime:8:36
 * @ Description:Clam and Analyze;
 */

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/*
这是一个加密器，通过base64对字符串进行加密
 */
public class Encryptor {
    public static String getMD5(String str){
        String newStr = null;
        try {
            // 确定计算方法
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64e = new BASE64Encoder();
            // 加密后的字符串
            newStr = base64e.encode(md5.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return newStr;// 16位的加密
    }
}
