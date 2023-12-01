package chapter03_interface02;

public interface TeacherAndStudent {
	void speak();
	public default void teacherSpeak() {
		System.out.println("同学们好！");
	}
	public default void studentSpeak() {
		System.out.println("老师好！");
	}
	public static void sayHello() {
		System.out.println("Hello!");
	}
}
