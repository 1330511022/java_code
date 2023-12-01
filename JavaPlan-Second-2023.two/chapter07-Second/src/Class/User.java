package Class;

public class User {
    private String name;

    public int age;

    public User() {
        System.out.println("Person()...");
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("你好，我是一个USER");
    }
    private String showNation(String nation){
        return "我的国际是："+nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
