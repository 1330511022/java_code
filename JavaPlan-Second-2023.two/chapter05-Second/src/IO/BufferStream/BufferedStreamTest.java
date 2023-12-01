package IO.BufferStream;

import org.junit.Test;

import java.io.*;

public class BufferedStreamTest {

    //需求：使用BufferedInputStream\BufferedOutputStream 来复制一个图片
    @Test
    public void test1() {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.创建相关的File类的对象
            File file = new File("img.jpg");
            File file2 = new File("img_copy1.jpg");
            //2.创建相关字节流的对象、缓冲流
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3.数据的读写操作
            byte[] bytes = new byte[1024]; //1kb
            int len;//记录每次读入到bytes中的字节个数
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源（先关外层再关内层）
            //由于外层流的关闭也会自动的对内存流进行关闭操作，所有可以省略内层流的关闭
            //外层
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
//        //内层
//        fileInputStream.close();
//        fileOutputStream.close();
        }


    }
}
