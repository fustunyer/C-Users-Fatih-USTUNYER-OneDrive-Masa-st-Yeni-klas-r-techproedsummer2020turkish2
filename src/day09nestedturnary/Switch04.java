package day09nestedturnary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*
		 * ay ismini girince o ayýn mevsimini ekrana yazdýrýn
		 */
		
		//switch'lerde boolean float double long kullanýlmaz.
		//char byte short int String kullanýlýr....
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir ay adý giriniz");
		String ay=scan.next();
		
		switch(ay) {
		case "aralýk":
		case "ocak":
		case "Subat":
			System.out.println("kýþ");
			break;
		case "mart":
		case "nisan":
		case "mayýs":
			System.out.println("ilkbahar");
			break;
		case "haziran":
		case "temmuz":
		case "aðustos":
			System.out.println("yaz");
			break;
		case "eylül":
		case "ekim":
		case "kasým":
			System.out.println("sonbahar");
			break;
		default:
			System.out.println("geçerli ay ismi giriniz");
				
		}scan.close();

	}
	

}
