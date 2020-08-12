package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan syý alýp 
		 * sayý 0dan büyükse ekrana "pozitif" yazdýrýn
		 * sayý 0 ise akrana "nötr" yazdýrýn
		 * sayý 0dan kücükse "negatif" yazdýrýn.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		double s=scan.nextDouble();
	
		if(s>0) {
			System.out.println("Pozitif");
		}else if(s==0) {
			System.out.println("Nötr");
		}else {
			System.out.println("Negatif");
		}
		scan.close();

	}

}
