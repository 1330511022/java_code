package chapter02;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// 声明一个整型数组a,包含100个元素
		int[] a = new int[100];
		// 打印数组中第0个元素
		System.out.print(a[0]);
		// 将第99个元素赋值为550
		a[99] = 550;
		// 将第200个元素赋值为220；报错
		// a[200]=220;
		// 将a数组中每个元素赋值为101-200
		for (int index = 0; index < 100; index++) {
			a[index] = index + 101;
		}
		// 打印数组数据--数组遍历（读取数组中的每个值）
		for (int index = 0; index < 100; index++) {
			System.out.println("第" + (index + 1) + "个元素是" + a[index]);
		}

	}

}
