package package_CollectionAndMap.Collection.Set.HashSet;

import java.util.HashSet;

public class setpackageMain {
    public static void main(String[] args) {
        Student stu1 = new Student("001", "张三");
        Student stu2 = new Student("002", "李四");
        Student stu3 = new Student("002", "李四");
        HashSet<Student> students = new HashSet<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        System.out.println(students.size());
    }

}
