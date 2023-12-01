package chapter04_datePackage;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		// 获取当前日期
		LocalDate ld1 = LocalDate.now();
		System.out.println("当前时间：" + ld1);

		// 获取指定的时间:入学日期
		LocalDate ld2 = LocalDate.of(2022, 9, 1);
		System.out.println("入学时间：" + ld2);
		// 加3年
		LocalDate ld3 = ld2.plusYears(3);
		// 加三月
		ld3 = ld3.plusMonths(2);
		System.out.println(ld3);
		System.out.println("毕业年份" + ld3.getYear() + "年");

		// 减3个月
		LocalDate ld4 = ld3.minusMonths(3);
		System.out.println("毕业年月" + ld4.getYear() + "年" + ld4.getMonthValue() + "月");

		// 获取年月日时分秒
		System.out.println("年" + ld1.getYear());
		System.out.println("月" + ld1.getMonthValue());
		System.out.println("日" + ld1.getDayOfMonth());

	}

}
