package chapter03_interface01;

public class Triangle implements CalcArea, CalcGirth {
	@Override
	public float getGirth(float[] sideLength) {
		float sum = 0;
		for(int i=0;i<3;i++) {
			sum+=sideLength[i];
		}
		return sum;
	}
	@Override
	public float getArea(float[] sideLength) {
		float result = 0;
		float s = 0;
		s = sideLength[0]*sideLength[1];
		result = s *0.5f;
		return result;
	}
}
