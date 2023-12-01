package chapter03_instrument;

public class TestInstrucment {

	public static void main(String[] args) {
		Musician musician1 = new Musician("张三");
		musician1.play(new ErHu());
		Musician musician2 = new Musician("李四");
		musician2.play(new Piano());
		Musician musician3 = new Musician("张铭");
		musician3.play(new Violin());
	}

}
