package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan bir sayý alýn bu sayý 3 'e bölünüyorsa ekrana 
		 "3'ün katý yazdýrýn
		 deðilse "3'e bölünmüyor" yazdýrýn
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý giriniz:");
		int num =scan.nextInt();
		if(num%3==0) {
			System.out.println("3'ün katý");
		}
		if(num%3!=0) {
			System.out.println("3'e bölünmüyor");
		}
		
		scan.close();
		

	}

}
