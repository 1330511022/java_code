package chapter02;

import java.util.Scanner;          //for循环
                                 //利用for循环设计由用户所定的直角三角形行数
public class ForDemo03 {

	public static void main(String[] args) { 
		System.out.print("请您输入直角三角形的行数 ：");
		int row01; //定义行数
		Scanner in = new Scanner(System.in);
		row01=in.nextInt();
		for (int row = 1; row<=row01; row++) {  //大循环
			
			for (int a = 1; a <= row; a++) {   //小循环
				   System.out.print("*");
				   
			}
			System.out.println();
		}
	}
}
