package chapter03_calc;
//类中定义add（）函数 能够实现两个整数的加法 浮点数的加法 字符串的加法
/*
 * 	add(int x,inty)
 * 	add(float x,float y)
 * 	add(String x ,String y)
 * 	add(int x, int y ,int z )
 * 
 */
public class MyCalc {
	public int add(int x, int y) {
		return x+y;
	}
	public float add(float x ,float y) {
		return x+y;
	}
	public String add(String x ,String y) {
		return x+y;
	}
	public int add(int x, int y ,int z ) {
		return x+y+z;
	}
}
