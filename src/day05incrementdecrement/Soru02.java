package day05incrementdecrement;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/* 0)say�lar� kullan�c�dan al�n.
		 * 1)2 tane int variable olu�turun. a=5 b=3 gibi
		 * 2)bu integerlar�n de�erlerinin yerlerini de�i�tirin a= ve b= 5 olsun
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz");
		int s1 = scan.nextInt();
		System.out.println("�kinci say�y� giriniz");
		int s2 = scan.nextInt();
		System.out.println(s1+ " " +s2);
		
		s1=s1+s2;
		
		s2=s1-s2;
		
		s1=s1-s2;
		
		System.out.println(s1+ " " +s2);
		
		scan.close();

	}

}


