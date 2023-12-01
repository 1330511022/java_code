package chapter03_duotaiWork废弃;

public  class ManagerUP1 extends zong{
	public float Employeemoney = 5000.3f;
	public float moneyUp =(float)(this.Employeemoney*0.2+this.Employeemoney);
	@Override
    public void changeSalary(){
        System.out.println("经过涨工资后，工资为："+this.moneyUp+"元");
    }
}