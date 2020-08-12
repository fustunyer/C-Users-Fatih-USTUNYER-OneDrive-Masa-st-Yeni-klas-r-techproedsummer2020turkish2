package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		/*
		 * kullanıcıdan sayı alın
		 * bu sayı 0-9 ise ekrana "rakam" yazdırın
		 * bu sayı 9dan büyük  ve 100 den küçük ise ekrana "iki basamaklı sayı" yazdırın
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayı giriniz:");
		int num =scan.nextInt();
		
		if(num>=0&&num<=9) {
			System.out.println("Rakam");
		}
		if(num>9&&num<100) {
			System.out.println("iki basamaklı sayıdır.");
		}
		scan.close();
	}
}