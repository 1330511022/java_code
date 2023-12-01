package chapter04_datePackage;

import java.time.LocalTime;

public class LocalTimeTest {
	public static void main(String[] args) {
		// LocalTime
		LocalTime time1 = LocalTime.of(20, 15, 45);
		System.out.println(time1.toString());
		LocalTime time2 = LocalTime.now(); // 获取当前时间
		System.out.println("当前时间为：" + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
		LocalTime time3 = LocalTime.parse("12:23:56");
		System.out.println("当前时间为：" + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
		LocalTime time4 = LocalTime.parse("13:45:20"); // 通过解析代表字符串创建
		System.out.println(time4);

	}
}
