package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan bir harf alýn
		 * bu harf 'a' veya 'A' ise ekrana "ilk harf" yazdýrýn
		 * bu harf 'b' veya 'B' ise ekrana "ikinci harf" yazdýrýn
		 * bu harf 'c' veya 'C' ise ekrana "ücüncü harf" yazdýrýn
		 * diðerleri için "sýrasýný bilmiyorum yazdýrýn
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		if (harf=='a'||harf=='A') {
			System.out.println("Ýlk harf");
		}else if(harf=='b'||harf=='B') {
			System.out.println("ikinci harf");
		}else if(harf=='c'||harf=='C') {
			System.out.println("ucuncu harf");
		}else {
			System.out.println("sýrasýný bilmyorum");
		}
		scan.close();

	}

}
