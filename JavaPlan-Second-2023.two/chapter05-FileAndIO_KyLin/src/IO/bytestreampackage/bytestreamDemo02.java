package IO.bytestreampackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestreamDemo02 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            System.out.println(System.getProperty("user.dir"));
            File src = new File("/home/kylin/imges/img8.jpg");
            System.out.println(src.getName());
            File file = new File(System.getProperty("user.dir") + "/JavaPlan-Second-2023.two/chapter05-FileAndIO_KyLin/upload/" + src.getName());
            fileInputStream = new FileInputStream(src);
            fileOutputStream = new FileOutputStream(file);
            byte[] bytes = new byte[(int) src.length()];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            fileOutputStream.flush();
            System.out.println("复制成功！");
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
}


