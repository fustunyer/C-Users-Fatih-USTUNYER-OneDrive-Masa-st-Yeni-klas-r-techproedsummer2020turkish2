package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz");
		String tamIs�m = scan.nextLine();
		//kullan�c�dan String almak i�in next() veya nextline() methodlar� kullan�l�r.
		//nextline t�m sat�r�, next sadece ilk kelimeyi al�r.
		System.out.println(tamIs�m);
		
		scan.close();
		
		
		

	}

}
