package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressWarnings("all")
//自定义注解
public class annotationDemo03 {
    @myAnnotation2(age = 18)//注解可以赋值，如果注解没有默认值，我们就必须给注解赋值
    public void test01() {
    }

    @myAnnotation3("tjtc")
    public void test02() {
    }

}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation2 {
    //注解的参数：参数类型+参数名()
    String name() default ""; //default----设置默认的参数

    int age();

    int id() default -1; //如果默认值为-1，代表不存在

    String[] schools() default {"天津职业大学", "天津师范大学"};
}

@interface myAnnotation3 {
    String value(); //value()可以省略在注解中的value 仅限于 注解中只要一个值

}