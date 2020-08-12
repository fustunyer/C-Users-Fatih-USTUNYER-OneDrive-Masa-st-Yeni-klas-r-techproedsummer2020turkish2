package day17staticblock;

import java.util.Scanner;

public class OnemliNot {

	public static void main(String[] args) {
		/*
		 * Note: static olmayan variable veya methodlar static methodlar icinde kullanilamazlar.
		 *  Ama static olmayan variable ve methodlari obje uzerinden kullanmak isterseniz Java buna musaade eder.
		 */
		// soru Girilen sayinin tersini return eden java methodunu yaziniz.
		
				Scanner scan = new Scanner(System.in);
				System.out.println("bir sayi yazınız");
				String sayi = scan.nextLine();
				System.out.println("yazdiginiz sayinin tersi:");
				
				sayiTersi(sayi);
				
				scan.close();
				
			}
			
			public static void sayiTersi(String sayi) {
			
			int uzunluk=sayi.length();
			int index=uzunluk-1;
			
			for(int i=0;i<uzunluk;i++) {
				System.out.print(sayi.charAt(index));
				index--;
		}

		
		
		
	}

}
