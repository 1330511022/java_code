package chapter03_extends02;

public class Worker extends schoolmember {
	private float salary;
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	//覆盖 子类中必须实现（重写）父类中的抽象方法
	@Override
	public void sayMyinfo() {
		System.out.print("我是工人 我管理的是五公寓 我的工资是："+this.salary);
	}

}
