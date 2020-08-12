package day14methodcreation;

public class InstanceLocalVariables01 {
	
	int i=12;//instance variable (main methodun dýþýnda)

	public static void main(String[] args) {
		/*
1)Instance (görünüm/object) Variable= Object Variable
2)main methodun dýþýnda classýn içinde üretilen variable denir.
3)Instance method classýn içindeki tüm methodlar tarafýndan kullanýlabilir.
		 */
		
		/*
* Local Variable Method body si içinde üretilen variable 
* bunlar sadece method body içinde kullanýlabilirler.
		 */

	}

	public void toplama() {
		int sonuc=13;
		i++;
		System.out.println(sonuc);
	}
	public void cikarma() {
		i--;
		System.out.println("cýkarma");
	}
	
/*
 * 1)instance variable larýn scope u içinde bulunduðu classýn heryeridir.
 * 		yani instance variable lar classýn içinde her yerde kullanýlabilir.
 * 2)Local variable larýn scope u içinde bulunduklarý method bodysidir.
 * 		yani,Local variable lar method bodysi kullanabilirler
 * 3)bir varible ý kullanmak için oonce onu create etmek gerekir.
 * 		yani, Create etmeden method bodysi içinde kullanýrsan hata verir.
 * 
 * 
 * 
 * note: instance varable lara deðer atamasý yapmazsanýz
 *  Java onlara default deðer atamasý yapar ama local variable lara deðer atamazsanýz 
 *  java onlara default deðer atamaz ve o variable ý kullanmak  istediðinizde 
 *  Compile Time Error verir.
 * 
 */
	
}
