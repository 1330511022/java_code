package chapter03_rework6yue8;

public class Example {

	public static void main(String[] args) {
		Employees emp1 = new Employees();
        emp1.setNameString("张三");
        emp1.setWorkSalary(5000f);
        System.out.println("员工" + emp1.getNameString() + "基本工资为：" + emp1.getWorkSalary() + "元,涨薪后的工资为：" + emp1.changeSalary()+ "元");
        
        
        Managers man1 = new Managers();
        man1.setNameString("李四");
        man1.setWorkSalary(7000f);
        System.out.println("经理" + man1.getNameString() + "基本工资为：" + man1.getWorkSalary() + "元,涨薪后的工资为：" +man1.changeSalary()+ "元");
	}

}


