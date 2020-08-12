package day14methodcreation;

public class InstanceLocalVariables01 {
	
	int i=12;//instance variable (main methodun d���nda)

	public static void main(String[] args) {
		/*
1)Instance (g�r�n�m/object) Variable= Object Variable
2)main methodun d���nda class�n i�inde �retilen variable denir.
3)Instance method class�n i�indeki t�m methodlar taraf�ndan kullan�labilir.
		 */
		
		/*
* Local Variable Method body si i�inde �retilen variable 
* bunlar sadece method body i�inde kullan�labilirler.
		 */

	}

	public void toplama() {
		int sonuc=13;
		i++;
		System.out.println(sonuc);
	}
	public void cikarma() {
		i--;
		System.out.println("c�karma");
	}
	
/*
 * 1)instance variable lar�n scope u i�inde bulundu�u class�n heryeridir.
 * 		yani instance variable lar class�n i�inde her yerde kullan�labilir.
 * 2)Local variable lar�n scope u i�inde bulunduklar� method bodysidir.
 * 		yani,Local variable lar method bodysi kullanabilirler
 * 3)bir varible � kullanmak i�in oonce onu create etmek gerekir.
 * 		yani, Create etmeden method bodysi i�inde kullan�rsan hata verir.
 * 
 * 
 * 
 * note: instance varable lara de�er atamas� yapmazsan�z
 *  Java onlara default de�er atamas� yapar ama local variable lara de�er atamazsan�z 
 *  java onlara default de�er atamaz ve o variable � kullanmak  istedi�inizde 
 *  Compile Time Error verir.
 * 
 */
	
}
