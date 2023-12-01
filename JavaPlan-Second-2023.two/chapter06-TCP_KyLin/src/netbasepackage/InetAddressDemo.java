package netbasepackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            //1. 获取本机的InetAddress 对象
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            //2. 根据指定主机名 获取 InetAddress对象
            InetAddress host1 = InetAddress.getByName("kylin-pc");
            System.out.println("host1=" + host1);

            //3. 根据域名返回 InetAddress对象
            InetAddress host2 = InetAddress.getByName("www.tjtc.edu.cn");
            System.out.println("host2=" + host2);

            //4. 通过 InetAddress 对象，获取对应的地址
            System.out.println(host2.getHostAddress());

            //5. 通过 InetAddress 对象，获取对应的主机名/或者域名
            System.out.println(host2.getHostName());

            //5. 通过 InetAddress 对象，获取对应地址的字节数组
            byte[] address = host2.getAddress();
            for(byte b: address){
                int newIPSegment = (b < 0) ? 256 + b : b;
                System.out.println(newIPSegment);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }


}
