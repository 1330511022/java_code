package chapter02;

import java.util.Scanner; //单步跟踪在右上角（open Perspective）中选择debug进行使用 
                          /* 单步跟踪可断点执行程序 右侧执行内存分配可视化 */
                          /* 单步跟踪要在可输出语句序列部点击（可产生蓝色小点）*/
public class SwitchDemo01 {

	public static void main(String[] args) {                       //switch判断成绩abcde
		// TODO Auto-generated method stub
		float score=0;                               //给予成绩初始值=0
		System.out.print("请输入一个成绩：");          //单步跟踪  （选择debug运行）---->step over运行
		Scanner in = new Scanner(System.in);
		try {
			score = in.nextFloat();                     /*异常处理*/
		}catch(Exception e) {
			System.out.println("您输入的数据有误！");
			return;//防止执行以下语句 返回程序
		}
		switch((int)(score * 0.1)/*取整（99——>9     87——>8）*/){
		    case 10:
		    case 9:System.out.println("等级为：A"); break;
		    case 8:System.out.println("等级为：B"); break;
		    case 7:System.out.println("等级为：C"); break;
		    case 6:System.out.println("等级为：D"); break;
		    case 5:  
		    case 4:
		    case 3:
		    case 2:
		    case 1:
		    case 0: System.out.println("等级为：E"); break;
		    default: System.out.println("出现错误！Error"); break;
		}

	}

}
