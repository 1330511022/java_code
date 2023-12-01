package chapter03_company;

public class Employee {
	private String empId;  //定义private 员工的工号
	private String empNameString; //定义 员工姓名
	private String empGenderString;  //定义 员工性别
	
	public static String companyName;    //static:静态的   定义公司名称
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpNameString() {
		return empNameString;
	}
	public void setEmpNameString(String empNameString) {
		this.empNameString = empNameString;
	}
	public String getEmpGenderString() {
		return empGenderString;
	}
	public void setEmpGenderString(String empGenderString) {
		this.empGenderString = empGenderString;	
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
