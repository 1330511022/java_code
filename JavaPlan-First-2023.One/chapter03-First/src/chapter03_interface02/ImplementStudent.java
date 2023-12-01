package chapter03_interface02;

public class ImplementStudent implements TeacherAndStudent {

	@Override
	public void speak() {
		System.out.println("JAVA基本数据类型包括整型、浮点型、布尔型、字符型");
	}

}
