package day13dowhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve 
baþlangýç deðerinden baþlayýp bitiþ deðerinde
biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz:");
		int baslangýc=scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz:");
		int bitis=scan.nextInt();
		
		int product=1;
		while (baslangýc<=bitis) {
			product=product*baslangýc;
			baslangýc++;
		}System.out.println(product);
scan.close();
	}

}
