package URL;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

//需求：将URL代表的资源下载到本地
public class URLtest1 {
    @Test
    public void test() throws IOException {
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.获取URL的实例
            URL url = new URL("http://localhost:8082/examples/abc.jpg?name=tom");
            //2.建立与服务器的连接
            urlConnection = (HttpURLConnection) url.openConnection();
            //3.创建流
            inputStream = urlConnection.getInputStream();
            File file = new File("dest.jpg");
            fileOutputStream = new FileOutputStream(file);
            //4.读写数据
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("文件下载完成！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
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
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
