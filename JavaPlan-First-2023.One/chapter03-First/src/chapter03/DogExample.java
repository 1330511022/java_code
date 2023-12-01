package chapter03;

public class DogExample {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setDogName("来福");
		dog1.setDogAge(3);
		dog1.setDogColor("黄色");
		dog1.setDogKind("中华田园犬"); 
		dog1.setDogWeight(25.2f);
		dog1.setDogOwner("小明");
		System.out.println(dog1.feed("骨头"));
		System.out.println(dog1.location("河边"));
		

	}

}
