package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		//Ternary, if-else in daha kısa yazılmış halidir.
		
		//if(5>4) {System.out.println("Elma");} else {System.out.println("Armut");}
		
		// aynı işlevi ternery
		
		//String result = 5>4 ? "Elma" : "Armut" ;
		//System.out.println(result);
		
		/*
		 * kullanıcıdan bir sayı alın
		 * bu sayı 0-9 ekarana R
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sayi =scan.nextInt();
		
		String result1 = sayi>=0 && sayi<10 ? "Rakam" : "Sayı";
		System.out.println(result1);
		scan.close();
	}
}
