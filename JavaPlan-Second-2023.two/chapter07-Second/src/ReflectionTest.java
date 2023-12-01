import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    //使用反射之前可以执行的操作
    @Test
    public void test1() {
        //1.创建Person的对象
        Person p1 = new Person();
        //2.调用属性
        p1.age = 10;
        System.out.println(p1.age);
        //3.调用方法
        p1.show();

    }

    //使用反射完成上述操作
    @Test
    public void test2() throws Exception {
        //1.创建Person的对象
        Class<Person> personClass = Person.class;
        Person p1 = personClass.newInstance();
        System.out.println(p1);
        //2.调用属性
        Field age = personClass.getField("age");
        age.set(p1, 10);
        System.out.println(age.get(p1));
        //3.调用方法
        Method show = personClass.getMethod("show");
        show.invoke(p1);


    }

    //出了Person类之后，就不能直接调用Person类中声明的private权限修饰的结构(属性，方法)
    //但是可以通过反射的方式调用私有结构
    //使用反射完成上述操作
    @Test
    public void test3() throws Exception {
        //1.调用私有构造器，创建Person对象
        Class<Person> personClass = Person.class;
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Person person = declaredConstructor.newInstance("TOM", 12);
        System.out.println(person);
        //2.调用私有属性
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person, "Jerry");
        System.out.println(name.get(person));
        //3.调用私有方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String chn = (String) showNation.invoke(person, "CHN");
        System.out.println(chn);

    }


}
