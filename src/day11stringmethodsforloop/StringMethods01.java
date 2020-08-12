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
		
		//12) indexOf() metodu ilk gördüðü karakterin indexini verir.
		//bu method hem String hem de char kullanýlýr.
				
		System.out.println(a.indexOf("i"));//3
		System.out.println(a.indexOf('d'));//2
		//birden fazla karakter kullanýrsanýz java ilk harfin indexiini verir
		System.out.println(a.indexOf("deli"));	//7	
		//olmayan bir karakter için indexOf() kullanýrsanýz -1 return eder
		System.out.println(a.indexOf("x"));
		System.out.println(a.indexOf("deyi"));
		
		
		System.out.println(a.indexOf("d", 4));//7
		System.out.println(a.indexOf("a", 9));//19
		System.out.println(a.indexOf("e",8));//8
		
		//13) lastIndexOf() metodu son görünümün indexini verir.
		String b="Java ah java!";
		
		System.out.println(b.lastIndexOf("v"));//10
		//Birden fazla karakter kullnýrsanýz son görünümü bulur onun 
		//içindeki karakterlerden ilkinin indexini return eder
		System.out.println(b.lastIndexOf("av"));//9
		
		//14) substring()   bir Stringin belli bir bölümünü kesip almaya yarar.ÖNEMLÝ
		
		String c = "Karakartal";
		
		System.out.println(c.substring(4));
		System.out.println(c.substring(1));
		//ekrana "kar" yazdýrýn
		//substring() metodunda 2 sayý kullanýrsanýz ilk sayý dahil ikinci sayý hariçtir.
		System.out.println(c.substring(4,7));
		//ilk harfi almak için (0,1) kullanýlýr.
		System.out.println(c.substring(0, 1));//K
		//baþlangýç ve bitiþ indexlerini ayný yaparsanýz "" hiçbirþey almýþ olursunuz.
		System.out.println(c.substring(2,2));//
		// substring() baþlangýç bitiþten büyük olurs run time error alýrsýnýz
		//System.out.println(c.substring(3,5));
		
		
		//15) trim() metodu String te sadece baþ ve son taraflardaki space leri siler
		
		String d="   Java iyidir  ";
		System.out.println(d.length());
		System.out.println(d.trim().length());
	
	}

}
