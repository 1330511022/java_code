package afterschooltest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws Exception {
        //服务器端
        ServerSocket serverSocket = new ServerSocket(8989);
        System.out.println("服务器等待连接");
        Socket accept = serverSocket.accept();
        System.out.println("客户端已经连接");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
        byte[] helloBytes = new byte[12];
        bufferedInputStream.read(helloBytes);
        System.out.println(new String(helloBytes));
        File file = new File("server.jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        accept.close();
        serverSocket.close();
        System.out.println("\n数据接收完毕！");

    }
}

class Client {
    //客户端
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8989);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write("hello,server".getBytes());
        bufferedOutputStream.flush();
        File file = new File("1111.jpg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
        System.out.println("\n数据发送完毕！");

    }


}

