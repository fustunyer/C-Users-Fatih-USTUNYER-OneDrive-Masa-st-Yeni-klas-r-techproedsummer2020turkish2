package day11stringmethodsforloop;

public class StringMethods01 {

	public static void main(String[] args) {
		//11) startWith() methodu ilk karakteri kontrol eder.
		
		String a="Hadi gidelim bu diyardan!";
		System.out.println(a.startsWith("H"));
		System.out.println(a.startsWith(""));
		System.out.println(a.startsWith("Hadi"));
		
		System.out.println(a.startsWith("g",5));
		System.out.println(a.startsWith("i",7));
		System.out.println(a.startsWith("",6));
		
		//12) indexOf() metodu ilk g�rd��� karakterin indexini verir.
		//bu method hem String hem de char kullan�l�r.
				
		System.out.println(a.indexOf("i"));//3
		System.out.println(a.indexOf('d'));//2
		//birden fazla karakter kullan�rsan�z java ilk harfin indexiini verir
		System.out.println(a.indexOf("deli"));	//7	
		//olmayan bir karakter i�in indexOf() kullan�rsan�z -1 return eder
		System.out.println(a.indexOf("x"));
		System.out.println(a.indexOf("deyi"));
		
		
		System.out.println(a.indexOf("d", 4));//7
		System.out.println(a.indexOf("a", 9));//19
		System.out.println(a.indexOf("e",8));//8
		
		//13) lastIndexOf() metodu son g�r�n�m�n indexini verir.
		String b="Java ah java!";
		
		System.out.println(b.lastIndexOf("v"));//10
		//Birden fazla karakter kulln�rsan�z son g�r�n�m� bulur onun 
		//i�indeki karakterlerden ilkinin indexini return eder
		System.out.println(b.lastIndexOf("av"));//9
		
		//14) substring()   bir Stringin belli bir b�l�m�n� kesip almaya yarar.�NEML�
		
		String c = "Karakartal";
		
		System.out.println(c.substring(4));
		System.out.println(c.substring(1));
		//ekrana "kar" yazd�r�n
		//substring() metodunda 2 say� kullan�rsan�z ilk say� dahil ikinci say� hari�tir.
		System.out.println(c.substring(4,7));
		//ilk harfi almak i�in (0,1) kullan�l�r.
		System.out.println(c.substring(0, 1));//K
		//ba�lang�� ve biti� indexlerini ayn� yaparsan�z "" hi�bir�ey alm�� olursunuz.
		System.out.println(c.substring(2,2));//
		// substring() ba�lang�� biti�ten b�y�k olurs run time error al�rs�n�z
		//System.out.println(c.substring(3,5));
		
		
		//15) trim() metodu String te sadece ba� ve son taraflardaki space leri siler
		
		String d="   Java iyidir  ";
		System.out.println(d.length());
		System.out.println(d.trim().length());
	
	}

}
