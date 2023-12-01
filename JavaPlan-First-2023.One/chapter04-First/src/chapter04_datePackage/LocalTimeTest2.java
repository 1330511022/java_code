package chapter04_datePackage;

import java.time.LocalTime;

public class LocalTimeTest2 {

	public static void main(String[] args) {

		LocalTime time2 = LocalTime.now();
		System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
		while (true) {
			try {
				Thread.sleep(1000);
				time2 = LocalTime.now();
				System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
