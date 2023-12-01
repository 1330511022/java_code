package udppackage;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Receiver01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, datagramPacket.getLength());
        System.out.println(s);
        datagramSocket.close();

    }
}

class sender01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(9898);
        System.out.println("你想给服务器发什么");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        byte[] bytes = str.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("localhost"), 9999);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();

    }
}
