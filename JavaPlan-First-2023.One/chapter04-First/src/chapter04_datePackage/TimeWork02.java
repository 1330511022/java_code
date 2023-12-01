//在程序中设定商品秒杀结束时间，显示从当前时间开始，到秒杀结束还剩余的时间，显示出“日 时 分 秒”。例如：距离秒杀结束剩余时间：2天4时20分10秒。
package chapter04_datePackage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeWork02 {
    public static void main(String[] args) {
//		Date date1 = new Date(123,8,10,23,59);
//		Date date2 = new Date();
//		long period = date1.getTime()-date2.getTime();
//		period = period / 1000;
//		System.out.println(period/(24*60*60));//天数
//		System.out.println((period/3600)%24);//小时数
//		System.out.println((period/60)%60);//分钟
//		System.out.println((period%60));//秒数
        // 通过LocalDateTime、Duration计算秒杀结束时间

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.of(2023, 9, 10, 23, 59);
        Duration dura = Duration.between(start, end);
        Period peri = Period.between(start.toLocalDate(), end.toLocalDate());
        System.out.println("天数：" + dura.toDays());
        System.out.println("小时：" + dura.toHours() % 24);
        System.out.println("分钟：" + dura.toMinutes() % 60);
        System.out.println("秒数：" + dura.toSeconds() % 60);
        // System.out.println(peri.getDays());


    }

}
