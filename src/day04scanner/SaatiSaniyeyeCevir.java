package day04scanner;

import java.util.Scanner;

public class SaatiSaniyeyeCevir {

	public static void main(String[] args) {
		
		/*
		 * Saati saniyeye �eviren bir program yaz�n�z. (long kullan�n�z)
Not 1: Saniye = Saat x 60 x 60 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Saniyeye �evirmek i�in saat giriniz");
		long saat=scan.nextLong();
		System.out.println("Saniye= "+saat*60*60);
		
		scan.close();
		
		
		
		
		

	}

}
