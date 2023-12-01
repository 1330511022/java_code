package IO.charstreampackage;

import org.junit.jupiter.api.Test;

import java.io.*;

public class charstreamDemo01 {
    @Test
    public void test1() throws IOException {
        FileReader fr = null;
        String str = "";
        try {
            // 创建字符输入流
            fr = new FileReader("employee.ini");
            while (true) {
                int n = fr.read();
                if (n == -1) {
                    break;
                }
                // System.out.print((char)n);
                str += (char) n;
            }
            System.out.println(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            fr.close();
        }
    }

    @Test
    public void test2() throws IOException {
        FileReader filereader = null;
        FileWriter fileWriter = null;
        try {
            File file = new File("employee.ini");
            File file1 = new File("employee.bak");
            filereader = new FileReader(file);
            fileWriter = new FileWriter(file1);
            char[] chars = new char[6];
            int len;
            while ((len = filereader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);
            }
            fileWriter.flush();
            for (char aChar : chars) {
                System.out.print(aChar);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            filereader.close();
            fileWriter.close();
        }
    }
}
