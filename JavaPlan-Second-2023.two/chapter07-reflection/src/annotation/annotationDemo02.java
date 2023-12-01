package annotation;

import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class annotationDemo02 {
    @MyAnnotation
    public void test() {

    }

}


//Target----表示我们的注解可以放在哪些地方
@Target(value = {ElementType.METHOD/*在方法上注解*/, ElementType.TYPE/*在类上注解*/})

//表示我们的注解在哪个地方还有效
//runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME/*运行时*/)

//表示是否将我们的注解生成在Javadoc中
@Documented

//子类可以继承父类的注解
@Inherited

@interface MyAnnotation {
//自定义注解
}

