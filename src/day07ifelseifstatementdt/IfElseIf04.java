package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*s�n�f ge�me
		 * kullan�c�dan 2 not al�n
		 * ortalama
		 * not 50 nin alt�nda ise "kald�n�z" 
		 * not 70 in alt�nda ise "C ile ge�tiniz
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Notunuzu giriniz");
		int not1=scan.nextInt();
		System.out.println("2.Notunuzu giriniz");
		int not2=scan.nextInt();
		
		double ort=(not1+not2)/2;
		
		boolean b1 = not1<0 || not2<0 || not1>100 || not2>100;

		if(b1) {
			System.out.println("gecerli not giriniz");
		}else if(ort<50) {
			System.out.println("kald�n�z");
			System.out.println(ort);
		}else if(ort<70){
			System.out.println("C ile ge�tiniz");
			System.out.println(ort);
		}else if(ort<85){
			System.out.println("B ile ge�tiniz");
			System.out.println(ort);
		}else if(ort<=100){
			System.out.println("A ile ge�tiniz");
			System.out.println(ort);
						
			
		}
		scan.close();


	}

}
