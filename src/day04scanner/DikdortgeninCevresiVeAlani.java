package day04scanner;

import java.util.Scanner;

public class DikdortgeninCevresiVeAlani {

	public static void main(String[] args) {
		/*
		Kullan�c�dan dikd�rtgenin boyutlar�n� alan ve sonra dikt�rtgenin alan ve
cevresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
Not: Alan: Boy x En
Not: �evre: 2x (Boy + En)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikd�rtgenin en ve boyunu giriniz");
		double en = scan.nextDouble();
		double boy = scan.nextDouble();
		
		System.out.println("Alan= "+boy*en);
		System.out.println("�evre= "+2*(en+boy));
				
		
		scan.close();
		
	}

}
