package chapter04_datePackage;

import java.util.Date;

public class DateDemo01 {

	public static void main(String[] args) {
		// 在寄快递时，每个快递都会生成一个唯一的单号。请编写程序，模拟生成快递单号。使用年月日时分秒与一个随机的4位数拼接形成快递单号
		System.out.println("生成随机数："+(int) (Math.random() * 9000 + 1000));
		Date myDate = new Date();
		System.out.println(/*"生成年："*/myDate.getYear() + 1900);
		System.out.println("生成时："+myDate.getHours());
		System.out.println("生成分："+myDate.getMinutes());
		System.out.println("生成秒："+myDate.getSeconds());
		System.out.println("分割线*********************分割线");
		StringBuffer danhao = new StringBuffer();
		danhao.append((int) (Math.random() * 9000 + 1000));
		danhao.append(myDate.getYear() + 1900); // 年
		danhao.append(myDate.getMonth() + 1);// 月
		danhao.append(myDate.getDate());// 日
		danhao.append(myDate.getHours());// 时
		danhao.append(myDate.getMinutes());// 分
		danhao.append(myDate.getSeconds());// 秒
		System.out.println("快递单号为：" + danhao);
	}

}
