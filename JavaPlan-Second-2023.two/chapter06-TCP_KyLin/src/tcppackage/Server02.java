package tcppackage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        System.out.println("客户端链接成功");
//        int port = socket.getPort();
//        System.out.println(port);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        char[] chars = new char[100];
        int len;
        while ((len = bufferedReader.read(chars))!=-1){
            String s = new String(chars, 0, len);
            System.out.println(s);
        }
        socket.shutdownInput();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("你好我是服务器端\n");
        bufferedWriter.write("hello,client");
        bufferedWriter.flush();
        socket.shutdownOutput();
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
