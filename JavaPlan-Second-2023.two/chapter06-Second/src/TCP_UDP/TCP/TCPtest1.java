package TCP_UDP.TCP;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//例题1：客户端发送内容给服务器，服务器端将内容打印到控制台上
public class TCPtest1 {
    //服务端
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        try {
            //创建一个ServerSocket
            int port = 8989;
            serverSocket = new ServerSocket(port);
            //调用accept(),接收客户端的Socket
            accept = serverSocket.accept(); //阻塞式方法
            System.out.println("服务器端已开启！");

            System.out.println("收到了来自于：" + accept.getInetAddress().getHostAddress()+ "的连接");
            //接收数据
            inputStream = accept.getInputStream();
            byte[] bytes = new byte[5];
            int len;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//它维护了一个byte[]数组
            while ((len = inputStream.read(bytes)) != -1) {
                //错误的 可能出现乱码
//                String s = new String(bytes, 0, len);
//                System.out.println(s);
                //正确的
                byteArrayOutputStream.write(bytes, 0, len);
            }
            String string = byteArrayOutputStream.toString();
            System.out.println(string);
            System.out.println("\n数据接收完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭Socket,ServerSocket,inputStream
            try {
                if (accept != null) {
                    accept.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (accept != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //客户端
    @Test
    public void client() {
        //创建一个Socket
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            InetAddress inetaddress = InetAddress.getByName("172.22.237.150");//声明对方IP地址
            int port = 8989;//声明对方端口号
            socket = new Socket(inetaddress, port);

            //发送数据
            outputStream = socket.getOutputStream();
            outputStream.write("你好！我是客户端！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();//关闭socket
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();//关闭流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
