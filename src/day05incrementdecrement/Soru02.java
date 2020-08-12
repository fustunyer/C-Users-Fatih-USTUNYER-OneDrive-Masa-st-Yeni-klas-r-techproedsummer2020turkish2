package day05incrementdecrement;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/* 0)sayýlarý kullanýcýdan alýn.
		 * 1)2 tane int variable oluþturun. a=5 b=3 gibi
		 * 2)bu integerlarýn deðerlerinin yerlerini deðiþtirin a= ve b= 5 olsun
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayýyý giriniz");
		int s1 = scan.nextInt();
		System.out.println("Ýkinci sayýyý giriniz");
		int s2 = scan.nextInt();
		System.out.println(s1+ " " +s2);
		
		s1=s1+s2;
		
		s2=s1-s2;
		
		s1=s1-s2;
		
		System.out.println(s1+ " " +s2);
		
		scan.close();

	}

}


