package package_CollectionAndMap.Collection.List.Study.ArrayList;

public class ListDemo {
    private final String name;
    private final int age;

    public ListDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "ListDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
