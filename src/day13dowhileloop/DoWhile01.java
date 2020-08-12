package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		//while loop öncw þartý kontrol eder sonra code çalýþtýrýr. do-while önce kodu çalýþtýrýr sonra þartý kontrol eder.
		
		
		int i=1;
		// while loop ekran boþtur.
		while(i<1) {
			System.out.println(i);
			i++;
		}
			
		//ekrana 1 yazar.	
		do {
			System.out.println(i);
			i++;
		}while(i<1);
		
		/*
		 * kullanýcýdan bir sayý alýn.
		 * bu sayý 10 dan büyükse "kazandýnýz"
		 * sayý 10 veya 10dan küçükse "kaybettiniz yazýp tekrar sayý isteyin
		 *Oyun gibi kod yazarken while içindeki þartý döngünün devam etme koþuluna göre ayarlayýn,
		 */
		
		Scanner scan = new Scanner(System.in);
		int s=20;
		
		do {
			if(s<=10) {
				System.out.println("Kaybettiniz..");
			}
			System.out.println("Bir sayý giriniz");
			s=scan.nextInt();
		}while(s<=10);
		System.out.println("Kazandýnýz");
			
		scan.close();
		
	}

}
