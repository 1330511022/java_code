package TCP_UDP.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//例题3：客户端发送文件给服务端，服务端将文件保存在本地，并且返回“发送成功“给客户端,并关闭相应连接
public class TCPtest3 {
    //服务端
    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        OutputStream outputStream1 = null;
        try {
            //1.创建ServerSocket
            int port = 9090;
            serverSocket = new ServerSocket(port);
            //2.接收来自客户端的Socket：accept方法
            socket = serverSocket.accept();
            //3.通过Socket获取--输入流
            inputStream = socket.getInputStream();
            //4.创建File类实例，FileOutputStream实例
            File file = new File("TCPtest2_copy2.jpg");
            fileOutputStream = new FileOutputStream(file);
            //5.读写过程
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("数据接收完毕!");
            //6.服务端发送数据给客户端
            outputStream1 = socket.getOutputStream();
            outputStream1.write("你的图片很漂亮，我接收到了！".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (outputStream1 != null) {
                    outputStream1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

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
        ByteArrayOutputStream byteArrayOutputStream = null;
        InputStream inputStream = null;
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
            System.out.println("数据发送完毕！");

            //客户端表明不再发送数据
            socket.shutdownOutput();

            //5.接收来自服务器端的数据
            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes1 = new byte[15];
            int len1;
            while ((len1 = inputStream.read(bytes1)) != -1) {
                byteArrayOutputStream.write(bytes1, 0, len1);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭Socket和相关流
            try {
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
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
