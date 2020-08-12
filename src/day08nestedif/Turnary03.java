package day08nestedif;

import java.util.Scanner;

public class Turnary03 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf” yazdýrýn.
Diðer durumlarda ekrana “Harf deðil” yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir karater giriniz");
		char c=scan.next().charAt(0);
		
		String result = (c>='a'&&c<='z')||(c>='A'&&c<='Z') ? "Harf" : "Harf deðil";
		System.out.println(result);
		
		scan.close();	
		
	}

}
