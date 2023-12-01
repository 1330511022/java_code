package chapter03_interface01;

public class Square implements CalcGirth, CalcArea {

	@Override
	public float getArea(float[] sideLength) { 
		float result1;
		result1 = sideLength[0]*sideLength[1];
		return result1;
	}

	@Override
	public float getGirth(float[] sideLength) {
		float result;
		result = (sideLength[0]+sideLength[1])*2;
		return result;
	}
}
