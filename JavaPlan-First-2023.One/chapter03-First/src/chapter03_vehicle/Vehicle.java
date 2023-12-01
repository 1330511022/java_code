package chapter03_vehicle;

public abstract class Vehicle {
	private float price;  //价格
	private String licensdId;//牌照号

	 public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLicensdId() {
		return licensdId;
	}
	public void setLicensdId(String licensdId) {
		this.licensdId = licensdId;
	}
	
	public abstract String drive();
	
}
