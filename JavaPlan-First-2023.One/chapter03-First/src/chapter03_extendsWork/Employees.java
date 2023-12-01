/*作业:
某公司员工有临时工和正式员工，两个类的属性和方法要求如下:
临时工TempEmployee:
 	属性: ID，姓名，性别，年龄，日薪,
方法:
	自我介绍introduce()，显示”我是临时工xxx (姓名)
	打印工资printSalary() (显示日薪)
正式员工ContractEmployee:
 	属性: ID，姓名，性别，年龄，月薪，奖金
方法:
	自我介绍introduce0)，显示”我是正式员工xxx (姓名)
	打印薪水printSalary() (显示月薪+奖金的值)
从以上属性中可以看出，两个类有共同的属性和方法，因此，需要创建父类。编写程序实现以下要求:
   1.创建父类Employees，将共同的属性 (ID，姓名，性别，年龄)作为父类的属性。两个抽象方法: introduce()
和printSalary()
   2.创建两个子类: TempEmployee和ContractEmployee，继承自父类Employees。并且实现父类的两人抽象方法
   3.分别创建两个子类的对象，为对象属性赋值，调用introduce()方法和printSalary()方法，显示个人介绍和自己的
工资。*/
package chapter03_extendsWork;

public abstract class Employees {    //定义父类总体
	private String employeeName;     //定义员工的姓名（属于共有属性）
    private String employeeId;		//定义员工的工号（属于共有属性）
    private String employeeAge;		//定义员工的年龄（属于共有属性）
    private String employeeGender;	//定义员工的性别（属于共有属性）
    
    public String getEmployeeName() {
            return employeeName;
    }
    public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
    }
    public String getEmployeeId() {
            return employeeId;
    }
    public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
    }
    public String getEmployeeAge() {
            return employeeAge;
    }
    public void setEmployeeAge(String employeeAge) {
            this.employeeAge = employeeAge;
    }
    public String getEmployeeGender() {
            return employeeGender;
    }
    public void setEmployeeGender(String employeeGender) {
            this.employeeGender = employeeGender;
    }
    public abstract void introduce();  //定义抽象函数（自我介绍 可在后子类中看到）
    public abstract void printSalary();   //定义抽象函数 （打印工资【正式员工{月薪+奖金}与临时员工{日薪}】）


}
