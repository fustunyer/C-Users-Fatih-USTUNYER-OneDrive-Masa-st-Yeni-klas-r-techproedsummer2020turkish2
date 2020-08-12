package day31abstraction;

public abstract class Animal {
	/*
	 * 1)Abstract soyut demektir. zit anlamlisi Concrete somut demektir.
	 * 2)"abstract"  class tan Object uretemeyiz. cunku object somuttur
	 * 3) abstract class olusturarak child class lari bazi seyleri yapmaya mecbur birakiriz.
	 * 		abstract class icerisinde olusturdugumuz abstract method  child classlar tarafindan 
	 * uygulanmak zorundadir. concrete class icina abstract method yazamazsiniz  
	 * 4)abstract classlar icine absract olmayan (concrete) methodlar yazabilirsiniz.
	 * 	bu methodlar child classlar tarafindan istege bagli olarak kullanilabilirler.
	 */
	
	public abstract void asi();
	
	public abstract void drink();
	
	public void yemek() {
		System.out.println("Yemek yerler");
	}
	
	
	
}
