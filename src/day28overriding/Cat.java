package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.saund();
		
		
		

	}
	public void saund() {
		System.out.println("Miyavlarlar");
	}
	@Override
	public void numOfFoot() {
		System.out.println("Dort ayaklidir.");
	}
	@Override
	public Cat myMethod() {
		//Animal obj1= new Animal();
		return null;
	}
	

}
