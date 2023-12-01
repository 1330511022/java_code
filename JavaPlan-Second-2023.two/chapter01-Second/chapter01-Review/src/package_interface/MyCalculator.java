package package_interface;

public class MyCalculator implements Calculator {

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int sub(int x, int y) {
        return x+y;
    }

    @Override
    public int mul(int x, int y) {
        return x*y;
    }

    @Override
    public int div(int x, int y) {
        if (y==0){
            throw/*关键字‘抛出’*/ new IllegalArgumentException("除数不能为0,请重新计算！");
        }
        return x/y;

    }
}
