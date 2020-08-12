package day04scanner;

import java.util.Scanner;

public class DikdortgeninCevresiVeAlani {

	public static void main(String[] args) {
		/*
		Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra diktörtgenin alan ve
cevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
Not: Alan: Boy x En
Not: Çevre: 2x (Boy + En)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin en ve boyunu giriniz");
		double en = scan.nextDouble();
		double boy = scan.nextDouble();
		
		System.out.println("Alan= "+boy*en);
		System.out.println("Çevre= "+2*(en+boy));
				
		
		scan.close();
		
	}

}
