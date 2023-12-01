package tcppackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8999);

        while(true){
            Socket socket = serverSocket.accept();
            int port = socket.getPort();
            System.out.print("客户端端口号：" + port + "，IP地址：" + socket.getInetAddress() + ", ");
            Thread thread = new Thread(){
                @Override
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        byte[] buf = new byte[1024];
                        int readLen = 0;
                        while ((readLen = inputStream.read(buf)) != -1) {
                            System.out.println(new String(buf, 0, readLen));//根据读取到的实际长度，显示内容.
                        }
                        inputStream.close();
                        socket.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            };
            thread.start();

        }
//        serverSocket.close();
    }
}
