package day09nestedturnary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan bir harf alýn
		 * harf 'a' veya 'A' ise ekrana "ilk harf" yazdýrýn
		 * harf 'b' veya 'B' ise ekrana "ikinci harf" yazdýrýn
		 * harf 'c' veya 'C' ise ekrana "üçüncü harf" yazdýrýn
		 * diðer durumlarda ekrana "tanýmlanamadý 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char ch = scan.next().charAt(0);
		//1. yol if-else-if kullanýrýz.
		if (ch=='a'||ch=='A') {
			System.out.println("ilk harf");
		}else if(ch=='b'||ch=='B') {
			System.out.println("ikinci harf");
		}else if(ch=='c'||ch=='C') {
			System.out.println("üçüncü harf");
		}else {
			System.out.println("tanýmlanamadý");
		}
		//2. yol switch statement
		switch(ch) {
			case 'a':
			case 'A':
				System.out.println("ilk harf");
				break;
			case 'b':
			case 'B':
				System.out.println("ikinci harf");
				break;
			case 'c':
			case 'C':
				System.out.println("ücüncü harf");
				break;
			default:
				System.out.println("tanýmlanamadý");
		}
		scan.close();
	}

}
