package day08nestedif;

import java.util.Scanner;

public class Turnary03 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir karater giriniz");
		char c=scan.next().charAt(0);
		
		String result = (c>='a'&&c<='z')||(c>='A'&&c<='Z') ? "Harf" : "Harf de�il";
		System.out.println(result);
		
		scan.close();	
		
	}

}
