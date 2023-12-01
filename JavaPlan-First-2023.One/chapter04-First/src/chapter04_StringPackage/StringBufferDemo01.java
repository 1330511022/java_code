/*
		* 身份证号： 输入身份证号，输入出生日期（xxxx年xx月xx日），和性别 要求： （1）必须18位； （2）最后一位是数字或者是X；
		* （3）其他17位必须是数字；
		*/
package chapter04_StringPackage;

import java.util.Scanner;

public class StringBufferDemo01 {

	public static void main(String[] args) {

		StringBuilder cardId = new StringBuilder();
		Scanner in = new Scanner(System.in);
		System.out.print("请输入您的身份证号码：");
		cardId.append(in.next());
		for (int i = 0; i < cardId.length(); i++) {
			// System.out.print(cardId.charAt(i));
		}
		if (cardId.length() != 18) {
			System.out.print("您输入的身份证号长度有误！");
			return;
		}
		if ((cardId.charAt(17) < '0' || cardId.charAt(17) > '9') && cardId.charAt(17) != 'X') {
			System.out.println("身份证号最后一位不正确！");
			return;
		}
		System.out.println();
		System.out.println("出生日期为：" + cardId.substring(6, 10) + "年" + cardId.substring(10, 12) + "月"
				+ cardId.substring(12, 14) + "日");
		if ((int) (cardId.charAt(17)) % 2 == 0) {
			System.out.println("性别为女");
		} else {
			System.out.println("性别为男");
		}

	}

}
