package chapter03_extendsWork;

public class ContractEmployee extends Employees {//链接子类和父类 （建立父子关系）    
	public float monthSalary;   //定义正式员工月薪
    public float monus;			//定义正式员工奖金
    public float result;		//定义一个用于计算正式员工全部工资的”工具“（将 月薪 + 奖金 读取到result中）
		
    public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	public float getMonthSalary() {
            return monthSalary;
    }
    public void setMonthSalary(float monthSalary) {
            this.monthSalary = monthSalary;
    }
    public float getMonus() {
            return monus;
    }
    public void setMonus(float monus) {
            this.monus = monus;
    }
    @Override
    public void printSalary() {    ///用父类打印工资表示
            System.out.println("我的工资是："+this.result+"元");
    }
    public void introduce() {    //用父类自我介绍表示
            System.out.print("我是正式员工："+getEmployeeName()+"  ");
    }
}
