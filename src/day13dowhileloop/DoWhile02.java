package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 *kullanýcýdan bir sayý alýn 
		 *sayý çift ise ekrana "kazandýnýz"
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int s=0;
		do {
			if(s%2!=0) {
				System.out.println("kaybettiniz");
			} 
			System.out.println("bir sayý giriniz:");
			s=scan.nextInt();
			
		}while(s%2!=0);
		System.out.println("Kazandýnýz");
		
		
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
