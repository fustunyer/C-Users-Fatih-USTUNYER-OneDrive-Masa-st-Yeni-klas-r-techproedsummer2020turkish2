package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		 * //Kullanicidan yasini alin
		//Yas 13 den az ise ekrana "Calisamaz" yazdirin
		//Yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
		//Yas 65 den buyuk ise ekrana "Emekli" yazdirin
		//Negatif sayi girerse "Yas negatif olamaz"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int y=scan.nextInt();
		

		if(y<0) {
			System.out.println("yas sifirdan kucuk olamaz");
		}else	if(y<13) {
			System.out.println("calisamaz");
		}else if(y<65){
			System.out.println("calisabilir");
		}else {
			System.out.println("emekli");
		}
		scan.close();


	}

}
