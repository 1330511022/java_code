package package_WrapperDemo;

public class WrapperDemo01 {
    public static void main(String[] args) {
        int a = 19;
        Integer a1 = new Integer(a);   // 装箱
        Integer b = 20;
        // 对象的组成：属性和方法
        Character c1 = new Character('a');
        char c2 = c1.charValue();  // 拆箱
        int b1 = b.intValue();

        System.out.println(Boolean.parseBoolean("100"));
        System.out.println( Integer.valueOf("1234"));
    }
}
