package File.demo;

import org.junit.Test;

import java.io.File;

public class FileUseTest {
    @Test
    public void test() {
        //public File(String pathname)  以pathname为路径创建File对象，可以是绝对路径或者相对路径
        File file1 = new File("File类与IO流");//相对路径
        File file2 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo.txt");//绝对路径
        System.out.println(file2.getAbsolutePath());

    }
    @Test
    public void test1() {
        //public File(String parent,String child) 以parent为父路径，child为子路径创建File对象
        File file1 = new File("C:\\Users\\22222222222222222222\\Desktop", "FileandIo.txt");
        File file2 = new File("IO", "IO.txt");
        System.out.println(file2.getAbsolutePath());

        //public File(File parent,String child) 根据一个父File对象和子文件路径创建File对象
        File file3 = new File(file2, "IO.txt");


    }
}

