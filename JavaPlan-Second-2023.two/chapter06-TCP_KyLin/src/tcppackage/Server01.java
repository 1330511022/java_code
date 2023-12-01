package tcppackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8999);
        System.out.println("服务器等待连接");
        Socket accept = serverSocket.accept();//服务器为阻塞状态
        System.out.println("客户端已经连接");
        InputStream inputStream = accept.getInputStream();

        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        System.out.println("\n数据接收完毕！");
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("你好客户端，我是服务器".getBytes());

        accept.shutdownOutput();
        outputStream.close();
        inputStream.close();
        serverSocket.close();

    }
}
