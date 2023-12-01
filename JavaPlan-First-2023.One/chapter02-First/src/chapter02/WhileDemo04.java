package chapter02;

public class WhileDemo04 {                                    //利用while循环计算一张纸需要叠多少次可以到达珠穆朗玛峰的高度

	public static void main(String[] args) {
		Float paper = 0.07f;
		Float m = 8848000f;
		int c = 0;
		while (true) {
			paper = paper * 2;
			c++;
			if (paper <= m) {
				continue;
			} else {
				break;
			}
		}
		System.out.print("折叠次数为：" + c);
	}

}
