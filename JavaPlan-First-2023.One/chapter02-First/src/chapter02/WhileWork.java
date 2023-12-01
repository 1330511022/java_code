package chapter02;

import java.util.Scanner;    /*Math.random()可以生成0~1之间的随机数 那么如何生成0~100之间的随机数*/
                                                                         //while循环
public class WhileWork {      // 猜数游戏[0-100）的数
	public static void main(String[] args) {
		int a = 0, b;
		b = ((int) (Math.random() * 100));
		while (true) {
			System.out.print("请输入您要猜的数：");
			Scanner in = new Scanner(System.in);
			try {
				a = in.nextInt();      /* 异常处理 */
			} catch (Exception e) {
				System.out.println("您输入的数据有误！");
			}
			if (a == 100 || a > 100) {
				System.out.println("您输入的数有误！");    // 提示用户输入的数字有误
			} else if (a == b) {
				System.out.println("您猜对了！");
				return;    // 猜对返回 结束语句
			} else if (a < b) {
				System.out.println("您猜错了！   您猜的数低了！");
			} else if (a > b) {
				System.out.println("您猜错了！   您猜的数高了！");
			}
		}
	}
}
