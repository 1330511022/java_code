/*   this： 类中this指的是当前被创建的对象
 * 	 static:静态的
 * 	 类中声明的静态的属性，可以直接被类调用，也可以被对象调用
 * 	 类中声明的static的属性不属于任何一个对象，存在于类空间中，
 * 	 所有对象共用该属性 存放的是最后一次修改的结果	
 */
package chapter03_company;

public class TestEmployee {

	public static void main(String[] args) {
	Employee emp1 = new Employee();
		emp1.setEmpId("1001");
		emp1.setEmpNameString("张三");
		emp1.setEmpGenderString("男");
		emp1.setCompanyName("IBM");
		
		Employee emp2 = new Employee();
		emp2.setEmpId("1002");
		emp2.setEmpNameString("李四");
		emp2.setEmpGenderString("女");
		emp2.setCompanyName("SUN");
		
		Employee emp3 = new Employee();
		emp3.setEmpId("1003");
		emp3.setEmpNameString("王麻子");
		emp3.setEmpGenderString("男");
		emp3.setCompanyName("DemalE");
		
		Employee.companyName="微软";
		System.out.println(emp1.getCompanyName());
		System.out.println(emp2.getCompanyName());
		System.out.println(emp3.getCompanyName());
		
	}

}
