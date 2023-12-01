package API.package_DateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarWork {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        System.out.println("今天是："+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日");
        cal.add(Calendar.DATE,100);
        System.out.print("100天后时间为：");
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String date1 = df.format(cal.getTime());
        df.parse(date1);
        System.out.println(date1);

    }

}
