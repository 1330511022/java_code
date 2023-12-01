package chapter03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UseraccountExample {
	public static void main(String[] args) {
		//以下两行（11、12行 为生成时间戳）
		LocalDateTime dateTime = LocalDateTime.now(); // get the current date and time 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		UserAccount user1 = new UserAccount();
		//赋值
		//利用setter 封装读取数值
		user1.setUserName("马卓");
		user1.setUserId("1231234545435886");
		user1.setUserTel("17320080198");                           //我写了好多bug 改不过来了 我裂开了
		user1.setDealTime(dateTime.format(formatter));
		user1.setCurrentBalance(5655.3141f);
		user1.setBankCardid("545454874134546");
		System.out.println("请输入您的操作：(1---->查询余额       2 --->存款        3 --->取款)");
		int[] caozuo = {1,2,3}; //定义数组来代指用户键入的操作
		int ShuRu; //键入操作
		Scanner in = new Scanner(System.in); 
		ShuRu=in.nextInt();
		if(ShuRu==caozuo[0]) {  //此步骤为查询余额 （caozuo[0]为数组第一个元素 1 为查询余额）
			System.out.println("您的余额为："+user1.getCurrentBalance()+"元"); //利用getter 封装输出当前余额
			System.out.print( "当前的时间为："+user1.getDealTime()); //输出时间戳
		}
		else if(ShuRu==caozuo[1]) { //此步骤为存款 （caozuo[1]为数组第一个元素 2 为存款）
			System.out.print("请输入您要存多少钱（单位：元）：");
			float cunkuan;    //定义一个浮点型变量  用于储存用户键入的存款数额
			Scanner in1 = new Scanner(System.in);
			cunkuan = in.nextFloat();
			user1.setDealAmount(cunkuan);   //利用setter封装读取数据（交易金额）
			System.out.println("交易金额为："+user1.getDealAmount()+"元");//利用getter 封装输出交易金额
			user1.setCurrentBalance(5655.3141f+cunkuan); //读取余额+交易金额的总和（当前余额）
			System.out.println("目前余额为："+user1.getCurrentBalance()+"元"); //利用getter 封装输出当前余额
			System.out.print("当前的时间为"+user1.getDealTime()); //输出时间戳
		}
		else if(ShuRu==caozuo[2]) {//此步骤为取款 （caozuo[2]为数组第一个元素 3 为存款）
			System.out.print("请输入您要取多少钱：");
			float cunkuan02; //定义一个浮点型变量用于储存用户键入的取款数额
			Scanner in2 = new Scanner(System.in);
			cunkuan02 = in.nextFloat();
			user1.setDealAmount(cunkuan02);  //利用setter封装读取取款数额（交易金额）
			System.out.println("交易金额为："+user1.getDealAmount());//利用getter封装输出交易金额
			user1.setCurrentBalance(5655.3141f-cunkuan02);//读取当前余额（原余额-取款金额）
			System.out.println("目前余额为："+user1.getCurrentBalance());//利用getter封装输出当前余额
			System.out.print("当前的时间为："+user1.getDealTime());	//输出时间戳
		}
		
	}

}
