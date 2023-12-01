package reflection;

public class reflectionDemo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一：通过对象获得
        Person person1 = new Student();
        System.out.println("这个人是" + person1.name);
        Class c1 = person1.getClass();

        //方式二：通过forname获得
        Class c2 = Class.forName("reflection.Student");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        //方式三：通过类名获得
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式四：基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;

        //获取父类类型
        Class<?> superclass = c1.getSuperclass();

    }
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }

}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }

}