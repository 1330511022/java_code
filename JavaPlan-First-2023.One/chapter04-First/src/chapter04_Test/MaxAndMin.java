package chapter04_Test;

public class MaxAndMin {
	public int getMaxOfArr(int[] arr) {
		int max = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { 
				max = arr[i];
			}
		}
		return max;
	}

	public int getMinOfArr(int[] arr) {
		int min = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) { 
				min = arr[i];
			}
		}
		return min;
	}
}
