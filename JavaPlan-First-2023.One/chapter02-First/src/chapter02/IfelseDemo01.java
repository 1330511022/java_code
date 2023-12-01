package chapter02;

import java.util.Scanner;

public class IfelseDemo01 {

	public static void main(String[] args) {        /*  多分支结构（曹操问题）*///if else
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		String dongFeng,guanYu;
		System.out.print("是否借来东风？，是输入Y，否输入N");
		dongFeng=in.next();
		if(dongFeng.equals("y")||dongFeng.equals("Y")){
			System.out.print("是否关羽守关？，是输入Y，否输入N");
		guanYu=in.next();
		if(guanYu.equals("y")||guanYu.equals("Y"))//或者if(guanYu.toUpperCase().equals("Y"))
		{
			System.out.print("曹操逃走！");
			
			
		}else
			System.out.print("曹操被擒！");
			
		}else	
		System.out.print("曹操获胜！");
	}

}
