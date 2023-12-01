package tcppackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client03 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.19.36.41",8999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("220431501马卓".getBytes());
        socket.shutdownOutput();
        outputStream.close();
        socket.close();
    }
}
