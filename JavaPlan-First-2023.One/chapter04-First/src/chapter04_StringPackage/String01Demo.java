package chapter04_StringPackage;

public class String01Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = new String("hello");
		//s1==s2
		System.out.println(s1==s2);
		//s1.equal(s2)
		System.out.println(s1.equals(s2));
		String s3 = "hello,world,I like java";
		//打印s3的长度
		System.out.println(s3.length());
		//返回逗号的位置
		System.out.println(s3.indexOf(','));
		//截取逗号后面的字符串
		System.out.println(s3.substring(s3.indexOf(',')+1));
		//截取逗号前面的字符串
		System.out.println(s3.substring(0,s3.indexOf(',')));
		//获取最后一个字符
		System.out.println(s3.charAt(s3.length()-1));
		//将s3转换成大写字符串
		System.out.println(s3.toUpperCase());
		//使用split()方法，按照逗号将字符串分割为字符串数组strArr
		String[] strArr = s3.split(",");
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);

	}

}
