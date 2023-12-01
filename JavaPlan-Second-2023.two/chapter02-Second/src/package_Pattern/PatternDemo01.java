package package_Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo01 {
    public static void main(String[] args) {
        System.out.print("请输入您的账号：");
        Scanner in = new Scanner(System.in);
        String user1= in.next();
        if (Pattern.matches("abcd[0-9]Y", user1)){
            System.out.println("您输入的账号正确！");
        }else {
            System.out.println("您输入的账号错误！");
            return;
        }
        System.out.print("请输入您的密码：");
        Scanner vb = new Scanner(System.in);
        String userpass = vb.next();
        Pattern compile = Pattern.compile("abcd[0-9]Y");
        Matcher a1 = compile.matcher(userpass);
        if (a1.matches()){
            System.out.println("您输入的密码正确！");
        }else {
            System.out.println("您输入的密码错误！");
        }


    }
}
