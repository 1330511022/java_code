package package_interface;

public class ZhangCalculator implements Calculator{
    @Override
    public int add(int x, int y) {
        return x*10+y*10;
    }

    @Override
    public int sub(int x, int y) {
        return x*10-y*10;
    }

    @Override
    public int mul(int x, int y) {
        return(x*y)*100;
    }

    @Override
    public int div(int x, int y) {

        if (y*10==0){
            throw/*关键字‘抛出’*/ new IllegalArgumentException("除数不能为0,请重新计算！");
        }
        return x*10/y*10;
    }
}
