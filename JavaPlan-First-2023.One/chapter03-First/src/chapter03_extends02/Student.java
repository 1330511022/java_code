package chapter03_extends02;

public class Student extends schoolmember{
	private float score;

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	public String sayMyScore() {
		return super.introduce()+"我的成绩是："+this.score+"分";
	}
	public Student() {
		super();
		System.out.println("我是子类Student构造函数");
	}

	@Override
	public void sayMyinfo() {
		System.out.print("我是学生  我的成绩是："+this.score);
		
	}

}
