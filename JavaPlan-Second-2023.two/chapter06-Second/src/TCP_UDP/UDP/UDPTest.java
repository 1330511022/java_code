package TCP_UDP.UDP;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPTest {
    @Test
    //发送端
    public void sender() throws IOException {
        //1.创建DatagramSocket实例
        DatagramSocket datagramSocket = new DatagramSocket();
        //2.将数据、目的地的IP和端口号都封装在datagramPacket数据报中
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        byte[] bytes = "我是发送端".getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, byName, port);
        //发送数据
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }

    @Test
    //接收端
    public void receiver() throws IOException {
        //1.创建DatagramSocket实例
        int port = 9090;
        DatagramSocket datagramSocket = new DatagramSocket(port);
        //2.创建数据报的对象，用于接收发送端发送过来的数据
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
        //3.接收数据
        datagramSocket.receive(datagramPacket);
        //4.获取数据并打印到控制台
        String s = new String(datagramPacket.getData());
        System.out.println(s);
        datagramSocket.close();


    }


}
