package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		//Ternary, if-else in daha k�sa yaz�lm�� halidir.
		
		//if(5>4) {System.out.println("Elma");} else {System.out.println("Armut");}
		
		// ayn� i�levi ternery
		
		//String result = 5>4 ? "Elma" : "Armut" ;
		//System.out.println(result);
		
		/*
		 * kullan�c�dan bir say� al�n
		 * bu say� 0-9 ekarana R
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
		int sayi =scan.nextInt();
		
		String result1 = sayi>=0 && sayi<10 ? "Rakam" : "Say�";
		System.out.println(result1);
		scan.close();
	}
}
