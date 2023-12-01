package chapter02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo02 {          //数组列表（单词分割器）

	public static void main(String[] args) {
		String sentence, word = "";  //定义字符串sentence  word 将word赋值为一个空值
		ArrayList<String> words = new ArrayList<>(); //定义一个名为words的数组列表 数据类型为字符串类型
		System.out.print("请输入一个句子，单词间以空格分割：");
		Scanner in = new Scanner(System.in);
		sentence = in.nextLine();   
		for (int i = 0; i < sentence.length(); i++) { //通过循环将输入的单词输入到数组列表中
			if (sentence.charAt(i) != ' ') {  //.charAt()：为获取到输入的第一个字符  如果不等于空格
				word += sentence.charAt(i); //则将sentence添加到word中
			} else {    //如果输入了空格 便进入了else
				words.add(word); //将目前储存单词的word 字符串 添加到数组列表中
				word = "";  //并将word返回空值 （用于让word再次进入循环获取下一个单词）

			}
		}
		words.add(word); 
		System.out.println("这个句子中共有" + words.size() + "个单词，分别是：");
		for (String s : words) {  //输出数组列表
			System.out.println(s);
		}

	}

}
