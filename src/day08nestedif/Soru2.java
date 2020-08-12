package day08nestedif;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Alacaginiz urunun adedi:");
		int adet=scan.nextInt();
		System.out.println("Alacaginiz urunun birim fiyati:");
		int fiyat=scan.nextInt();
		
		if(adet>1000) {
			System.out.println(fiyat*0.9*adet);
		}else {
			System.out.println(fiyat*adet);
		}scan.close();
	}

}
