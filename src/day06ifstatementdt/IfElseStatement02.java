package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 kullanıcıdan ssayı alın
		 10-100 e kadarsa 2 basamaklı 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayı giriniz:");
		int num =scan.nextInt();
		if(num>=10 && num<=100) {
			System.out.println("2 basamaklı");
		}else {System.out.println("2 basamaklı değil");
		}scan.close();
	}	
}       
