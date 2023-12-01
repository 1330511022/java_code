package chapter02;

public class ForDemo01 {                                  // for循环
	public static void main(String[] args) {             // 计算1000以内的偶数和和奇数和
		int sum1 = 0, sum2 = 0;

		for (int a = 0; a <= 1000; a++) {
			if (a % 2 == 1) {   //a%2==1(奇数)
				sum1 += a;
			} else {       //a%2==2(偶数)
				sum2 += a;
			}
		}
		System.out.println("奇数和为：" + sum1);
		System.out.println("偶数和为：" + sum2);
	}
}
