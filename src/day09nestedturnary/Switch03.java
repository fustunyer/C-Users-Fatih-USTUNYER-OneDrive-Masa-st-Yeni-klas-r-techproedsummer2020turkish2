package day09nestedturnary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		/*kullan�c�dan ay numaras� al�n
		 * ay numaras� girilince o ay ve sonraki t�m ay isimlerini ekrana yazd�r�n		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ay numaras�n� giriniz");
		int ay = scan.nextInt();
		
		switch(ay) {
		case 1:
			System.out.println("Ocak");
		case 2:
			System.out.println("�ubat");
		case 3:
			System.out.println("Mart");
		case 4:
			System.out.println("Nisan");
		case 5:
			System.out.println("May�s");
		case 6:
			System.out.println("Haziran");
		case 7:
			System.out.println("Temmuz");
		case 8:
			System.out.println("A�ustos");
		case 9:
			System.out.println("Eyl�l");
		case 10:
			System.out.println("Ekim");
		case 11:
			System.out.println("Kas�m");
		case 12:
			System.out.println("Aral�k");
			break;
		default:
			System.out.println("ge�ersiz ay say�s�");
		
		}
			
		
		
		
		
		
		scan.close();
		
		
	}

}
