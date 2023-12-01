package demo;

import java.util.Scanner;

public class Exceptiondemo02 {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            System.out.print("请输入一个正整数：");
            Scanner in = new Scanner(System.in);
            try {
                n = in.nextInt();
                System.out.println(n);

            } catch (Exception e) {
                System.out.println("请重新输入！");
            }
        }
    }
}