package day10stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		String s = "Java ah Java!";
		//1)charAt() METODU
		
		//charAt() metodu String den istedi�imiz karakteri se�ip almaya yarar.
		s.charAt(5);
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(8));
		//System.out.println(s.charAt(13));
		
/*note1: Bazen code yazarken k�rm�z� alt �izgi al�r�z. bu hata yap�yoruz demektir.
		      Javada k�rm�z� alt �izgi veren hatalara "Compile Time Error"
  note2: Bazen de Compile time error almay�z Console da k�rm�z� mesajlar al�r�z. 
		  		bunlar da hata yapt���m�z anlam�na gelir. 
		  		bunlar code run edildi�i i�in "Run Time Error" olarak adland�r�l�r.
  note3: charAt() metodunda var olmayan bir index kullan�rsan�z Run Time Error al�rs�n�z.
  ekranda StringIndexOutOfBoundsException mesaj�n� al�rs�n�z.
 */
		//2)contains
		String t="Hayat ah hayat!";
		System.out.println(t.contains("y"));//true
		System.out.println(t.contains("w"));//false
/*contains metodu Stringde herhangi bir karakter veya karkaterler olup 
 *olmad���n� kontrol etmek i�in kullan�l�r.varsa true yoksa false olur.
 * 
 */
		System.out.println(t.contains("yat"));
		System.out.println(t.contains("Ayat"));
		
		//3) endsWith() metodu:
//bu metod bir String hangi karakterler ile bitti�ini bulmak i�in kullan�l�r. true veya false ��kt� verir
		String u = "G�zel G�nler!";
		System.out.println(u.endsWith("!"));//true
		System.out.println(u.endsWith("ler!"));//true
		System.out.println(u.endsWith("x"));//false
		
		//4) length() metodu:
//bu metod bir String teki karakterlerin say�s��n� bulmaya yarar
		String v= "Hey gidi g�nler!";
		System.out.println(v.length());//16
		String v1= " ";
		System.out.println(v1.length());//1
		String v2= "";
		System.out.println(v2.length());//0
		
		//5) toUpperCase() metodu
		String y="Maske tak�n�z!";
		System.out.println(y.toUpperCase());//MASKE TAKINIZ!
		
		//6) toLowerCase() metodu
		String z="Evde Kal!";
		System.out.println(z.toLowerCase());//evde kal!
		
		//7) replace metodu
//bu metod bir String teki bir veya birden fazla karakterin yerine ba�ka bir karakter yazmaya yarar
//Dikkat edin se�ilen karakterlerin tamam�n� de�i�tirir
		String a="Bir �eyler oldu!";
		System.out.println(a.replace("Bir", "�ok"));
		System.out.println(a.replace("e", "a"));
		System.out.println(a.replace("!", "."));
		System.out.println(a.replace("oldu", "de olmad�"));
//bu metodda char da kullan�l�r
		System.out.println(a.replace('r', 'n'));
//replace metodu kullan�larak istenilen bir karakterin tamam� silinebilir
		System.out.println(a.replace("e", ""));
		
		//8) replaceAll() metodu 
// bu metod replece metodu ile ayn� i�i yapar. Farklar�
//1.replaceAll metodu char kabul etmez sadece String ve regex(regular Expession) kabul eder 
//2.replace metodu regex kabul etmez. 		
		
		String b = "Java 1257 ?!@$_";
		//  \\d    >>>ifadesi t�m rakamlar anlam�ndad�r(digit)
		System.out.println(b.replaceAll("\\d", "*"));//Java **** ?!@$_
		//   \\D    >>>ifadesi rakamlar d���ndaki her �ey demektir
		System.out.println(b.replaceAll("\\D", "*"));//*****1257******
		//  \\S    >>> space d���ndaki her �ey demektir		
		System.out.println(b.replaceAll("\\S", "*"));//**** **** *****
		//  \\s     >>> space demektir
		System.out.println(b.replaceAll("\\s", "*"));
		//  space leri de�i�tirmek replace() ile de m�mk�nd�r.
		System.out.println(b.replace(" ", "*"));
		
		//  \\w ifadesi (word-->kelime ve harf) --> a-->z ve A-->Z ve 0-->9 ve  _
		System.out.println(b.replaceAll("\\w" , "*"));//**** **** ?!@$*
		
		//  \\W ifadesi a-->z ve A-->Z ve 0-->9 ve  _ d���ndaki her �ey
		System.out.println(b.replaceAll("\\W" , "*"));//Java*1257*****_
		
		System.out.println(b.replaceAll("Java", "Ali"));
			
		
	}

}
