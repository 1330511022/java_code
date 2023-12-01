package package_Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//关于判断用户输入的邮箱地址判断
public class PatternWork {
    public static void main(String[] args) {
        System.out.print("请输入您的第一邮箱地址：");
        Scanner in = new Scanner(System.in);
        String email = in.next();
        Pattern compile = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
        Matcher m1 = compile.matcher(email);
        if (m1.matches()) {
            System.out.println("您输入的邮箱正确！");
        } else {
            System.out.println("您输入的邮箱不正确！ 请再次输入！");
            Scanner in1 = new Scanner(System.in);
            String email1 = in1.next();
            Pattern compile1 = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*");
            Matcher matcher1 = compile1.matcher(email1);
            while (!matcher1.matches()) {
                System.out.println("您输入的邮箱不正确！ 请再次输入！");
                Scanner in2 = new Scanner(System.in);
                String email3 = in2.next();
                Pattern compile3 = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*");
                Matcher matcher3 = compile3.matcher(email3);
                if (matcher3.matches()) {
                    System.out.println("您输入的邮箱正确！");
                    break;
                }
            }
        }

    }
}




