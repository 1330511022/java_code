package chapter03_extends;

public class AnimalExample {

	public static void main(String[] args) {
		Dog mydog1 = new Dog();
		mydog1.setAge(3);
		mydog1.setColor("黄色");
		mydog1.setGender("公");
		mydog1.setVoice("汪汪.....");
		mydog1.setDogname("小黄");

		System.out.println("我的小狗已经"+mydog1.getAge()+"岁了！");
		System.out.println("我的小狗是"+mydog1.getColor()+"的！");
		System.out.println("我的小狗是"+mydog1.getAge()+"的！");
		System.out.println("我的小狗是"+mydog1.getVoice()+"这样叫的！");
		mydog1.run("河边");
		
	}

}
