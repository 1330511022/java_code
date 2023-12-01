package API.package_MathAPI;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) throws ParseException {
        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat nf3 = NumberFormat.getInstance();
        NumberFormat nf4 = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(nf1.format(12.34));
        System.out.println(nf2.format(12.34));
        System.out.println(nf3.format(1099123));
        System.out.println(nf4.format(1099123));
        // nf3和nf4可以使用parse()方法转换字符串为数值，nf1和nf2不可以使用parse()方法,nf1和nf2是货币格式
        System.out.println(nf3.parse("123.45"));
    }

}
