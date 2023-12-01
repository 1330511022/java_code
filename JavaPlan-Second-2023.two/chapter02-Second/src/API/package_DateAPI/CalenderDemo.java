package API.package_DateAPI;

import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR)+"年");
        System.out.println(cal.get(Calendar.MONTH)+1+"月");
        System.out.println(cal.get(Calendar.DATE)+"日");
//        System.out.println("这周的第几天："+cal.get(Calendar.DAY_OF_WEEK));

        cal.add(Calendar.MONTH,2);
    }
}
