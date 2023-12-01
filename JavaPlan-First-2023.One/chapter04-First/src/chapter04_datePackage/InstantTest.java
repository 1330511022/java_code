package chapter04_datePackage;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class InstantTest {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println("Instance对象中当前时间为：" + now);
		Date date = Date.from(now);
		System.out.println("Instance对象转换为Date对象后时间为：" + date);
		now = date.toInstant();
		System.out.println("Date对象转换为Instance时间为：" + now);
		System.out.println("修改Instance默认时区得到时间为：" + now.atZone(ZoneId.systemDefault()));
		
	}
}
