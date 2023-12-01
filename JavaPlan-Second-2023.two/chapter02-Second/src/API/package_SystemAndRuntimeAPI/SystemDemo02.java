package API.package_SystemAndRuntimeAPI;

import java.util.Date;

//- 获取当前时间戳
public class SystemDemo02 {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis()); // 与date.getTime()结果相同
    }

}
