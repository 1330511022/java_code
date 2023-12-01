package chapter04_StringPackage;

import java.util.Scanner;

public class apiWork {

	public static void main(String[] args) {
		String a;
		System.out.println("请输入您的Email地址:(例：1330511022@qq.com)");
		Scanner in = new Scanner(System.in);
		a = in.next();
		String[] strArr = a.split("@");
		String strA = a.substring(a.indexOf('@') + 1);
		if (a.indexOf('@') == 0 || a.indexOf('@') == -1) {
			System.out.print("您输入的Email地址有误！");
			System.out.print("请检查您是否输入了（@）！");
		} else if (strArr.length > 2) {
			System.out.print("您输入的Email地址有误！");
		}
		else if (strArr.length == 0) {
			System.out.print("您输入的Email地址有误！");
			
		} else if (strA.indexOf('@') == strA.length() - 1) {
			System.out.print("您输入的Email地址有误！");
			System.out.print("请检查您输入的（@）是否错误！");
		}

		else {
			System.out.println("输入正确！");
			System.out.println("用户名为：" + a.substring(0, a.indexOf('@')));
			System.out.println("域名为：" + a.substring(a.indexOf('@') + 1));
		}

	}

}
