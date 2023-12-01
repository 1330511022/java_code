package chapter03_calc;

public class TestCalc {

	public static void main(String[] args) {
		MyCalc myCalc =new MyCalc();
		System.out.println(myCalc.add(12345, 98765));//int类型
		System.out.println(myCalc.add("abc","def"));//字符串
		System.out.println(myCalc.add(12345, 98765.678f));//浮点型
		
	}

}
