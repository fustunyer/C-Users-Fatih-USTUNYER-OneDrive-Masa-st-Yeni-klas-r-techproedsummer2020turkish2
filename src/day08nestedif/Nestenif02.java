package day08nestedif;

import java.util.Scanner;

public class Nestenif02 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan say� al�n
		 * say�pozitif ise say� 10 dan b�y�k ise "Woow" k���k ise "Hmmmm" yazd��r�n
		 * say� 0 veya negatif ise -10dan k���kse "Felaket "
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
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
				System.out.println("Ne yapal�m");
			}
		}else {
			System.out.println("Say� dedik");
		}
		scan.close();

	}

}
