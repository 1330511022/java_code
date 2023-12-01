package IO.bytestreampackage;


import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BytestreamDemo {
    @Test
    public void test1() {
        String str1 = "姓名：张三，性别：男，年龄：19，成绩：90，入学日期：2022-9-10\n";
        String str2 = "姓名：李四，性别：女，年龄：19，成绩：95，入学日期：2022-9-9\n";
        File file = new File("/home/kylin/doc/student.txt");
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(str1.getBytes());
                fileOutputStream.write(str2.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }


        }

    }

    @Test
    public void test2() throws IOException {
        File file = new File("/home/kylin/doc/student.txt");
        InputStream inputStream = null;
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                int len;
                while ((len = inputStream.read(bytes)) != -1) {
                    inputStream.read(bytes, 0, len);
                    System.out.println(new String(bytes, StandardCharsets.UTF_8));
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                inputStream.close();
            }
        }

    }
}
