package chapter03_duotaiWork废弃;

public class Managers extends Employees2{
	private String managersgrade;
	public String EmployeeName;
	
	public String getManagersgrade() {
		return managersgrade;
	}
	public void setManagersgrade(String managersgrade) {
		this.managersgrade = managersgrade;
	}
	public void money2(zong UP) {
		System.out.print("经理"+this.EmployeeName);
		UP.changeSalary();
	}
}