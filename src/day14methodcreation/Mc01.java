package day14methodcreation;

public class Mc01 {
	// static method larýn içine kullanýlan her þey static olmalý
	//code yazarken ilk baktýklarý þey tekrar code 
	public static void main(String[] args) {
		toplama(3,5);
		cikarma(5,1);
//method çaðrýlýrken kullandýðýmýz deðerlere  "argüment" denir
		carpma(2,4);
		carpma(5);
		carpma(3,5);

		
		

	}
//Method oluþtururken parantezin içine yazdýðýnýz variable lara "parametre" denir.
	public static void toplama(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public static void cikarma(int n1, int n2) {
		System.out.print("Sonuç: ");
		System.out.println(n1-n2);
	}
// çarpma metodu oluþturun ve çaðýrýn
	//public static void carpma(int n1,int n2) {
	//	System.out.print("sonuç: ");
		//System.out.println(n1*n2);
	
/*1)Parametre sayýsýný deðiþtirek Ayný isimli method üretebilirsiniz. 
2)Paramaetre sayýsý ayný olduðu halde data type larýný deðiþtirerek de 
ayný isimli method üretilebilir
3)Parametrelerin data type larý farklý olduðunda yerlerinin 
deðistirerek ayný isimli methodlar  üretebiliriz

note:
Parametreleri deðiþtirerek 1den fazla ayný isimli method üretmeye
" METHOD OVERLOADING" denir. 

 return type deðiþtirerek method overloading yapýlamaz.
 access modifier larý deðiþtirerek method overloading yapýlamaz.
 method body ler deðiþtirilerek method overloading yapýlamaz
 
 Method Overloading Compile Time Polymorphism dir.
 * */
	public static void carpma(int n1) {
		System.out.println("Ikinci  carpma methodu");
	}
	public static void carpma(byte n1) {
		System.out.println("Altýncý carpma methodu");
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
