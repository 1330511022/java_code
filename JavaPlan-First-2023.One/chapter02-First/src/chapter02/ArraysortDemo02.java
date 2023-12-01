package chapter02;

import java.util.Arrays;
import java.util.Collections;

public class ArraysortDemo02 {               //数组降序排列
	public static void main(String[] args) {
		//定义数组num
		 /*注意！！！：使用 Collections.reverseOrder()作为Arrays.sort()方法参数时 
		  *          数组定义时的数据类型不能使用基本的数据类型，如果是int 要改成Integer 其他同理*/
		Integer[] num = { 38, 41, 87, 98, 41, 52, 49, 48, 96, 21, 36, 97, 53, 33, 41, 20, 100, 97, 57, 40, 100, 65, 29,
				55, 84, 33, 76, 71, 27, 23, 79, 68, 93, 36, 22, 39, 76, 28, 82, 43, 24, 61, 31, 90, 59, 67, 31, 100, 72,
				60, 50, 72, 100, 80, 54, 99, 73, 26, 37, 53, 26, 24, 90, 51, 67, 76, 79, 42, 44, 85, 70, 80, 31, 42, 77,
				38, 20, 64, 93, 65, 20, 61, 53, 54, 52, 47, 62, 58, 86, 78, 72, 67, 29, 67, 85, 32, 48, 53, 22, 38 };
		System.out.print("一共有" + num.length + "个数字:");
		displayArr(num);
		System.out.print("\n经过降序排序后为：");
		Arrays.sort(num, Collections.reverseOrder());//数组降序排序
		displayArr(num);
	}

	public static void displayArr(Integer[] arr) {  //设计函数方法减少代码冗余
		for (int s : arr) {
			System.out.print(s + " ");
		}
	}

}
