import java.lang.annotation.*;
import java.lang.reflect.Field;

//练习反射操作注解
public class AnnotationReflectionPlay {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> c1 = Class.forName("Student2");
        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        //通过反射获取注解的value值
        Table annotation = c1.getAnnotation(Table.class);
        String value = annotation.value();
        System.out.println(value);

        //通过反射获取类指定的注解
        Field name = c1.getDeclaredField("name");
        Filed annotation1 = name.getAnnotation(Filed.class);
        System.out.println(annotation1.columnName());
        System.out.println(annotation1.type());
        System.out.println(annotation1.length());

    }


}

@Table("db_student")
class Student2 {
    @Filed(columnName = "db_id", type = "int", length = 10)
    private int id;
    @Filed(columnName = "db_age", type = "int", length = 10)
    private int age;
    @Filed(columnName = "db_name", type = "varchar", length = 3)
    private String name;


    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student2() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


//类名的注解
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String value();
}

//属性的注解
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Filed {
    String columnName();

    String type();

    int length();

}