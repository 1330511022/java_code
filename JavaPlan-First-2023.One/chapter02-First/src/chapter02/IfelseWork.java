package chapter02;

import java.util.Scanner;

public class IfelseWork {               

	public static void main(String[] args) {                       //多分支结构（商店打折问题）
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		double  yuan;
		System.out.print("请输入您所付的金额：");
		yuan=in.nextFloat();
		if(yuan<=0) {
			System.out.print("请您输入正确的金额！");		
		}
		else {
			if(yuan<50) 
			{
				yuan=yuan;	
			}
			else if(yuan<=100) {
				yuan=yuan*0.9;
			}
			else if (yuan>100){
			    	yuan =(yuan-100) * 0.8+100*0.9;
			 }
			System.out.println("您需要付款"+yuan+"元");	
			}		
	    }	
		}
		

	


