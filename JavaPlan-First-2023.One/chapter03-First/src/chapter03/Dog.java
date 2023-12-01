package chapter03;
                                            //封装联系（Dog例子）
public class Dog {      
    private String dogName;
    private int dogAge;
    private String dogKind;
    private String dogColor;
    private float dogWeight;
    private String dogOwner;
    //快速且方便的方法生成读写器setter getter （右键————>Source————>Generate ...... Setters...）
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {       //利用if语句防止年龄出现问题，要求符合常理
		if(dogAge<0 || dogAge>20){
			System.out.println("输入的年龄不正确！");
		}
		else {
			this.dogAge = dogAge;
		}	
	}
	public String getDogKind() {
		return dogKind;
	}
	public void setDogKind(String dogKind) {
		this.dogKind = dogKind;
	}
	public String getDogColor() {
		return dogColor;
	}
	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}
	public float getDogWeight() {
		return dogWeight;
	}
	public void setDogWeight(float dogWeight) {
		this.dogWeight = dogWeight;
	}
	public String getDogOwner() {
		return dogOwner;
	}
	public void setDogOwner(String dogOwner) {
		this.dogOwner = dogOwner;
	}
	public String feed(String food) {
		return this.dogName+"小狗今天吃的是"+ food;
	}
	public String location(String location) {
		return this.dogName+"小狗今天去了"+ location;
	}
}
