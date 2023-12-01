package package_CollectionAndMap.Collection.Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        Student1 stu1 = new Student1("001", "张三");
        Student1 stu2 = new Student1("002", "李四");
        Student1 stu3 = new Student1("003", "王五");
        Student1 stu4 = new Student1("004", "刘六");

        TreeSet<Student1> treeSet= new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 student1, Student1 t1) {
                int a =student1.getId().compareTo(t1.getId());     //返回正整数为当前对象大于所指对象  负整数为小于 零为等于
                if ( a> 0) {
                    return -1;
                } else if (a < 0) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);

        System.out.println(treeSet);


    }
}
