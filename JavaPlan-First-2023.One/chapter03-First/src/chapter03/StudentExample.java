package chapter03;

public class StudentExample {

	public static void main(String[] args) {
		Student stu1 = new Student();      //创建Student的对象stu1
		stu1.stu_Id = "220431501";
		stu1.stu_Age = 19;
		stu1.stu_Gender = "男";
		stu1.stu_Name = "马卓";
		stu1.setStu_Tel("15445434545");//因TEL为私有，所以要调用函数来给Tel赋值
		//输出
		System.out.println(stu1.speak()+":"+stu1.getStu_Tel());
		
		Student stu2 = new Student();          //创建Student的对象stu1 
		stu2.stu_Id = "22043131502";
		stu2.stu_Age = 19;
		stu2.stu_Gender = "男";
		stu2.stu_Name = "张三";
		stu2.setStu_Tel("15123454354");
		//输出 
		System.out.print(stu2.speak()+":"+stu2.getStu_Tel());	
	}

}
