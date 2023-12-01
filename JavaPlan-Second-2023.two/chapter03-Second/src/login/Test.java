package login;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入账号:");
        String s = scanner.next();
        System.out.print("请输入密码:");
        String s1 = scanner.next();
        LoginDemo loginDemo = new LoginDemo(s, s1);
        try {
            loginDemo.checklogin();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class LoginDemo {
    private String username;
    private String password;

    public LoginDemo() {
    }

    public LoginDemo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean checklogin() throws Exception {
        if (this.getUsername().equals("student") && this.getPassword().equals("12345")) {
            System.out.println("登录成功！");
            return true;
        } else {
            throw new Exception("输入错误");
        }
    }
}
