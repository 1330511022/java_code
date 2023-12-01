package tcppackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，我是客户端".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        System.out.println("\n数据接收完毕！");
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
