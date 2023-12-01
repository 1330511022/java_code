package chapter02;

import java.util.Scanner;

public class ForWork {
	
	public static void main(String[] args) {                              //for循环嵌套
																		  //利用for循环生成由用户决定行数的等腰三角形
		System.out.print("请您输入等腰三角形的行数 ：");
		int row01;                       //定义用户要求等腰三角形行数                                       
		Scanner in = new Scanner(System.in);
		row01 = in.nextInt();
		for (int row = 1; row <= row01; row++) {          //实际行数row    由row01决定     
			for (int a = 1; a <= row01-row; a++) {       //a------>控制空格的数量              若row01为5  则a为4 （4个空格）		                                            
				System.out.print(" ");
			}
			for (int q = 1; q <= row*2-1; q++) {          //q------->控制✳的数量             ✳的数量<=实际行数*2-1
				System.out.print("*");
			}
			System.out.println();
		}
	}
}