package day08nestedif;

import java.util.Scanner;

public class Turnary02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
�E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kenar giriniz:");
		int kenar1 =scan.nextInt();
		System.out.println("Bir kenar giriniz:");
		int kenar2 =scan.nextInt();
		System.out.println("Bir kenar giriniz:");
		int kenar3 =scan.nextInt();
		
		String result = kenar1==kenar2&&kenar1==kenar3 ? "E�kenar" : "E�kenar de�il";
		System.out.println(result);
		
		scan.close();
		
		
	}

}
