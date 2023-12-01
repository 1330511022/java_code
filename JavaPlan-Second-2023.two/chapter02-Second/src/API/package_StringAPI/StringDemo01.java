package API.package_StringAPI;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
        String str = "a123";
        byte[] b = str.getBytes();

        for (byte n : b) {
            System.out.println(n);
        }
        byte[] arr = {65, 66, 49, 50, 51};
        String str2 = new String(arr);
        System.out.println(str2);


        System.out.println("请输入您的电话号码：");
        Scanner in = new Scanner(System.in);
        String tel = in.next();
        System.out.println(tel.startsWith("138") || tel.startsWith("139"));
        System.out.println(tel.startsWith("0", 3));

    }

}
