package chapter03_vehicle;

public class VehicleExample {

	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.setPassenger(40);
		b1.setPrice(600000f);
		b1.setLicensdId("津A88888");
		Truck t1 = new Truck();
		t1.setLoad(10f);
		t1.setPrice(50400f);
		t1.setLicensdId("津A66666");
		System.out.println(b1.drive());
		System.out.println(t1.drive());
	}

}
