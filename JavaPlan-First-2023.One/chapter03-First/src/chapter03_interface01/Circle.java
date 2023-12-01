package chapter03_interface01;

public class Circle implements CalcArea, CalcGirth {
	@Override
	public float getGirth(float[] sideLength) {
		float radius = sideLength[0];
		return 2*PI*radius;
	}
	@Override
	public float getArea(float[] sideLength) {
		float radius = sideLength[0];
		return radius*PI*radius;
	}

}
