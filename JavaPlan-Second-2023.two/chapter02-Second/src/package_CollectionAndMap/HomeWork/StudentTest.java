package package_CollectionAndMap.HomeWork;

import java.util.HashSet;
import java.util.Iterator;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三","20");
        Student stu2 = new Student("李四","19");
        Student stu3 = new Student("张三","20");
        Student stu4 = new Student("李六","20");
        Student stu5 = new Student("李2","20");
        HashSet<Student> hs = new HashSet<>();
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        hs.add(stu4);
        hs.add(stu5);
        System.out.println(stu1.hashCode());
        System.out.println(stu3.hashCode());
        System.out.println(hs.size());
        Iterator<Student> iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
