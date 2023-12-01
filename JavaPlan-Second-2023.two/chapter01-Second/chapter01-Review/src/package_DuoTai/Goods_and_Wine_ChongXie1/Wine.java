package package_DuoTai.Goods_and_Wine_ChongXie1;

public class Wine extends Goods {
        public float changePrice(float rate){
            return getPrice() + getPrice() * rate + 10;
        }

}
