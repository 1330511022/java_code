package demo;

import java.util.Scanner;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("请输入两个两个整数");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = a + b;
                if (a + b == c) {
                    System.out.println("输入正确");
                    System.out.println("结果为：" + c);
                    break;
                }
            } catch (Exception e) {
                System.out.println("请重新输入！！");
            }
        }
    }
}