package day04scanner;

public class TypeCasting02 {

	public static void main(String[] args) {
		// ondalýk decimal bir sayýyý byte,short,int, long gibi tamsayýya assign edersek virgilden sonraki kýsmý iptal eder.
		// sadece tam kýsmý yazar.
		// Java yuvarlama yapmaz.
		int i1 = 5/2;
		System.out.println(i1);
		
		// Java tamsayý/tamsayý sonucunu tamsayý olarak return eder.
		double d1 = 5/2;
		System.out.println(d1);
		
		//matematiksel iþlemlerde birden fazla data type kullanýlýrsa Java sonucu en büyük data type a göre verir.
		double d2 = 5.0/2.0;
		System.out.println(d2);
		
		double d3 = 5/2.0;
		System.out.println(d3);

	}

}
