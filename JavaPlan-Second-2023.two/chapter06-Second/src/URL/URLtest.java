package URL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {
    public static void main(String[] args) {
        String s = "http://localhost:8082/examples/abc.jpg?name=tom";
        try {
            URL url = new URL(s);
            System.out.println(url.getProtocol());//获取协议
            System.out.println(url.getHost());//获取主机名
            System.out.println(url.getPort());//获取端口号
            System.out.println(url.getPath());//获取文件路径
            System.out.println(url.getFile());//获取文件名
            System.out.println(url.getQuery());//获取查询名

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
