package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		/*
		 * kulaln�c�dan say� al�n
		 * 0-9 'a kadar ise ekrana rakam yazd�r�n
		 * 9 dan b�y�k veya 0 dan k���k ise "Say�" yazd�r�n
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz:");
		int num =scan.nextInt();
		if(num>=0 && num<10) {
			System.out.println("Rakam");
		}
		if(num<0||num>9) {
			System.out.println("Say�");
		}
		scan.close();		
	}

}
