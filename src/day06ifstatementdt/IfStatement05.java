package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		/*
		 * kulalnýcýdan sayý alýn
		 * 0-9 'a kadar ise ekrana rakam yazdýrýn
		 * 9 dan büyük veya 0 dan küçük ise "Sayý" yazdýrýn
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý giriniz:");
		int num =scan.nextInt();
		if(num>=0 && num<10) {
			System.out.println("Rakam");
		}
		if(num<0||num>9) {
			System.out.println("Sayý");
		}
		scan.close();		
	}

}
