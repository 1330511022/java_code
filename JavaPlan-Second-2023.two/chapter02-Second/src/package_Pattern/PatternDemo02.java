package package_Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo02 {
    public static void main(String[] args) {
        System.out.print("请输入您的手机号码：");
        Scanner in = new Scanner(System.in);
        String tel = in.next();
        Pattern compile = Pattern.compile("^1\\d{10}");
        Matcher m1 = compile.matcher(tel);
        if (m1.matches()){
            System.out.println("您输入的手机号正确！");
        }else {
            System.out.println("您输入的手机号不正确！");
        }

    }
}
