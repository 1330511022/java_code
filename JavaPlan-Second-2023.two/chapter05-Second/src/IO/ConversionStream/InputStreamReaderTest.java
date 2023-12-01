package IO.ConversionStream;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {
    @Test
    public void test1() throws IOException {
        //创建File对象
        File file1 = new File("utf-8.txt");
        //创建流对象
        FileInputStream fileInputStream = new FileInputStream(file1);
//        InputStreamReader isr = new InputStreamReader(fileInputStream);//此时使用的是IDEA默认的UTF-8的字符集
        InputStreamReader isr = new InputStreamReader(fileInputStream, "utf-8");//显式的使用UTF-8字符集
        //读写操作
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            String s = new String(chars, 0, len);
            System.out.println(s);

        }
        //关闭资源
        fileInputStream.close();

    }

    //读取到的数据出现乱码，因为utf-8.txt使用的是utf-8进行的编码，所以在读取此文件时使用的字符集也必须是UTF-8
    @Test
    public void test2() throws IOException {
        //创建File对象
        File file1 = new File("utf-8.txt");
        //创建流对象
        FileInputStream fileInputStream = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fileInputStream, "gbk");//显式的使用GbK字符集
        //读写操作
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            String s = new String(chars, 0, len);
            System.out.println(s);

        }
        //关闭资源
        fileInputStream.close();

    }

    @Test
    public void test3() throws IOException {
        //创建File对象
        File file1 = new File("gbk.txt");
        //创建流对象
        FileInputStream fileInputStream = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fileInputStream, "gbk");//显式的使用GbK字符集
        //读写操作
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            String s = new String(chars, 0, len);
            System.out.println(s);

        }
        //关闭资源
        fileInputStream.close();

    }

    //需求：将gdk格式的文件转换为utf8格式的文件存储
    @Test
    public void test4() throws IOException {
        //创建File对象
        File file1 = new File("gbk.txt");
        File file2 = new File("gbk_to_utf8.txt");

        //创建流对象
        FileInputStream inputStream = new FileInputStream(file1);
        //参数二对应的是解码集，必须与gbk.txt的编码集一致
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "gbk");
        FileOutputStream outputStream = new FileOutputStream(file2);
        //参数二指明内存中的字符储存到文件中的字节过程中使用的编码集
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "utf-8");

        //读写操作
        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            outputStreamWriter.write(chars, 0, len);
        }
        System.out.println("操作完成！");
        //关闭资源
        outputStreamWriter.close();
        inputStreamReader.close();

    }


}
