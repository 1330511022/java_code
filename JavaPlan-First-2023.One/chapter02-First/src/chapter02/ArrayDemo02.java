package chapter02;

public class ArrayDemo02 {                  //利用数组分析同学的成绩

	public static void main(String[] args) {
		float[] scores = { 65.5f, 70, 80, 75.5f, 90.5f, 66.7f, 87.5f, 73.2f, 65.5f, 70, 80, 75.5f, 90.5f, 66.7f, 87.5f,
				73.2f };       //定义成绩（为浮点型）
		float sum = 0;   //定义累加和 赋初始值为0
		float max = scores[0], min = scores[0];    //首先将数组第一位分别赋值给最大值最小值（提供最大值最小值初始值 随后将其进行比较）
		System.out.println("一共有" + scores.length + "名学生");      //XXX.length--->数组长度 
		for (int n = 0; n < scores.length; n++) {
			sum = sum + scores[n];   //利用循环计算累加和 （scores[n]在随着n的变大在逐渐变化 【前者的值赋值给了sum sum在逐渐相加】）
			System.out.println("第" + (n + 1) + "名学生成绩：" + scores[n]);        //利用循环将每一位同学的成绩输出出来
			if (scores[n] > max) {
				max = scores[n];
			}                        //通过if语句将最大值最小值相互比较出来 
			if (scores[n] < min) {
				min = scores[n];
			}
		}
		System.out.println("最高成绩为：" + max);
		System.out.println("最低成绩为：" + min);
		System.out.println(String.format("平均成绩为：%.2f", sum / scores.length));//利用函数format将平均成绩后小数点保持两位输出
		System.out.println("累加和：" + sum);

	}

}
