package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		//while loop �ncw �art� kontrol eder sonra code �al��t�r�r. do-while �nce kodu �al��t�r�r sonra �art� kontrol eder.
		
		
		int i=1;
		// while loop ekran bo�tur.
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
		 * kullan�c�dan bir say� al�n.
		 * bu say� 10 dan b�y�kse "kazand�n�z"
		 * say� 10 veya 10dan k���kse "kaybettiniz yaz�p tekrar say� isteyin
		 *Oyun gibi kod yazarken while i�indeki �art� d�ng�n�n devam etme ko�uluna g�re ayarlay�n,
		 */
		
		Scanner scan = new Scanner(System.in);
		int s=20;
		
		do {
			if(s<=10) {
				System.out.println("Kaybettiniz..");
			}
			System.out.println("Bir say� giriniz");
			s=scan.nextInt();
		}while(s<=10);
		System.out.println("Kazand�n�z");
			
		scan.close();
		
	}

}
