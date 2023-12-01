package chapter03_instrument;

public class Musician {
	private String name;
	public Musician(String name) {
		this.name=name;	
	}
	public void play(Instrument instrument) {
		System.out.print(this.name+"演奏的乐器是");
		instrument.makeSound();
		
	}

}
