package File.exer;

import org.junit.Test;

import java.io.File;

//遍历指定文件目录下的所有文件的名称，包括子文件目录下的文件
//public void printFileName(File file)    //file可能是文件，也可能是文件目录
public class Exer02 {
    @Test
    public void test(){
        File file = new File("C:\\Users\\22222222222222222222\\Desktop");
        printFileName(file);


    }
    public void printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        }else if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                printFileName(file1);  //递归
            }

        }



    }
}
