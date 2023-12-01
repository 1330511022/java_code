package tcppackage;

import java.io.*;
import java.net.Socket;

public class Client02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.19.36.39",9999);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        bufferedWriter.write("你好,我是客户端!\n");
        bufferedWriter.write("hello,server!");
        bufferedWriter.flush();
        socket.shutdownOutput();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        char[] chars = new char[100];
        int len;
        while ((len =bufferedReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        socket.shutdownInput();
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();

    }
}
