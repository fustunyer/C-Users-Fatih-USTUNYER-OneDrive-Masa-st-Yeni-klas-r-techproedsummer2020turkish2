package day09nestedturnary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*
		 * ay ismini girince o ay�n mevsimini ekrana yazd�r�n
		 */
		
		//switch'lerde boolean float double long kullan�lmaz.
		//char byte short int String kullan�l�r....
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir ay ad� giriniz");
		String ay=scan.next();
		
		switch(ay) {
		case "aral�k":
		case "ocak":
		case "Subat":
			System.out.println("k��");
			break;
		case "mart":
		case "nisan":
		case "may�s":
			System.out.println("ilkbahar");
			break;
		case "haziran":
		case "temmuz":
		case "a�ustos":
			System.out.println("yaz");
			break;
		case "eyl�l":
		case "ekim":
		case "kas�m":
			System.out.println("sonbahar");
			break;
		default:
			System.out.println("ge�erli ay ismi giriniz");
				
		}scan.close();

	}
	

}
