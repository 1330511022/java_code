package chapter02;

import java.util.Scanner;
                                      
public class JichuDemo01 {

	public static void main(String[] args) {            /*三个数最大值课题*///三元运算符
		// TODO Auto-generated method stub
		int a,b,c,max;
		Scanner in = new Scanner(System.in);
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
	
		max= a>b? a:b;
		max= max>c? max:c;
		// 或者 max=(a>b? a:b)>c? (a>b? a:b):c;
		System.out.println("max="+max);

	}

}
