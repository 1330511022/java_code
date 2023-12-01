package package_DuoTai.ChongZai;

public class CalcTest {
    public static void main(String[] args){
        CalcAdd calc = new CalcAdd();
        System.out.println(calc.add(2.34f, 5.67f));
        float[] arr = {1f, 3f, 3.14f, 5.67f};
        System.out.println(calc.add(arr));
    }
}
