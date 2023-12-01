package API.package_DateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {

        String str = "2023-08-10";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = df.parse(str);
        System.out.println(date1.toString());
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy----MM----dd");
        String str1 = df1.format(date1);
        System.out.println(str1);
    }
}
