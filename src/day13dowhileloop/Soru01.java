package day13dowhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve 
ba�lang�� de�erinden ba�lay�p biti� de�erinde
biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erini giriniz:");
		int baslang�c=scan.nextInt();
		System.out.println("Biti� de�erini giriniz:");
		int bitis=scan.nextInt();
		
		int product=1;
		while (baslang�c<=bitis) {
			product=product*baslang�c;
			baslang�c++;
		}System.out.println(product);
scan.close();
	}

}
