package day08nestedif;

import java.util.Scanner;

public class Nestenif02 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan sayý alýn
		 * sayýpozitif ise sayý 10 dan büyük ise "Woow" küçük ise "Hmmmm" yazdýýrýn
		 * sayý 0 veya negatif ise -10dan küçükse "Felaket "
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		int sayi =scan.nextInt();
		
		if(sayi>0) {
			if(sayi>10) {
				System.out.println("Wooow!");
			}else {
				System.out.println("Hmmmm");
			}
		}else if(sayi<=0){
			if(sayi<-10) {
				System.out.println("Felaket");
			}else {
				System.out.println("Ne yapalým");
			}
		}else {
			System.out.println("Sayý dedik");
		}
		scan.close();

	}

}
