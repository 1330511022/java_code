package chapter03_interface02;

public class TestTeacherAndStudent {

	public static void main(String[] args) {
		TeacherAndStudent.sayHello();
		ImplementTeacher teacher = new ImplementTeacher();
		teacher.teacherSpeak();
		teacher.speak();
		
		TeacherAndStudent.sayHello();
		ImplementStudent student = new ImplementStudent();
		student.studentSpeak();
		student.speak();
	}

}
