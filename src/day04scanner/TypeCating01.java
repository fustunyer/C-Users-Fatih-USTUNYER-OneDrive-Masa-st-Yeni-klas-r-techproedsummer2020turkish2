package day04scanner;

public class TypeCating01 {

	public static void main(String[] args) {
		// k���k data type'�n�n b�y�k data type'�na cast edilmesi
		// Auto Widening (geni�letme) Casting
		byte b1 = 13;
		int i1 = b1;
		System.out.println(b1);
		System.out.println(i1);
		
		short s1 = 2300;
		float f1 = s1;
		System.out.println(s1);
		System.out.println(f1);
		
		//Explicit (a��k�a) Narrowing(daraltma) Casting
		
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
		// byte s�n�rlar�n�n d���nda short de�eri al�n�rsa Java ��yle yap�yor. byte -128 den +127 ye 256 say� oldu�undan 
		// yazd���m�z 255 ten 256 ��kar�r. 255-256=-1 yaz�yor.
		
		// A�a��daki hata ka� farkl� �ekilde d�zeltilebilir.
		
		//  float f3 = 2.34;
		// 1) 2.34 ten sonra f yazar�z. f3 = 2.34f;
		// 2) 2.34 �n �n�ne float yazar�z float f3 = (float) 2.34;
		// 3) data type �n� double �evirebilirsiniz. double f3 = 2.34;
		
		

	}

}
