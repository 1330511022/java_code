package API.package_SystemAndRuntimeAPI;

import java.io.IOException;

//- exec()方法
public class RuntimeDemo02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        // 执行exec()方法后，会自动创建一个Process类的对象
        Process process = runtime.exec("gedit"); //在麒麟操作系统中（gedit）//在win系统中(notepad.exe)
        System.out.println(process.toString());
        System.out.println(process.toString().charAt(0));
        Thread.sleep(3000);
        // 关闭应用程序
        process.destroy();
    }
}
