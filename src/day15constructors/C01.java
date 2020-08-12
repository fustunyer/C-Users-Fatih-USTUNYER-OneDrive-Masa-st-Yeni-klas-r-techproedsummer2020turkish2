package day15constructors;

public class C01 {
	/*//1)contructorlar main mnethodun disinda classin icinde olusturulur
	//2)constructorlarin ismi class ismiyle ayni olmali	
	//3)Method ile Constuctor farkli:a)Method ismi class isminden farkli olabilir
	//									fakat constructors ismi class ismi olmalidir
	//b)Methodlarda return type olmak zorundadir. Constructors return type ol,az
	
	*4)Bir classta birden fazla Constructor olabilir. 
	*Ama constructor larin parametreleri farkli olamlidir.
	*yani fakli constructor uretmek icin overloading kurallarini kullanmaliyiz
	*
	*
	*/
	C01(){
		System.out.println("Parametresiz constructors");
	}
	C01(int i){
		System.out.println("integer parametreli consructor");
	}
	C01(String s){
		System.out.println("String parametreli constructor");
	}
	C01(String s,int i){
		System.out.println("Iki parametreli constructor");
	}
	public static void main(String[] args) {
//class ismi   object isim verin      new keyword kullanin     Constructors
		C01			obj1			=        new				C01();		
		C01			obj2			=		 new				C01("ahmet");
		C01			obj3			=		 new				C01(51);
		C01			obj4			=		 new				C01("ahmet",2);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
	}
	
	
	void toplama() {
		System.out.println("toplama");
	}
	
	
}
