package Class;

import org.junit.Test;

import java.lang.annotation.ElementType;

//获取Class实例的几种方式
public class ClassTest {
    @Test
    public void test1() throws ClassNotFoundException {

        //1.调用运行时类的静态属性
        Class userClass = User.class;
        System.out.println(userClass);

        //2.调用运行时类的对象的getclass()方法
        User user = new User();
        Class aClass = user.getClass();

        //3.调用Class的静态方法forName(String className)
        String className = "Class.User";//全类名
        Class aClass1 = Class.forName(className);

        //4.使用类的加载器方式
        Class aClass2 = ClassLoader.getSystemClassLoader().loadClass("Class.User");


        System.out.println(aClass1 == aClass);//true
        System.out.println(userClass == aClass);//true
        System.out.println(aClass2 == aClass);//true
    }

    @Test
    public void test2() {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }
}
