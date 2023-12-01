package IO.FileStream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
    //需求：读取hello.txt，显示在控制台上
    //异常使用throws的方式处理，不太合适（如果程序运行出现异常，不会执行close()方法关闭流 因此使用try-catch-finally解决）
    @Test
    public void test1() throws IOException {
        FileReader fileReader = null;
        try {
            //1.创建一个File类对象 对应hello.txt文件
            File file = new File("hello.txt");
            //2.创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);
            //3.读取数据，并显示在控制台上
//        //方式一：
//              int data = fileReader.read();   //返回值是一个int类型，当返回为-1时，代表已经读取结束
//        while (data!=-1){
//            System.out.print((char) data);
//            data = fileReader.read();
//        }
            //方式二：
            int data;
            while ((data = fileReader.read()) != 1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            //4.流资源的关闭操作（必须要关闭，否则会内存泄露）

            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //进行优化，每次读取多个字符存放到字符数组中，提高效率
    @Test
    public void test2() throws IOException {
        FileReader fileReader = null;
        try {
            File file = new File("hello.txt");
            fileReader = new FileReader(file);
            char[] chars = new char[5];
            int read;
            while ((read = fileReader.read(chars)) != -1) {
                for (int i = 0; i < read; i++) {
                    System.out.print(chars[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //需求：将内存中的数据写出到指定的文件中
    @Test
    public void test3() {
        FileWriter fileWriter = null;
        try {
            //1.创建File类对象，指出要写出的文件名称
            File file = new File("info.txt"); //文件会自动创建   //如果有文件 会进行文件覆盖（构造器问题）
            //2.创建输出流
            fileWriter = new FileWriter(file, true); //为true 文件内容追加   false 文件覆盖
            //3.写出的具体过程
            //输出的方法：write(String str ) /write(char[] cdata)
            fileWriter.write("I LOVE U!\n");
            fileWriter.write("U LOVE HIM!\n");
            fileWriter.write("太惨了\n");
            System.out.println("输出成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //需求：复制一份hello.txt文件，命名为hello_copy.txt文件
    @Test
    public void test4() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1.创建File类的对象
            File file = new File("hello.txt");
            File file1 = new File("hello_copy.txt");
            //2.创建输入流输出流
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);

            //3.数据的读入和写出
            char[] chars = new char[5];
            int len; //记录每次读入到chars中的字符的个数
            while ((len = fileReader.read(chars)) != -1) {
                //write(char[],int fromIndex,int len)
                fileWriter.write(chars, 0, len);
            }
            System.out.println("复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}