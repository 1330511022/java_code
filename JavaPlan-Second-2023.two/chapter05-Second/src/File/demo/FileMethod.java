package File.demo;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileMethod {
    /*
        获取文件或目录的信息：
        String getName()：返回文件或目录的名称。
        String getPath()：返回文件或目录的路径。
        String getAbsolutePath()：返回文件或目录的绝对路径。
        File getAbsoluteFile()：返回文件或目录的绝对路径表示的文件
        String getParent()：返回文件或目录的父目录的路径，若无，则返回null
        long lastModified()：返回文件或目录的最后修改时间。
        long length()：返回文件的大小。
*/
    @Test
    public void test1() { //相对路径
        File file1 = new File("File.txt");
        System.out.println(file1.getName());//返回文件或目录的名称
        System.out.println(file1.getPath());//返回文件或目录的路径
        System.out.println(file1.getAbsolutePath());//返回文件或目录的绝对路径
        System.out.println(file1.getAbsoluteFile().getParent());//返回文件或目录的绝对路径
        System.out.println(Arrays.toString(file1.list()));//返回目录下的所有文件和目录的名称
//        long lastModified()：返回文件或目录的最后修改时间。
//        long length()：返回文件的大小。
        System.out.println(file1.lastModified()); //返回一个时间戳
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(file1.lastModified());
        String format = df.format(date);
        System.out.println(format);
        System.out.println(file1.length());

    }

    @Test
    public void test2() {//绝对路径
        File file2 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\fl.txt");
        System.out.println(file2.getName());//返回文件或目录的名称
        System.out.println(file2.getPath());//返回文件或目录的路径
        System.out.println(file2.getAbsolutePath());//返回文件或目录的绝对路径
        System.out.println(file2.getAbsoluteFile().getParent());//返回文件或目录的绝对路径
        System.out.println(Arrays.toString(file2.list()));//返回目录下的所有文件和目录的名称
//        long lastModified()：返回文件或目录的最后修改时间。
//        long length()：返回文件的大小。
        System.out.println(file2.lastModified()); //返回一个时间戳
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(file2.lastModified());
        String format = df.format(date);
        System.out.println(format);
        System.out.println(file2.length());

    }


    @Test
    public void test3() {
//        String[] list()：返回目录下的所有文件和目录的名称。
        File file3 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo");
        String[] list = file3.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("**********************8");
//        File[] listFiles()：返回目录下的所有文件和目录的File对象
        File[] list1 = file3.listFiles();
        for (File s : list1) {
            System.out.println(s);
            System.out.println(s.getName());
        }

    }

    @Test
    public void test4() {
//        文件或目录的重命名和移动：
//        boolean renameTo(File dest)：重命名文件或目录为指定的名称。
//        boolean renameTo(String destPath)：重命名文件或目录为指定的路径。
//        boolean setLastModified(long time)：设置文件或目录的最后修改时间。
//        boolean setReadOnly()：设置文件或目录为只读。
        /*
        * 举例：
file4.renameTo(file5):想要次方法执行完，返回ture，要求：
*           file4必须存在，file5必须不存在
        * */
        File file4 = new File("File.txt");
        File file5 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\fl1.txt");

        boolean rename = file4.renameTo(file5);
        System.out.println(rename ? "重命名成功！" : "重命名失败！");


    }

    @Test
    public void test5() {
//        判断文件或目录的属性：
//        boolean exists()：判断文件或目录是否存在。
//        boolean isFile()：判断是否为文件。
//        boolean isDirectory()：判断是否为目录。
//        boolean isHidden()：判断文件或目录是否隐藏。
//        boolean canRead():判断是否可读
//        boolean canWrite():判断是否可写
//        boolean canHidden():判断是否隐藏
        File file5 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\fl1.txt");
        System.out.println(file5.exists());
        System.out.println(file5.isFile());
        System.out.println(file5.isDirectory());
        System.out.println(file5.isHidden());
        System.out.println(file5.canRead());
        System.out.println(file5.canWrite());

        File file6 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo");
        System.out.println(file6.exists());
        System.out.println(file6.isFile());
        System.out.println(file6.isDirectory());
        System.out.println(file6.isHidden());
        System.out.println(file6.canRead());
        System.out.println(file6.canWrite());
    }

    @Test
    public void test6() throws IOException {
//        创建文件或目录：
//        boolean createNewFile()：创建一个新文件，如果文件已存在则返回false。
//        boolean mkdir()：创建一个新目录，如果目录已存在则返回false。
//        boolean mkdirs()：创建一个新目录，包括创建必要的父目录。
//        删除文件或目录：
//        boolean delete()：删除文件或目录，如果删除成功返回true，否则返回false。
//        void deleteOnExit()：在JVM退出时删除文件或目录。
        File file6 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo");
        if (!file6.exists()) {
            System.out.println(file6.createNewFile());
        } else {
            System.out.println("文件存在！");
        }
        System.out.println(file6.mkdir());
        System.out.println(file6.mkdirs());
        System.out.println(file6.delete());

    }

    public void test7() throws IOException {
//        创建文件或目录：
//        boolean createNewFile()：创建一个新文件，如果文件已存在则返回false。
//        boolean mkdir()：创建一个新目录，如果目录已存在则返回false。
//        boolean mkdirs()：创建一个新目录，包括创建必要的父目录。
//        删除文件或目录：
//        boolean delete()：删除文件或目录，如果删除成功返回true，否则返回false。
//        void deleteOnExit()：在JVM退出时删除文件或目录。
        File file7 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\File");
        //前提：FileandIo存在 File目录不存在 方可创建
        System.out.println(file7.mkdir());
        File file8 = new File("C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\File\\Fff");
        //mkdir()方法如果上层目录File不存在 就无法创建Fff
        System.out.println(file8.mkdirs());
        // //mkdirs()方法会创建所需父系目录


    }
}