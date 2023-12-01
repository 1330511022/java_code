package chapter03_duotaiWork废弃;

public class employeeUP1 extends zong{
	public float employeemoney = 5000.3f;
	public float moneyUp =(float)(this.employeemoney*0.1+this.employeemoney);
	@Override
    public void changeSalary(){
        System.out.println("经过涨工资后，工资为："+this.moneyUp+"元");
    }
}
