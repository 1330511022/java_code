package package_DuoTai.ChongZai;

public class CalcAdd {
    public int add(int x, int y){
        return x + y;
    }
    public float add(float x, float y){
        return x + y;
    }
    public float add(float[] arr){
        float sum = 0;
        for(float x : arr){
            sum += x;
        }
        return sum;
    }
}
