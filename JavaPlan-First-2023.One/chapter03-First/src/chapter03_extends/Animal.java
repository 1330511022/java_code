/*
 * 类和对象的关系 ：在我自己的理解之下 类和对象的关系是包含和被包含的关系
例：哈士奇——>狗———>动物类<—— 猫<—— 布偶猫    	
	继承
什么是继承呢
比如说 我们给动物类 定义相关的属性 比如说年龄 毛发颜色
那么狗和猫作为动物类的下类 他们就会”继承“ 我们之前给动物类所定义出的相关属性
动物类是大类 狗 和 猫 是小类 那在狗中的哈士奇就是小小类
但是我们把它说的浅一点的话 我们可以把哈士奇看作对象
那么 我们定义起来就很简单了          
*/
package chapter03_extends;

public class Animal {             //父子级继承关系DEMO 
	private String gender;
	private int age;
	private String color;
	private String voice;
	private String dogname;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public String getDogname() {
		return dogname;
	}
	public void setDogname(String dogname) {
		this.dogname = dogname;
	}
	
	public void run(String address) {         //定义函数方法 run
		System.out.print(this.dogname+"跑到了"+address);
	}
}
