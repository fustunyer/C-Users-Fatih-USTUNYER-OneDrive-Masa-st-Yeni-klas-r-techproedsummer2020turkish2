package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gün giriniz:");
		String gun=scan.next();
		//Stringleri karþýlaþtýrýrken sakýn haaaa "==" kullanmayýn. Equals kullanýn
		//equals() boolean return eder.
		if(gun.equals("Cuma")) {
			System.out.println("müslümanlarýn kutsal gün");			
		}
		if(gun.equals("Cumartesi")) {
			System.out.println("yahudiler için kutsal gün");
		}
		if(gun.equals("Pazar")) {
			System.out.println("hristiyanlar için kutsal");			
		}
		
		scan.close();
	}

}
