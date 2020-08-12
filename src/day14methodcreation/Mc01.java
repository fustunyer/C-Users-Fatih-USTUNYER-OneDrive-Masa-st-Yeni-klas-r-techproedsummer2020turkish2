package day14methodcreation;

public class Mc01 {
	// static method lar�n i�ine kullan�lan her �ey static olmal�
	//code yazarken ilk bakt�klar� �ey tekrar code 
	public static void main(String[] args) {
		toplama(3,5);
		cikarma(5,1);
//method �a�r�l�rken kulland���m�z de�erlere  "arg�ment" denir
		carpma(2,4);
		carpma(5);
		carpma(3,5);

		
		

	}
//Method olu�tururken parantezin i�ine yazd���n�z variable lara "parametre" denir.
	public static void toplama(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public static void cikarma(int n1, int n2) {
		System.out.print("Sonu�: ");
		System.out.println(n1-n2);
	}
// �arpma metodu olu�turun ve �a��r�n
	//public static void carpma(int n1,int n2) {
	//	System.out.print("sonu�: ");
		//System.out.println(n1*n2);
	
/*1)Parametre say�s�n� de�i�tirek Ayn� isimli method �retebilirsiniz. 
2)Paramaetre say�s� ayn� oldu�u halde data type lar�n� de�i�tirerek de 
ayn� isimli method �retilebilir
3)Parametrelerin data type lar� farkl� oldu�unda yerlerinin 
de�istirerek ayn� isimli methodlar  �retebiliriz

note:
Parametreleri de�i�tirerek 1den fazla ayn� isimli method �retmeye
" METHOD OVERLOADING" denir. 

 return type de�i�tirerek method overloading yap�lamaz.
 access modifier lar� de�i�tirerek method overloading yap�lamaz.
 method body ler de�i�tirilerek method overloading yap�lamaz
 
 Method Overloading Compile Time Polymorphism dir.
 * */
	public static void carpma(int n1) {
		System.out.println("Ikinci  carpma methodu");
	}
	public static void carpma(byte n1) {
		System.out.println("Alt�nc� carpma methodu");
	}
	public static void carpma(long n1) {
		System.out.println("ucuncu carpma methodu");
	}
	public static void carpma(double n1,double n2) {
		System.out.println("dorduncu carpma methodu");
	}
	public static void carpma(double n1,int n2) {
		System.out.println("Besinci carpma methodu");
	}
	
	
	
}
