package day15constructors;

public class C02 {/*
1)class olusturdugumuzda Java bizim kesinlikle obje uretecegimizi dusunur ve class ile beraber 
gorunmez bir constructor olusturur. bu Constructor parametresiz Constructor'dir ve ismi "Default Constructor" dir
2)Siz kendiniz herhangi bir constructor uretirseniz Java default constructor iptal eder.
		 *
		 */
	C02(int i){
		
	}
	C02(){
		
	}

	public static void main(String[] args) {
	
		C02 obj1=new C02();
		System.out.println(obj1);
	
	}

}
