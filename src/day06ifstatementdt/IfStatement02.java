package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir g�n giriniz:");
		String gun=scan.next();
		//Stringleri kar��la�t�r�rken sak�n haaaa "==" kullanmay�n. Equals kullan�n
		//equals() boolean return eder.
		if(gun.equals("Cuma")) {
			System.out.println("m�sl�manlar�n kutsal g�n");			
		}
		if(gun.equals("Cumartesi")) {
			System.out.println("yahudiler i�in kutsal g�n");
		}
		if(gun.equals("Pazar")) {
			System.out.println("hristiyanlar i�in kutsal");			
		}
		
		scan.close();
	}

}
