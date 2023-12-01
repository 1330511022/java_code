package chapter02;

import java.util.Arrays;

public class ArraysortDemo01 {       //数组升序排序

	public static void main(String[] args) {
		//定义一个整型数组
		int[] scores ={ 38, 41, 87, 98, 41, 52, 49, 48, 96, 21, 36, 97, 53, 33, 41, 20, 100, 97, 57, 40, 100,
				65, 29, 55, 84, 33, 76, 71, 27, 23, 79, 68, 93, 36, 22, 39, 76, 28, 82, 43, 24, 61, 31, 90, 59, 67, 31,
				100, 72, 60, 50, 72, 100, 80, 54, 99, 73, 26, 37, 53, 26, 24, 90, 51, 67, 76, 79, 42, 44, 85, 70, 80,
				31, 42, 77, 38, 20, 64, 93, 65, 20, 61, 53, 54, 52, 47, 62, 58, 86, 78, 72, 67, 29, 67, 85, 32, 48, 53,
				22, 38 };
		System.out.print("未经过排序的数为：");
		/*遍历数组的方式：1、通过循环来遍历数组   2、使用foreach的方式来遍历数组    3、利用函数来显示数组元素 */
		             //1、循环：
		/*for (int i = 0; i < scores.length; i++) {  
			System.out.print(scores[i] + " ");
		}*/
		            //2、foreach方式：
		for(int n: scores) {    //相对于循环更加简单的将数组遍历
			System.out.print(n+" ");     
		}
		System.out.println();
		System.out.println();
		           //3、函数方法显示
		System.out.println("函数方式显示数组测试：");
		 display(scores);
		 System.out.println();
		 System.out.println("测试结束：");
		System.out.println();
		System.out.println("分割线**************分割线");
		Arrays.sort(scores);     // 对数组进行排序（升序）
		System.out.print("经过排序的数为：");
		for(int n: scores) {    //同上 （利用foreach的方式）
			System.out.print(n+" ");
	}
		//为了减少代码冗余 我们可以通过定义函数来显示数组元素
		
	}
	static void display(int [] arr){
		for(int n : arr) {
			System.out.print(n+" ");
		}
		
	}

}
