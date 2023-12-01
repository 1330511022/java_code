package chapter03_Polymorphism;

public class CalcExample {

	public static void main(String[] args) {
		System.out.println(Calc.add(34, 21));
		System.out.println(Calc.add(new int[] {12,34,45,43,55,45,34,43}));
	}
}
