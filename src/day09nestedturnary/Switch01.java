package day09nestedturnary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir harf al�n
		 * harf 'a' veya 'A' ise ekrana "ilk harf" yazd�r�n
		 * harf 'b' veya 'B' ise ekrana "ikinci harf" yazd�r�n
		 * harf 'c' veya 'C' ise ekrana "���nc� harf" yazd�r�n
		 * di�er durumlarda ekrana "tan�mlanamad� 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char ch = scan.next().charAt(0);
		//1. yol if-else-if kullan�r�z.
		if (ch=='a'||ch=='A') {
			System.out.println("ilk harf");
		}else if(ch=='b'||ch=='B') {
			System.out.println("ikinci harf");
		}else if(ch=='c'||ch=='C') {
			System.out.println("���nc� harf");
		}else {
			System.out.println("tan�mlanamad�");
		}
		//2. yol switch statement
		switch(ch) {
			case 'a':
			case 'A':
				System.out.println("ilk harf");
				break;
			case 'b':
			case 'B':
				System.out.println("ikinci harf");
				break;
			case 'c':
			case 'C':
				System.out.println("�c�nc� harf");
				break;
			default:
				System.out.println("tan�mlanamad�");
		}
		scan.close();
	}

}
