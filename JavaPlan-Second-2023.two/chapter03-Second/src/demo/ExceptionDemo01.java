package demo;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("异常！");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            //无论是否有异常，都会执行的语句
            System.out.println("程序异常！");
        }



    }
}
