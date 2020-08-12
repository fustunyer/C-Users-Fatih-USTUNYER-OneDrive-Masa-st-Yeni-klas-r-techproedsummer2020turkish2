package day26passbyvalueinheritance;

public class Mammals extends Animal{

	public static void main(String[] args) {
		
		Mammals om= new Mammals();
		
		om.drink();
		om.eat();
		om.feed();
		
		
		

	}public void feed() {
		System.out.println("Yavrularini beslerler");
	}

}
