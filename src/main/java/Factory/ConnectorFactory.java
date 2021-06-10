package Factory;

import Tools.Connector;

/*
 * @ Author:  Aklice
 * @ CreateTime:2021/5/26
 * @ LastChangeTime:17:05
 * @ Description:Clam and Analyze;
 */
public class ConnectorFactory {
    public static Connector getConnector() {
        try{
            System.out.println("服务器连接成功");
            return new Connector();
        }
        catch (Exception e){
            System.out.println("服务器连接失败");
        }
        return null;
    }
}
