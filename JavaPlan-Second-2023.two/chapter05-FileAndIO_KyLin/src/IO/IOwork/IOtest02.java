package IO.IOwork;

import org.junit.jupiter.api.Test;

import java.io.*;

public class IOtest02 {
    @Test
    public void test1() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File("1.png");
            File file1 = new File("1_copy.png");
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("备份成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test2() {
        File file = new File("student.txt");
        File file1 = new File("student_copy.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);
            char[] chars = new char[10];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);
            }
            System.out.println("备份成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
