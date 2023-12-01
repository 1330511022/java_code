package chapter03_extends02;

public abstract class schoolmember {            //定义大类（学校成员） 为父类
	private String personName;					
	private String personGender;
	private String personAge;
	private String personId;
	
	public String introduce() {  //定义一个函数方法 作用是做自我介绍
		return "大家好，我是"+this.personName+",我的代号是："+this.personId+",";
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonGender() {
		return personGender;
	}
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}
	public String getPersonAge() {
		return personAge;
	}
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public schoolmember() {
		System.out.println("我是父类构造函数1");
	}
	public abstract/*当‘抽象的’翻译  */ void sayMyinfo();
	
}
