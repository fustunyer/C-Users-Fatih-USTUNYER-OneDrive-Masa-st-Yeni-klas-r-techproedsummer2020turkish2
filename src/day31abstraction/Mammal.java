package day31abstraction;

public abstract class Mammal extends Animal {
	/*
	 * 1)Gordugunuz gibi Mammal Animalin child classi ve asi methodu ile drink methoodunu override etmedi
	 *  ama herhangi bir sikayet yok. cunku abstract childlarin abstract parenttaki abstract methodlari 
	 *  override etme zorunlulugu yoktur.
	 */
	public abstract void feed();
	
	public void move() {
		System.out.println("Hareket ederler.");
	}
	
	
	
	
	
	

}
