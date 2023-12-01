package chapter03;

public class Student {  //定义Sudent类
	String stu_Id;
	String stu_Name;
	String stu_Gender;
	int stu_Age;
	private String stu_Tel;//定义私有属性
	//对私有属性进行封装：写两个public函数（方法） 1，用于给stuTel赋值   2，用于读取stuTel的值
	//1、给stuTel赋值
	public void setStu_Tel(String tel){    //set--->当“设置”讲 
		this.stu_Tel=tel;                  
	}
	//2、读取stuTel的值     // 输出用法
	public String getStu_Tel() {         ////get--->当“获取”讲   
		return this.stu_Tel;
	}
	//输出（函数方法）
	String speak() {            //利用函数方法
		return "你好，我是"+this.stu_Name+",今年"+this.stu_Age+"岁"+"，我的电话号码是";  //this——>当前的对象
	}
}
