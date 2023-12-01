package chapter04_Test;

public class MaxAndMinTest {

	public static void main(String[] args) {
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 1000);
		}
		for (int b : num) {
			System.out.println(b);
		}
		MaxAndMin array = new MaxAndMin(); 
		int max = array.getMaxOfArr(num); 
		int min = array.getMinOfArr(num);
		System.out.println("数组中的最大值为：" + max + "数组中的最小值为：" + min); 
	}
}
