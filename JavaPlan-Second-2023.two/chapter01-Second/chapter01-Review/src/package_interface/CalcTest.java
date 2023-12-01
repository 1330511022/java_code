package package_interface;

public class CalcTest {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        try{  //可能出现异常的语句
            myCalculator.div(1,0);
        }catch (Exception e){  //括号里写出异常的类型
            //当捕获到异常时的处理语句
            System.out.println(e.getMessage());
        }

        ZhangCalculator zhangCalculator = new ZhangCalculator();
        System.out.println(zhangCalculator.sub(2,3));
        try {
            zhangCalculator.div(1,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
