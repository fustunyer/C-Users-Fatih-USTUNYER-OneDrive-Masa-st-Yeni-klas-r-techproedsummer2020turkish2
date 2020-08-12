package day04scanner;

import java.util.Scanner;

public class SaatiSaniyeyeCevir {

	public static void main(String[] args) {
		
		/*
		 * Saati saniyeye çeviren bir program yazýnýz. (long kullanýnýz)
Not 1: Saniye = Saat x 60 x 60 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Saniyeye çevirmek için saat giriniz");
		long saat=scan.nextLong();
		System.out.println("Saniye= "+saat*60*60);
		
		scan.close();
		
		
		
		
		

	}

}
