package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 *Kullanýcýdan sayý alýn 
		 *sayý negatif ise ekrana "Negatif" yazdýrýn
		 *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý giriniz:");
		int num =scan.nextInt();
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num>0) {
			System.out.println("Pozitif");
		}
		if(num==0) {
			System.out.println("Nötr");
			
		scan.close();
		}
	}

}
