package day08nestedif;

import java.util.Scanner;

public class Turnary04 {

	public static void main(String[] args) {
		/*
		 * kullnýcýdan sayý al
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi = scan.nextInt();
		
		int result = sayi%2==0 ? sayi/2 : sayi*sayi;
		System.out.println(result);
		scan.close();
	}

}
