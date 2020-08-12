package day04scanner;

public class TypeCating01 {

	public static void main(String[] args) {
		// küçük data type'ýnýn büyük data type'ýna cast edilmesi
		// Auto Widening (geniþletme) Casting
		byte b1 = 13;
		int i1 = b1;
		System.out.println(b1);
		System.out.println(i1);
		
		short s1 = 2300;
		float f1 = s1;
		System.out.println(s1);
		System.out.println(f1);
		
		//Explicit (açýkça) Narrowing(daraltma) Casting
		
		short s2 = 12000;
		byte b2 = (byte) s2;
		System.out.println(s2);
		System.out.println(b2);
		
		double d1 = 15.1536;
		float f2 = (float) d1;
		System.out.println(d1);
		System.out.println(f2);
		
		short s3 = 1200;
		byte  b3 =(byte)s3;
		System.out.println(s3);
		System.out.println(b3);
		// byte sýnýrlarýnýn dýþýnda short deðeri alýnýrsa Java þöyle yapýyor. byte -128 den +127 ye 256 sayý olduðundan 
		// yazdýðýmýz 255 ten 256 çýkarýr. 255-256=-1 yazýyor.
		
		// Aþaðýdaki hata kaç farklý þekilde düzeltilebilir.
		
		//  float f3 = 2.34;
		// 1) 2.34 ten sonra f yazarýz. f3 = 2.34f;
		// 2) 2.34 ün önüne float yazarýz float f3 = (float) 2.34;
		// 3) data type ýný double çevirebilirsiniz. double f3 = 2.34;
		
		

	}

}
