package day24accessmodifierstringbuilder;

public class Sb01 {

	public static void main(String[] args) {
		/*
		 * 1)String class her degisim icin yeni bir String olusturur. Var olan Stringi degistirmez. 
		 * bu nedenle Stringler "immutable"(degistirilemezler)denir
		 * 2)StringBuilder ise degisime aciktir. Yani yeni String olusturmadan var olani degistirir
		 * bu nedenle StringBuilderlar "mutable" (Degistirilebilir) demektir
		 *  
		 */
		//3 yol vardir
		//1/ yol
		StringBuilder stb1 = new StringBuilder();
		System.out.println(stb1);
		
		stb1.append("Java");
		System.out.println(stb1);
		stb1.append("Kolaydir");
		System.out.println(stb1);
		//2. yol
		StringBuilder stb2 = new StringBuilder(5);
		stb2.append("Ali");
		System.out.println(stb2);
		stb2.append("Kazandi");
		System.out.println(stb2);
		 //3. yol en cok kullanilan
		
		StringBuilder stb3 = new StringBuilder("Java");
		System.out.println(stb3);
		
		/*Soru:
		 * 1)3. yolu kullanarak bir String olusturun
		 * 2)bu stringe ekleme yapin
		 * 3)bu stringin belli bir bolumunu
		 * 
		 */
		StringBuilder stb4 = new StringBuilder("Fatih");
		stb4.append("Ustunyer").append("Java").append("Ogreniyor");//MethodChain(method Zincir)
		System.out.println(stb4.substring(1, 7));
		System.out.println(stb4);
		
		System.out.println(stb4.charAt(3));
		
		//delete methodunda 2. parametre dahil degildir.
		//System.out.println(stb4.delete(1, 5));
		
		System.out.println(stb4.getClass());// stb4 objesinin 
		System.out.println(stb4);
		
		System.out.println(stb4.indexOf("a", 0));
		
		System.out.println(stb4.indexOf("Java"));
		
		System.out.println(stb4.insert(0,"*"));
		
		System.out.println(stb4.lastIndexOf("i"));
		
		System.out.println(stb4.length());
		
		System.out.println(stb4.replace(6,14, " "));
		
		System.out.println(stb4.reverse());
		
		//String i terten yazdirma
		//1) loop ile
		String s= " ";
		for (int i = stb4.length()-1 ; i >=0 ; i--) {
			s=s+stb4.charAt(i);
		}
		System.out.println(s);
		
		stb4.setCharAt(6, 'a');
		
		//Capacity ile length() farki
		
		StringBuilder stb5= new StringBuilder(9);
		stb5.append("Javammmmmmmm");
		/*
		 * 1)belirlenen kapasiteyi gecerseniz kapacite belirlenen kapasitenin 2 kATININ 2 FAZLASI OLARAK YAZILIR.
		 * BUNU DA GECERSENIZ LKAPASITE ILE LENGTH() AYNI OLUR.
		 */
		
		
		System.out.println(stb5.capacity());
		System.out.println(stb5.length());
		
		
		//Onemli not; 
		StringBuilder stb6= new StringBuilder("Java Kolay");
		//StringBuilder classindan gelen methodlar StringBuilder i degistirir.
		stb6.append("x");
		System.out.println(stb6);//Java Kolayx
		
		//substring String classinin methodudur. bu nedenle StringBuilderi update edemez
		stb6.substring(8);
		System.out.println(stb6);//Java Kolayx
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
