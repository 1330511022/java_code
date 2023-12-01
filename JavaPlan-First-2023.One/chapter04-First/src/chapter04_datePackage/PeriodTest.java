package chapter04_datePackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {
		LocalTime lt1 = LocalTime.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LocalTime lt2 = LocalTime.now();
		System.out.println("所耗费时间为：" + Duration.between(lt1, lt2).toMillis());
		LocalDate ld1 = LocalDate.of(2022, 1, 1);
		LocalDate ld2 = LocalDate.now();
		Period period = Period.between(ld1, ld2);
		System.out.println("相差" + period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "天");

	}

}
