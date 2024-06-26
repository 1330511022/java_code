package reflection;

//什么叫反射
public class reflectionDemo01 extends Object {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取对象的class对象
        Class c1 = Class.forName("reflection.User");
        Class c2 = Class.forName("reflection.User");
        Class c3 = Class.forName("reflection.User");
        Class c4 = Class.forName("reflection.User");
        System.out.println(c1);

        //一个类在内存中只有一个class对象
        //一个类在加载后，类的整个结构都会封装在Class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }

}

//实体类


class User {
    private String name;
    private int id;
    private int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
