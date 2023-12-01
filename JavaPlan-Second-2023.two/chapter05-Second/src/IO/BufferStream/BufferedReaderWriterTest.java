package IO.BufferStream;

import org.junit.Test;

import java.io.*;

//测试BufferedReaderWriter使用
public class BufferedReaderWriterTest {
    //需求：使用BufferedReader将hello.txt中内容显示再控制台上
    @Test
    public void test1() {
        //1.创建
        BufferedReader bufferedReader = null;
        try {
            File file = new File("hello.txt");
            bufferedReader = new BufferedReader(new FileReader(file));

            //2.读取
//            //方式1：read(char[] chars)
//            char[] chars = new char[1024];
//            int len;
//            while ((len=bufferedReader.read(chars))!=-1){
//                //方法一：
//    //            for (int i = 0; i < len; i++) {
//    //                System.out.println(chars[i]);
//    //            }
//                //方法二：
//                String s = new String(chars, 0, len);
//                System.out.println(s);
//            }

            //方式2：readLine()  每次读取一行文本中的数据，返回的字符串是不包含换行符的
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭资源
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //需求：使用BufferedReader和BufferedWriter实现文本文件的复制
    @Test
    public void test2() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //1.创建
            File file1 = new File("hello.txt");
            File file2 = new File("hello_copy2.txt");
            bufferedReader = new BufferedReader(new FileReader(file1));
            bufferedWriter = new BufferedWriter(new FileWriter(file2));
            //2.读写
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();//换行操作
            //    bufferedWriter.flush();//刷新的方法，每当调用此方法时，就会主动的将内存中的数据写出到磁盘文件中
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
