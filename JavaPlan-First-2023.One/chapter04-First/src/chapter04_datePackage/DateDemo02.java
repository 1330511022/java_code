package chapter04_datePackage;

import java.util.Calendar;

public class DateDemo02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2022);
		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DATE, 10);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));

		System.out.println(c.get(Calendar.YEAR));

		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, 2025);
		c1.set(Calendar.MONTH, 6);
		c1.set(Calendar.DATE, 15);

		System.out.println(c.getTime().getTime());
		System.out.println(c1.getTime().getTime());
		System.out.println();
	}

}
