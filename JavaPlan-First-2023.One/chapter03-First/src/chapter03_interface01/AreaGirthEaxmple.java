package chapter03_interface01;

public class AreaGirthEaxmple {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		float[] side = new float[] {3,4,5};
		System.out.println("三角形的周长为："+t1.getGirth(side));
		System.out.println("三角形的面积为："+t1.getArea(side));
		Circle c1 = new Circle();
		float [] radius = new float[] {2.5f};
		System.out.println("圆的周长为："+c1.getGirth(radius));
		System.out.println("圆的面积为："+c1.getArea(radius));
		Square s1 = new Square();
		float [] Square_l =new float[] {3,4};
		System.out.println("矩形的周长为；"+s1.getGirth(Square_l));
		System.out.println("矩形的面积为；"+s1.getArea(Square_l));
	}
}
