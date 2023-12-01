package annotation;

import java.util.ArrayList;
import java.util.List;

public class annotationDemo01 extends Object {
    @Override//重写注解
    public String toString() {
        return super.toString();
    }

    @Deprecated//(已过时的 )
    public static void test() {
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")//镇压警告（镇压all全部警告）
    public void test02() {
        List list = new ArrayList<>();
    }

    public static void main(String[] args) {
        test();
    }
}
