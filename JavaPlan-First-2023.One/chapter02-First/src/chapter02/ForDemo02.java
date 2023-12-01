package chapter02;

public class ForDemo02 {                               //for循环
                                                       // 利用for循环排列1000以内的数字
	public static void main(String[] args) {
		for (int a = 1; a < 1001; a++) {
			if (a <10) {
				System.out.print("000" + a + " ");
			} else if (a <100) {
				System.out.print("00" + a + " ");
			} else if(a<1000 ){
				System.out.print("0" + a + " ");
			}else if(a>=1000)
				System.out.print(a + " ");
		if (a % 10 == 0) {
			System.out.println(" ");
		}
	}
}
}
