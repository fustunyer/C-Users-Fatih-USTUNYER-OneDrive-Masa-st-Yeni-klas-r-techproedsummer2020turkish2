package day04scanner;

import java.util.Scanner;

public class DaireninCevreiVeAlani {

	public static void main(String[] args) {
		
		/*
		 * Yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve alan�n� hesaplayan
bir program yaz�n�z. (float kullan�n�z)
Not 1: pi say�s�: 3.14159
Not 2: Alan: 3.14159 x radius x radius
Not 3: Cevre: 2 x 3.14159 x radius
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("yar��ap� giriniz");
		float r = scan.nextFloat();
		System.out.println("Alan= " + 3.14159*r*r);
		System.out.println("cevre= "+ 2*3.14159);
		
		
		
		
		scan.close();

		
		
		
	}

}
