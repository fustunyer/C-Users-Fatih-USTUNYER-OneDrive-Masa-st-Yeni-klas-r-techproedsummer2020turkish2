package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
	//1.kullan�c�dan Tam ismini al�n ekrana yaz�n
	//2. kullan�c�dan ya��n� al�n ekrana yaz�n
	//3. kullan�c�dan isminin ilk harfini al�n ekrana yaz�n
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Tam isminizi giriniz");
	String tamIsim = scan.nextLine();
	System.out.println(tamIsim);
		
	System.out.println("Ya��n�z� Giriniz: ");
	int yas = scan.nextInt();
	System.out.println(yas);
	
	System.out.println("�sminizin �lk Harfini Giriniz = ");
	char ilkHarf = scan.next().charAt(0);
	System.out.println(ilkHarf);
	
	//kullan�c�dan tek harf almak i�in scan.next().charAt(0) kullan�l�r
	//4. kullan�c�n�n �ocuk say�s�n� byte kullanarak al
	
	System.out.println("ka� �ocu�unuz var= ");
	byte cocukSay�s� = scan.nextByte();
	System.out.println(cocukSay�s�);
	
	scan.close();
	
	
			
			
		

	}

}
