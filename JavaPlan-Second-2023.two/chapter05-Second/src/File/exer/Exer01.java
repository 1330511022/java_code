package File.exer;

import org.junit.Test;

import java.io.File;

//判断指定文件目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
public class Exer01 {
    @Test
    public void test(){
        File file1 = new File("C:\\Users\\22222222222222222222\\Pictures");
        String[] list = file1.list();
        for (String s : list) {
            if (s.endsWith(".jpg")){
                System.out.println(s);
            }

        }

    }
}
