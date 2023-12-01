package IO.BufferStream;

import org.junit.Test;

import java.io.*;


//测试FileInputStream+FileOutputStream 与 BufferedInputStream+BufferedOutputStream 复制文件的效率
public class CopyFileTest {
    @Test
    public void testSpendTime(){
        long start = System.currentTimeMillis();//记录开始时间

        String src = "C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\video01.mp4";
        String dest = "C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\video03.mp4";
        //FileInputStream+FileOutputStream
        copyFileWithFileSteam(src,dest);

        long end = System.currentTimeMillis();//记录结束时间
        System.out.println("花费的时间为：" + (end - start));    //花费的时间为：391

    }


    @Test
    public void testSpendTime2(){
        long start = System.currentTimeMillis();//记录开始时间
        String src = "C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\video01.mp4";
        String dest = "C:\\Users\\22222222222222222222\\Desktop\\FileandIo\\video02.mp4";
        //BufferedInputStream+BufferedOutputStream
        copyFileWithBufferedSteam(src,dest);
        long end = System.currentTimeMillis();//记录结束时间
        System.out.println("花费的时间为：" + (end - start));  //花费的时间为：16

    }



    //测试 BufferedInputStream+BufferedOutputStream
    public void copyFileWithBufferedSteam(String src  ,String dest) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.创建相关的File类的对象
            File file = new File(src);
            File file2 = new File(dest);
            //2.创建相关字节流的对象、缓冲流
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3.数据的读写操作
            byte[] bytes = new byte[50];
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

    //    测试FileInputStream+FileOutputStream
    public void copyFileWithFileSteam(String src,String drt){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.创建相关的File类的对象
            File file = new File(src);
            File file2 = new File(drt);

            //2.创建相关字节流的对象
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file2);

            //3.数据的读写操作
            byte[]bytes = new byte[50];
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
