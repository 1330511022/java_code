import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        //1.实例化
        try {
            //.getByName()获取指定IP
            InetAddress byName = InetAddress.getByName("172.22.237.150");
            System.out.println(byName);
            InetAddress byName1 = InetAddress.getByName("www.baidu.com");//www.baidu.com/220.181.38.150
            System.out.println(byName1);
            //.getLocalHost()：获取本地IP
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost); //xiaoMa/172.22.237.150
            InetAddress byName2 = InetAddress.getByName("127.0.0.1");
            System.out.println(byName2);
        //2.两个常用方法
            System.out.println(byName.getHostName());//xiaoMa
            System.out.println(byName.getHostAddress());//172.22.237.150



        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
