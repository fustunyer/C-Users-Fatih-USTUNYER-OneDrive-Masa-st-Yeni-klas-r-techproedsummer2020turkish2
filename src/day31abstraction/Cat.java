package day31abstraction;

public class Cat extends Mammal{
	
	/*
	 *1)Concrete class lar parent lari olan abstract classlardaki tum abstract metthodlari
	 *	override etmek zorundadirlar. Aksi takdirde Compile Time Error olusur.
	  2)Concrete class lar parent lari olan abstract classlardaki concrete methodlari 
	  override etmek zorunda degildirler.  u istege bagliidr
	  3))Concrete class lar tum abstract parent lari olan tum abstract methodlari
	 *	override etmek zorundadirlar. Aksi takdirde Compile Time Error olusur.
	 */

	public static void main(String[] args) {
		

	}

	@Override
	public void asi() {
		System.out.println("Ey kedi igne ol");
	}

	@Override
	public void drink() {
		System.out.println("su ic");
		
	}

	@Override
	public void feed() {
		System.out.println("Yavrularini besler.");
		
	}

}
