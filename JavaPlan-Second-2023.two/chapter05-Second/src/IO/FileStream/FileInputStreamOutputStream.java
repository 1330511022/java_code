package IO.FileStream;

import org.junit.Test;

import java.io.*;

public class FileInputStreamOutputStream {
    //需求复制一份img.jpg文件，命名为img_copy.jpg
    @Test
    public void test1(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.创建相关的File类的对象
            File file = new File("img.jpg");
            File file2 = new File("img_copy.jpg");

            //2.创建相关字节流的对象
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file2);

            //3.数据的读写操作
            byte[]bytes = new byte[1024]; //1kb
            int len ;//记录每次读入到bytes中的字节个数
            while ((len=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);
            }
            System.out.println("复制成功！");
            //4.关闭资源
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream!=null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileOutputStream!=null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
