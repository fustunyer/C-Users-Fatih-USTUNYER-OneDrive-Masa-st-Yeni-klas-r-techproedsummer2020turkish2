package day08nestedif;

import java.util.Scanner;

public class Turnary02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
“Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kenar giriniz:");
		int kenar1 =scan.nextInt();
		System.out.println("Bir kenar giriniz:");
		int kenar2 =scan.nextInt();
		System.out.println("Bir kenar giriniz:");
		int kenar3 =scan.nextInt();
		
		String result = kenar1==kenar2&&kenar1==kenar3 ? "Eþkenar" : "Eþkenar deðil";
		System.out.println(result);
		
		scan.close();
		
		
	}

}
