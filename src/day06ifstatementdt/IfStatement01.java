package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan bir say� al�n bu say� 3 'e b�l�n�yorsa ekrana 
		 "3'�n kat� yazd�r�n
		 de�ilse "3'e b�l�nm�yor" yazd�r�n
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz:");
		int num =scan.nextInt();
		if(num%3==0) {
			System.out.println("3'�n kat�");
		}
		if(num%3!=0) {
			System.out.println("3'e b�l�nm�yor");
		}
		
		scan.close();
		

	}

}
