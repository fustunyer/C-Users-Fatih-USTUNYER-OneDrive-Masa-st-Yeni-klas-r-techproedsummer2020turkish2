package day17staticblock;

public class Sb01 {
/*
 * farzaedelim bu class dairenin cevre ve alanini hesaplayacak
 * Alan=pi*r*r   cevre=2*pi*r
 * bu classta pi sayisi her zaman kullanilacaktir. 
 * bu sayina  class uretilerken degr atamasini yapamk faydalidir 
 * eger class uretilirken bazi variablelara deger atamasi isterseniz 
 * static block kullanmalisiniz  
 * static block  icinde static olmayan kullanimaz.bu nedenle asagidaki ornekte pi variable i 
 * static yapmammiz gerekir
 * ststic block main method diger tum metodlar ve tum constructorlardan once calisir.
 * static block class olusturulurken calisir.
 */
	
	static double pi;
	
	
	Sb01(){
		System.out.println("Constructor");
	}
	static {
		pi=3.4;
		System.out.println("Static block Ali");
	}
	
	public static void main(String[] args) {
		Sb01 obj1 = new Sb01();
		System.out.println("Main method");
		Sb01 obj2 = new Sb01();                                                                                
		System.out.println(obj1);
		System.out.println(obj2);
	

	}
	static {
		pi=3.4;
		System.out.println("Static block Veli");
	}

}
