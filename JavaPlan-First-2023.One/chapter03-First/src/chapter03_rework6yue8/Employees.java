package chapter03_rework6yue8;

public class Employees {
	private String name;
	private String addressString;
	private int workId;
	private float workSalary;
	private String workAgeString;

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public int getWorkId() {
		return workId;
	}

	public void setWorkId(int workId) {
		this.workId = workId;
	}

	public float getWorkSalary() {
		return workSalary;
	}

	public void setWorkSalary(float workSalary) {
		this.workSalary = workSalary;
	}

	public String getWorkAgeString() {
		return workAgeString;
	}

	public void setWorkAgeString(String workAgeString) {
		this.workAgeString = workAgeString;
	}

	public float changeSalary() {
		float changeSalary = workSalary * 1.1f;
		return changeSalary;

	}

}
