package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 *Kullan�c�dan say� al�n 
		 *say� negatif ise ekrana "Negatif" yazd�r�n
		 *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz:");
		int num =scan.nextInt();
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num>0) {
			System.out.println("Pozitif");
		}
		if(num==0) {
			System.out.println("N�tr");
			
		scan.close();
		}
	}

}
