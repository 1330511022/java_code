package chapter04_StringPackage;

import java.util.Scanner;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("abc");
		System.out.println(a.length());
		System.out.println(a.capacity());
		a.append("ABC");
		System.out.println(a);
		a.replace(2, 4, "天津职业大学");
		System.out.println(a);

	}

}
