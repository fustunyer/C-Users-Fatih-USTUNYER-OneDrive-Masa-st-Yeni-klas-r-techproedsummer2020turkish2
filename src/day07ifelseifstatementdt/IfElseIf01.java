package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan sy� al�p 
		 * say� 0dan b�y�kse ekrana "pozitif" yazd�r�n
		 * say� 0 ise akrana "n�tr" yazd�r�n
		 * say� 0dan k�c�kse "negatif" yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		double s=scan.nextDouble();
	
		if(s>0) {
			System.out.println("Pozitif");
		}else if(s==0) {
			System.out.println("N�tr");
		}else {
			System.out.println("Negatif");
		}
		scan.close();

	}

}
