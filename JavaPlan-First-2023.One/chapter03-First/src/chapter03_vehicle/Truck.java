package chapter03_vehicle;

public class Truck extends Vehicle{
	private float load;//载重

	public float getLoad() {
		return load;
	}

	public void setLoad(float load) {
		this.load = load;
	}
	@Override
	 public String drive() {
		return "车牌号为"+this.getLicensdId()+"的卡车用于运输货物，载重为"+this.load+"吨,这辆卡车的售价为："+this.getPrice()+"元";
	}
}
