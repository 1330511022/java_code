package demo;

public class MyExceptionDemo {
    public float divide(float x, float y) throws Exception {
        return x / y;
    }

    public float changeSalary(float salary, float rate) throws Exception {
        if (salary < 0) {
            throw new Exception("工资值错误！");
        } else {
            return salary * (1 + rate);
        }
    }
}
class Maintest {
    public static void main(String[] args) {
        MyExceptionDemo myExceptionDemo = new MyExceptionDemo();
        try {
            myExceptionDemo.changeSalary(-2200, 0.5f);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}