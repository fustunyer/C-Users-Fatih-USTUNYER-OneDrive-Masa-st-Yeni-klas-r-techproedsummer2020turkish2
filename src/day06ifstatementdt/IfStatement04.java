package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan say� al�n
		 * bu say� 0-9 ise ekrana "rakam" yazd�r�n
		 * bu say� 9dan b�y�k  ve 100 den k���k ise ekrana "iki basamakl� say�" yazd�r�n
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz:");
		int num =scan.nextInt();
		
		if(num>=0&&num<=9) {
			System.out.println("Rakam");
		}
		if(num>9&&num<100) {
			System.out.println("iki basamakl� say�d�r.");
		}
		scan.close();
	}
}