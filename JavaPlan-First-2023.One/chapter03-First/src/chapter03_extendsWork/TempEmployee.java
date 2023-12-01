package chapter03_extendsWork;

public class TempEmployee extends Employees {   //链接子类和父类 （建立父子关系）
	public float dateSalary;  //定义日薪

    public float getDateSalary() {
            return dateSalary;
    }
    public void setDateSalary(float dateSalary) {
            this.dateSalary = dateSalary;
    }
    @Override
    public void introduce() {    //用父类自我介绍表示
            System.out.print("我是临时工："+this.getEmployeeName()+"  ");
    }
    public void printSalary() {//    用父类打印日薪表示
            System.out.println("我的日薪是："+this.getDateSalary()+"元");
    }
}
