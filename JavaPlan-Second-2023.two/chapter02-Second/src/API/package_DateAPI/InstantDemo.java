package API.package_DateAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class InstantDemo {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Instance对象中当前时间为："+now);  // 2023-08-13T06:49:47.332187800Z
        Date date = Date.from(now);
        System.out.println("Instance对象转换为Date对象后时间为："+date);    // Sun Aug 13 14:49:47 CST 2023
        now = date.toInstant();
        System.out.println("Date对象转换为Instance时间为："+now);    // 2023-08-13T06:49:47.332Z
        System.out.println("修改Instance默认时区得到时间为："+now.atZone(ZoneId.systemDefault()));  // 2023-08-13T14:49:47.332+08:00[Asia/Shanghai]
    }
}
