package IO.charstreampackage.charstreamproject;

import java.io.IOException;
import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args)  {
        int i = 1;
        while (true) {
            login login = new login();
            System.out.println("请你输入账号密码(回车键输入密码)");
            Scanner in = new Scanner(System.in);
            login.setUsername(in.next());
            login.setPassword(in.next());
            if (login.check() == true) {
                try {
                    login.FileSpeak(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("登录成功！");
                break;
            } else {
                try {
                    login.FileSpeak(i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                i++;
                System.out.println("输入错误！");
            }

        }
    }
}
