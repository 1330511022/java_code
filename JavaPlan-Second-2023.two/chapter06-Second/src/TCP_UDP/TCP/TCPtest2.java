package TCP_UDP.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//例题：客户端发送文件给服务端，服务端将文件保存在本地
public class TCPtest2 {
    //服务端
    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.创建ServerSocket
            int port = 9090;
            serverSocket = new ServerSocket(port);
            //2.接收来自客户端的Socket：accept方法
            socket = serverSocket.accept();
            //3.通过Socket获取--输入流
            inputStream = socket.getInputStream();
            //4.创建File类实例，FileOutputStream实例
            File file = new File("TCPtest2_copy.jpg");
            fileOutputStream = new FileOutputStream(file);
            //5.读写过程
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("数据接收完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
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
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //客户端
    @Test
    public void client() {
        Socket socket = null;
        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;
        try {
            //1.创建Socket
            //指明服务器端的IP和端口号
            InetAddress inetaddress = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            socket = new Socket(inetaddress, port);
            //2.创建File实例，FileInputStream的实例
            File file = new File("TCPtest2.jpg");
            fileInputStream = new FileInputStream(file);
            //3.通过Socket获取输出流
            outputStream = socket.getOutputStream();
            //4.读写数据
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
            System.out.println("数据发送成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭Socket和相关流
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
