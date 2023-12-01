package IO.bytestreampackage;

import java.io.*;

public class bytestreamDemo03 {
    public static void main(String[] args) throws IOException {
        for(int i=1; i<=100; i++){
            File src = new File("/home/kylin/imges/"+i+".bmp");
            System.out.println(src.getName());      // 获取文件名
            File desc = new File(System.getProperty("user.dir")+"/JavaPlan-Second-2023.two/chapter05-FileAndIO_KyLin/upload/" + src.getName());
            // 1. 读取原文件src
            FileInputStream fis = null;
            FileOutputStream fos = null;
            byte[] buff = new byte[1024];
            try {
                fis = new FileInputStream(src);
                fos = new FileOutputStream(desc);
                // 用while循环，读一个字节，向目标中写入一个字节
                while(true){
                    int len = fis.read(buff);
                    if(len==-1){
                        break;
                    }
                    fos.write(buff,0,len);
                }
                fos.flush();
                System.out.println("图片上传完毕！");
            } catch (FileNotFoundException e) {
                System.out.println("文件出现异常，请联系管理员！");
            }finally {
                fis.close();
                fos.close();
            }
        }
        // 2. 将读取到的文件写入目标desc
    }
}


