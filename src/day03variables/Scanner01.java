package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz");
		String tamIsým = scan.nextLine();
		//kullanýcýdan String almak için next() veya nextline() methodlarý kullanýlýr.
		//nextline tüm satýrý, next sadece ilk kelimeyi alýr.
		System.out.println(tamIsým);
		
		scan.close();
		
		
		

	}

}
