package chapter03_Polymorphism;

public class Calc {
	
	public static int add(int x,int y) {
		return x+y;
	}
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	public static int add(int x ,int y ,int z ,int m ) {
		return x+y+z+m;
	}
	public static float add(float x ,float y){
		return x+y;
	}
	public static int add(int[]arr) {
		int sum =0;
		for(int n: arr) {
			sum+=n;
		}
		return sum;
	}
}
