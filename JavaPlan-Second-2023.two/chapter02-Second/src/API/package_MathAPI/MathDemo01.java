package API.package_MathAPI;

import java.util.Scanner;

public class MathDemo01 {
    public static void main(String[] args) {
        double a, b;
        System.out.print("请输入A和B的值：（用空格分割）");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        if (a > 0 && b > 0) {
            double c = Math.sin(a + b * 10);
            System.out.println(c);
        } else if (a < 0 && b < 0) {
            double c1 = Math.pow(a * b, 3);
            System.out.println(c1);
        } else {
            double c2 = Math.pow(a - b, 2);
            System.out.println(c2);
        }
    }

}

