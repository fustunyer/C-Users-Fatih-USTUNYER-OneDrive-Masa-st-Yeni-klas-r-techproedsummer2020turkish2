package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir harf al�n
		 * bu harf 'a' veya 'A' ise ekrana "ilk harf" yazd�r�n
		 * bu harf 'b' veya 'B' ise ekrana "ikinci harf" yazd�r�n
		 * bu harf 'c' veya 'C' ise ekrana "�c�nc� harf" yazd�r�n
		 * di�erleri i�in "s�ras�n� bilmiyorum yazd�r�n
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		if (harf=='a'||harf=='A') {
			System.out.println("�lk harf");
		}else if(harf=='b'||harf=='B') {
			System.out.println("ikinci harf");
		}else if(harf=='c'||harf=='C') {
			System.out.println("ucuncu harf");
		}else {
			System.out.println("s�ras�n� bilmyorum");
		}
		scan.close();

	}

}
