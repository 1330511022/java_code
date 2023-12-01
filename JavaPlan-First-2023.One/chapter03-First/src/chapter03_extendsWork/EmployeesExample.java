package chapter03_extendsWork;

public class EmployeesExample {   //此程序为总体运行函数

	public static void main(String[] args) {
		ContractEmployee employee1 =  new ContractEmployee();   //搭建关于正式员工的对象1（employee1）
        employee1.setEmployeeName("张三");   //读取正式员工的值（姓名）
        employee1.setMonthSalary(100.3f);	//读取正式员工的值（月薪）
        employee1.setMonus(500.3f);			//读取正式员工的值（奖金）
        employee1.setResult(employee1.getMonthSalary()+employee1.getMonus());   //用于计算正式员工的总工资”工具“读取
        TempEmployee employee2 = new TempEmployee();   
        employee2.setEmployeeName("李四");		//搭建关于临时员工的对象2（employee2）
        employee2.setDateSalary(300f); 		 //读取临时员工的值（日薪）
        //输出程序 抽象函数运用
    employee1.introduce();
    employee1.printSalary();
    employee2.introduce();
    employee2.printSalary();
    
	}

}
