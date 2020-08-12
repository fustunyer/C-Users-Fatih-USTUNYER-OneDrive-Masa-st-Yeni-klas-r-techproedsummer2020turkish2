package day16constructors;

public class C01 {
	
	int i=12; // instance(object) variable
	static int k=13;//Static(class) variable
	
	public static void main(String[] args) {
		
		C01 obj1 = new C01();
		obj1.i=20;
		System.out.println(obj1.i);
		
		//obj1.k=30;
	
		C01 obj2 = new C01();
		System.out.println(obj2.i);
	//	System.out.println(obj2.k);
		
	}
	/*
	 * 1)static variablelar calss lara aittir ve diger adi class variable dir
	 * Instance variable lar object lere aittir ve diger adi object variable dir.
	 * 2)static variable lardaki degisikliklerkim tarafindan yapilirsa yapilsin butun object ler tarafindan gorulur.
	 * Instance variablelardaki degisiklikler sadece o object tarafindan gorulur.
	 * 3)static variable class olusturulurken Java tarafindan olusturulur. Instance variable lar object ler uretilirken 
	 *  
	 */
}
