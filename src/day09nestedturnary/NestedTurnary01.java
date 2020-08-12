package day09nestedturnary;

import java.util.Scanner;

public class NestedTurnary01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sayi alin
		 Sayi pozitif ise 9 dan buyukmu diye kontrol edin
		 9 dan buyuk ise "Sayi" degilse "Rakam" yazdirin
		 Sayi pozitif degilse 0 mi diye kontrol edin
		 o ise "Rakam" degilse "Negatif sayi" yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int s = scan.nextInt();
				
		String result=(s>0) ? ( (s>9) ? ("sayi" ) : ("rakam")) : ((s==0) ? ("rakam"): ("negatif sayi"));
		System.out.println(result);
		
		String result1=s>0 ? s>9 ? "sayi" : "rakam" : s==0 ? "rakam" : "negatif sayi";
		System.out.println(result1);
		scan.close();
	}

}
