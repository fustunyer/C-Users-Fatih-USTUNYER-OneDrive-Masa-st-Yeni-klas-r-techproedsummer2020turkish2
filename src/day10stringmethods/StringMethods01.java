package day10stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		String s = "Java ah Java!";
		//1)charAt() METODU
		
		//charAt() metodu String den istediðimiz karakteri seçip almaya yarar.
		s.charAt(5);
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(8));
		//System.out.println(s.charAt(13));
		
/*note1: Bazen code yazarken kýrmýzý alt çizgi alýrýz. bu hata yapýyoruz demektir.
		      Javada kýrmýzý alt çizgi veren hatalara "Compile Time Error"
  note2: Bazen de Compile time error almayýz Console da kýrmýzý mesajlar alýrýz. 
		  		bunlar da hata yaptýðýmýz anlamýna gelir. 
		  		bunlar code run edildiði için "Run Time Error" olarak adlandýrýlýr.
  note3: charAt() metodunda var olmayan bir index kullanýrsanýz Run Time Error alýrsýnýz.
  ekranda StringIndexOutOfBoundsException mesajýný alýrsýnýz.
 */
		//2)contains
		String t="Hayat ah hayat!";
		System.out.println(t.contains("y"));//true
		System.out.println(t.contains("w"));//false
/*contains metodu Stringde herhangi bir karakter veya karkaterler olup 
 *olmadýðýný kontrol etmek için kullanýlýr.varsa true yoksa false olur.
 * 
 */
		System.out.println(t.contains("yat"));
		System.out.println(t.contains("Ayat"));
		
		//3) endsWith() metodu:
//bu metod bir String hangi karakterler ile bittiðini bulmak için kullanýlýr. true veya false çýktý verir
		String u = "Güzel Günler!";
		System.out.println(u.endsWith("!"));//true
		System.out.println(u.endsWith("ler!"));//true
		System.out.println(u.endsWith("x"));//false
		
		//4) length() metodu:
//bu metod bir String teki karakterlerin sayýsýýný bulmaya yarar
		String v= "Hey gidi günler!";
		System.out.println(v.length());//16
		String v1= " ";
		System.out.println(v1.length());//1
		String v2= "";
		System.out.println(v2.length());//0
		
		//5) toUpperCase() metodu
		String y="Maske takýnýz!";
		System.out.println(y.toUpperCase());//MASKE TAKINIZ!
		
		//6) toLowerCase() metodu
		String z="Evde Kal!";
		System.out.println(z.toLowerCase());//evde kal!
		
		//7) replace metodu
//bu metod bir String teki bir veya birden fazla karakterin yerine baþka bir karakter yazmaya yarar
//Dikkat edin seçilen karakterlerin tamamýný deðiþtirir
		String a="Bir þeyler oldu!";
		System.out.println(a.replace("Bir", "Çok"));
		System.out.println(a.replace("e", "a"));
		System.out.println(a.replace("!", "."));
		System.out.println(a.replace("oldu", "de olmadý"));
//bu metodda char da kullanýlýr
		System.out.println(a.replace('r', 'n'));
//replace metodu kullanýlarak istenilen bir karakterin tamamý silinebilir
		System.out.println(a.replace("e", ""));
		
		//8) replaceAll() metodu 
// bu metod replece metodu ile ayný iþi yapar. Farklarý
//1.replaceAll metodu char kabul etmez sadece String ve regex(regular Expession) kabul eder 
//2.replace metodu regex kabul etmez. 		
		
		String b = "Java 1257 ?!@$_";
		//  \\d    >>>ifadesi tüm rakamlar anlamýndadýr(digit)
		System.out.println(b.replaceAll("\\d", "*"));//Java **** ?!@$_
		//   \\D    >>>ifadesi rakamlar dýþýndaki her þey demektir
		System.out.println(b.replaceAll("\\D", "*"));//*****1257******
		//  \\S    >>> space dýþýndaki her þey demektir		
		System.out.println(b.replaceAll("\\S", "*"));//**** **** *****
		//  \\s     >>> space demektir
		System.out.println(b.replaceAll("\\s", "*"));
		//  space leri deðiþtirmek replace() ile de mümkündür.
		System.out.println(b.replace(" ", "*"));
		
		//  \\w ifadesi (word-->kelime ve harf) --> a-->z ve A-->Z ve 0-->9 ve  _
		System.out.println(b.replaceAll("\\w" , "*"));//**** **** ?!@$*
		
		//  \\W ifadesi a-->z ve A-->Z ve 0-->9 ve  _ dýþýndaki her þey
		System.out.println(b.replaceAll("\\W" , "*"));//Java*1257*****_
		
		System.out.println(b.replaceAll("Java", "Ali"));
			
		
	}

}
