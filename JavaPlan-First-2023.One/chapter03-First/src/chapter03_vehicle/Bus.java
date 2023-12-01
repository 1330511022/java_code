package chapter03_vehicle;

public class Bus extends Vehicle {
	 private int passenger;

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	@Override
	 public String drive() {
		return "车牌号为"+this.getLicensdId()+"的公交车为公共交通工具，乘客数量为"+this.passenger+"人,"+"这辆车的售价为："+this.getPrice()+"元";
	}
	
	 

}
