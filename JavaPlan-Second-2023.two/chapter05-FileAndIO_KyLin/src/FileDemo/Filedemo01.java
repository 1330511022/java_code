package FileDemo;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Filedemo01 {
    @Test
    public void test1() {
        File file = new File("/home/kylin/doc/b.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void test2() {
        File file = new File("/home/kylin/doc/b.txt");
        if (file.exists()) {
            System.out.println(file.delete());
        }
    }

    @Test
    public void test3() {
        File file = new File("/home/kylin/doc");
        System.out.println(file.isFile());//文件？
        System.out.println(file.isDirectory());//目录？
    }

    @Test
    public void test4() {
        File file = new File("/home/kylin/ideaIC-2022.2.5.tar.gz");
        if (file.exists()) {
            System.out.println(file.length());
            file.lastModified();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(file.lastModified());
            String format = df.format(date);
            System.out.println(format);
        }
    }

    @Test
    public void test5() {
        File file = new File("/home/kylin/");
        String[] files = file.list();
        for (String s : files) {
            System.out.println(s);
        }
    }


}
