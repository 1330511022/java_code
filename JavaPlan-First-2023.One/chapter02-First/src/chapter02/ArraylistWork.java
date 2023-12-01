/*题目要求：
 * 编写程序，完成以下功能要求：
声明一个数组列表，用于存储班级同学的姓名。用户可以通过键盘输入姓名，保存到数组列表中。最
后输出所有学生的姓名及班级人数。
*/
package chapter02;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistWork {
	public static void main(String[] args) {
		ArrayList<String> classmates = new ArrayList<>(); //定义一个classmates的动态数组
		Scanner input = new Scanner(System.in); 
		System.out.print("请您输入同学姓名（ 按Enter继续输入或者输入exit结束）:");
		String name = input.next();
		//利用while循环使之实现反复键入同学姓名的操作
		while (!name.equals("exit")) { //翻译：如果输入的name不等于exit 继续进行循环 //.equals--->等同于== （判断输入的name是否等于字符串“exit”）
			classmates.add(name);              //添加元素---->classmates
			System.out.print("请您输入同学的姓名（按Enter继续输入或者输入exit结束）:");
			name = input.next();
		}
		System.out.print("该班级同学的姓名分别为：");
		//利用foreach方式输出班级同学的姓名(遍历数组)
		for (String n: classmates) {  
			System.out.print(n +" ");
		}
		System.out.println();
		System.out.println("该班级一共有"+classmates.size()+"名学生"); //输出
	}
	
}
