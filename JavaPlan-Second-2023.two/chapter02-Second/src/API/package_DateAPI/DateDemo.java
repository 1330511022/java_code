package API.package_DateAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class DateDemo {
    public static void main(String[] args) {
//        Date date1 = new Date(0);
//        System.out.println(date1.toString());
//        Date date2 = new Date(1000);
//        System.out.println(date2.toString());
//        Date date3 = new Date();
//        System.out.println(date3.getTime());
//        Date date4 = new Date(123,8,10,23,59);
//        Date date5 = new Date();
//        long period = date4.getTime()-date5.getTime();
//        period = period / 1000;
//        System.out.println(period/(24*60*60));//天数
//        System.out.println((period/3600)%24);//小时数
//        System.out.println((period/60)%60);//分钟
//        System.out.println((period%60));//秒数

        // 通过LocalDateTime、Duration计算秒杀结束时间
        LocalDateTime start = LocalDateTime.now(); //目前本地时间
        LocalDateTime end = LocalDateTime.of(2023, 9, 10, 23, 59); //秒杀截止时间
        Duration dura = Duration.between(start, end);//计算两个时间的差
        Period peri = Period.between(start.toLocalDate(), end.toLocalDate());//计算两个日期之间的差
        System.out.println("天数：" + dura.toDays());
        System.out.println("小时：" + dura.toHours() % 24);
        System.out.println("分钟：" + dura.toMinutes() % 60);
        System.out.println("秒数：" + dura.toSeconds() % 60);
        // System.out.println(peri.getDays());


    }


}

