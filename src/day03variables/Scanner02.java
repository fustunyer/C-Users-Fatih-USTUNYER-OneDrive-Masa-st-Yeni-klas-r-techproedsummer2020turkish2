package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
	//1.kullanýcýdan Tam ismini alýn ekrana yazýn
	//2. kullanýcýdan yaþýný alýn ekrana yazýn
	//3. kullanýcýdan isminin ilk harfini alýn ekrana yazýn
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Tam isminizi giriniz");
	String tamIsim = scan.nextLine();
	System.out.println(tamIsim);
		
	System.out.println("Yaþýnýzý Giriniz: ");
	int yas = scan.nextInt();
	System.out.println(yas);
	
	System.out.println("Ýsminizin Ýlk Harfini Giriniz = ");
	char ilkHarf = scan.next().charAt(0);
	System.out.println(ilkHarf);
	
	//kullanýcýdan tek harf almak için scan.next().charAt(0) kullanýlýr
	//4. kullanýcýnýn çocuk sayýsýný byte kullanarak al
	
	System.out.println("kaç çocuðunuz var= ");
	byte cocukSayýsý = scan.nextByte();
	System.out.println(cocukSayýsý);
	
	scan.close();
	
	
			
			
		

	}

}
