package day10stringmethods;

import java.util.Scanner;

public class StringMethods02 {

	public static void main(String[] args) {
		//9) equals()
		String a = "Java";
		String b = "Java";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Java gir");
		String c= scan.next();
		
		
		System.out.println(a==b);//true
		System.out.println(a.equals(b));//true
		
		System.out.println(a==c);//false
		System.out.println(a.equals(c));//true
		
		scan.close();
		
		//10) equalsIgnoreCase() metodu (küçükbüyükharfleriönemseme)
		String d ="java";
		String e ="JAVA";
		String f ="Java";
		System.out.println(d.equalsIgnoreCase(e));
		System.out.println(e.equalsIgnoreCase(f));
		
		
		
	}

}
