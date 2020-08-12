package day05incrementdecrement;

import java.util.Scanner;

public class soru3 {
	
	public static void main(String[] args) {
		//kullanýcýdan 3 basamaklý sayý alýnýz.
		//bu sayýnýn rakamlarý toplamýný ekrana yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 basamaklý sayý giriniz:");
		int s=scan.nextInt();
		
		int sonRakam=s%10;
		int ortaRakam=(s/10)%10;
		int ilkRakam=(s/100)%10;
		
		System.out.println("rakamlarý toplamý: "+(sonRakam+ortaRakam+ilkRakam));
		scan.close();
		
		
		
		
		
				
		
		
		
		
	}

}
