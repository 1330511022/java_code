package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取类的信息
public class reflectionDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        User user = new User();
        Class<? extends User> c1 = user.getClass();
//        Class c1 = Class.forName("reflection.User");
        System.out.println(c1.getName());//获得包名和类名
        System.out.println(c1.getSimpleName());//获得类名
        System.out.println("=================");
        //获得类的属性
        Field[] fields = c1.getFields();//只能找到public属性

        Field[] declaredFields = c1.getDeclaredFields();//找到全部属性
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        System.out.println("=================");

        //获得类的方法
        Method[] methods = c1.getMethods();//获得本类和父类的public的方法
        for (Method method : methods) {
        }
        Method[] declaredMethods = c1.getDeclaredMethods();//获得本类的全部的方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("getDeclaredMethods" + declaredMethod);
        }
        System.out.println("=================");
        //获取指定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        System.out.println("=================");
        //获取构造器

        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("=================");
        //获取指定构造器
        Constructor<? extends User> constructor = c1.getConstructor(String.class, int.class, int.class);
        System.out.println(constructor);


    }
}
