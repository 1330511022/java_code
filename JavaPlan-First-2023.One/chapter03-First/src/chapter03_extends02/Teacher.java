package chapter03_extends02;

public class Teacher extends schoolmember{
	private float salary;
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String sayMySalary() {
		return super.introduce()+"我的工资是："+this.salary+"元";
	}
	public Teacher() {
		super();
		System.out.println("我是子类Teacher构造函数");
	}

	@Override
	public void sayMyinfo() {
		System.out.print("我是老师"+getPersonName()+"我的工资是："+this.salary);
		
	}
}
