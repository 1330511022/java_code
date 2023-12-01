package package_DuoTai.Good2s_and_Fruits_ChongXie2;

public class Fruits implements Goods2 {
    private float price;
    public float getPrice(){
        return this.price;
    }
    public Fruits(float price){
        this.price=price;
    }
    @Override
    public float changePrice(float rate) {
        return this.price*(1-rate);
    }
}
