package day09nestedturnary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/*
		 * kullnýcýdan gün numarasýný alýn ekrana gün ismini yazdýrýn
		 * 1 pazar
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("gün numarasýný giriniz");
		int gun = scan.nextInt();
		
		switch(gun) {
			case 1:
				System.out.println("pazar");
				break;
			case 2:
				System.out.println("pazartesi");
				break;
			case 3:
				System.out.println("salý");
				break;
			case 4:
				System.out.println("çarþamba");
				break;
			case 5:
				System.out.println("perþembe");
				break;
			case 6:
				System.out.println("cuma");
				break;
			case 7:
				System.out.println("cumartesi");
				break;
			default:
				System.out.println("geçerli gün sayýsý giriniz");
				
			
		}scan.close();
		
	}

}
