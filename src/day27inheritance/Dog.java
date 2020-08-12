package day27inheritance;

public class Dog extends Mammals{
	/*
	 * 1)Javada bir class sadece bir classa extend edebilir. 
	 * 	Java da bir classiin sadece bir parenti olabilir.
	 * 	Java Multiple inheritance i kabul etmez.
	 * 2)protected ve public inhertance a uygundur
	 *   private methodlar inheritance a uygun degildirler.
	 *   default ayni package te iseniz inheritance a uygundur. 
	 * ama farkli packege te iseniz uygun degildir. kullanmak rasklidir. o
	 * o nedenle kullanilmaz.
	 * 3)parent class= super class
	 * 	child class=Sub class
	 * 4) Her constructor ilk satirinda (aksi bir hamle yapilamdigi surece) "super" 
	 *  "onstructor call" vardir. yazmasaniz da otomatik calisir. 
	 */
	public boolean loyal= true;
	
	public Dog() {
		super();
		System.out.println("Dog");
	}

	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		dog.smell();
		dog.bark();
		dog.drink();
		dog.eat();
		dog.feed();
		System.out.println("sadik?"+dog.loyal);
		System.out.println("Dogum?"+dog.dogum);
		System.out.println("yas?"+dog.age);
		

		
		
		

	}public void bark() {
		System.out.println("Havlarlar");
	}
	
	public void smell() {
		System.out.println("Iyi koku alirlar");
	}

}
