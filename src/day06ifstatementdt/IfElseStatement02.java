package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 kullan�c�dan ssay� al�n
		 10-100 e kadarsa 2 basamakl� 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz:");
		int num =scan.nextInt();
		if(num>=10 && num<=100) {
			System.out.println("2 basamakl�");
		}else {System.out.println("2 basamakl� de�il");
		}scan.close();
	}	
}       
