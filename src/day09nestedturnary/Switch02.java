package day09nestedturnary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/*
		 * kulln�c�dan g�n numaras�n� al�n ekrana g�n ismini yazd�r�n
		 * 1 pazar
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("g�n numaras�n� giriniz");
		int gun = scan.nextInt();
		
		switch(gun) {
			case 1:
				System.out.println("pazar");
				break;
			case 2:
				System.out.println("pazartesi");
				break;
			case 3:
				System.out.println("sal�");
				break;
			case 4:
				System.out.println("�ar�amba");
				break;
			case 5:
				System.out.println("per�embe");
				break;
			case 6:
				System.out.println("cuma");
				break;
			case 7:
				System.out.println("cumartesi");
				break;
			default:
				System.out.println("ge�erli g�n say�s� giriniz");
				
			
		}scan.close();
		
	}

}
