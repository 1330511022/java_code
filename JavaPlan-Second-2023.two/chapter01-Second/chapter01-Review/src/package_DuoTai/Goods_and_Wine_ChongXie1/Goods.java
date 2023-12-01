package package_DuoTai.Goods_and_Wine_ChongXie1;

public class Goods {
    private float price;
    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return this.price;
    }
    public Goods(float price){
        this.price = price;
    }
    public Goods(){

    }
    // 商品调价
    public float changePrice(float rate){
        return price + price * rate;
    }
}

