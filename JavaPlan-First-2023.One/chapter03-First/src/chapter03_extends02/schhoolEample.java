package chapter03_extends02;

public class schhoolEample {

	public static void main(String[] args) {
		Student student1 = new Student();
		Teacher teacher1 = new Teacher();
		Worker worker1 = new Worker();
		student1.setPersonAge("19");
		student1.setPersonGender("男");
		student1.setPersonId("220431501");
		student1.setPersonName("马卓");
		teacher1.setPersonAge("30");
		teacher1.setPersonGender("男");
		teacher1.setPersonId("789466");
		teacher1.setPersonName("张三");
		
		teacher1.setSalary(5000.4f);
		worker1.setSalary(5000f);
		student1.setScore(150.25f);
		System.out.println(teacher1.sayMySalary());
		System.out.println(student1.sayMyScore());
		worker1.sayMyinfo();    //BUG
	}

}
