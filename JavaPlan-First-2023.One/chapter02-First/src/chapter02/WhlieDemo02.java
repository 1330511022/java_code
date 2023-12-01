package chapter02;

import java.util.Scanner;

public class WhlieDemo02 {

	public static void main(String[] args) { //while循环  （输入a 当a=-1时跳出循环）
		// TODO Auto-generated method stub
		float a;
		System.out.print("请输入一个数：");
		Scanner in = new Scanner(System.in);
		a = in.nextFloat();
		while (a != -1) {
			System.out.println(a * 10);
			a = in.nextFloat();
		}
		System.out.print("程序结束！");
	}

}
