package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 *kullan�c�dan bir say� al�n 
		 *say� �ift ise ekrana "kazand�n�z"
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int s=0;
		do {
			if(s%2!=0) {
				System.out.println("kaybettiniz");
			} 
			System.out.println("bir say� giriniz:");
			s=scan.nextInt();
			
		}while(s%2!=0);
		System.out.println("Kazand�n�z");
		
		
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
