package day05incrementdecrement;

import java.util.Scanner;

public class soru3 {
	
	public static void main(String[] args) {
		//kullan�c�dan 3 basamakl� say� al�n�z.
		//bu say�n�n rakamlar� toplam�n� ekrana yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 basamakl� say� giriniz:");
		int s=scan.nextInt();
		
		int sonRakam=s%10;
		int ortaRakam=(s/10)%10;
		int ilkRakam=(s/100)%10;
		
		System.out.println("rakamlar� toplam�: "+(sonRakam+ortaRakam+ilkRakam));
		scan.close();
		
		
		
		
		
				
		
		
		
		
	}

}
