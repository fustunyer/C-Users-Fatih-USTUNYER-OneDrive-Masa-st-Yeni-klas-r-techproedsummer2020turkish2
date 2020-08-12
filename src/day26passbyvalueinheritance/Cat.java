package day26passbyvalueinheritance;

public class Cat extends Mammals {

	public static void main(String[] args) {
		
		Cat oc = new Cat();
		oc.clean();
		oc.drink();
		oc.eat();
		oc.feed();
		oc.meow();
		
		
	}public void meow() {
		System.out.println("miyavlarlar");
	}public void clean() {
		System.out.println("Temizlenirler");
	}

}
