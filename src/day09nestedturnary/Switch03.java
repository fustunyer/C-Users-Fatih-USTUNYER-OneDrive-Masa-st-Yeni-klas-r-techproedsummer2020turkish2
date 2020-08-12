package day09nestedturnary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		/*kullanýcýdan ay numarasý alýn
		 * ay numarasý girilince o ay ve sonraki tüm ay isimlerini ekrana yazdýrýn		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ay numarasýný giriniz");
		int ay = scan.nextInt();
		
		switch(ay) {
		case 1:
			System.out.println("Ocak");
		case 2:
			System.out.println("Þubat");
		case 3:
			System.out.println("Mart");
		case 4:
			System.out.println("Nisan");
		case 5:
			System.out.println("Mayýs");
		case 6:
			System.out.println("Haziran");
		case 7:
			System.out.println("Temmuz");
		case 8:
			System.out.println("Aðustos");
		case 9:
			System.out.println("Eylül");
		case 10:
			System.out.println("Ekim");
		case 11:
			System.out.println("Kasým");
		case 12:
			System.out.println("Aralýk");
			break;
		default:
			System.out.println("geçersiz ay sayýsý");
		
		}
			
		
		
		
		
		
		scan.close();
		
		
	}

}
