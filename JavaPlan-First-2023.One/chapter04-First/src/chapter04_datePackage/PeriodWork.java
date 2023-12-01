//通过Period对象，计算现在到毕业还有几年几月几日
package chapter04_datePackage;
import java.time.LocalDate;
import java.time.Period;
public class PeriodWork {
	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.of(2025, 6, 15);
		LocalDate ld2 = LocalDate.now();
		System.out.println("当前日期是："+ld2);
		Period period = Period.between(ld2, ld1);
		System.out.println("距离毕业还有：" + period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "天");
	}

}
