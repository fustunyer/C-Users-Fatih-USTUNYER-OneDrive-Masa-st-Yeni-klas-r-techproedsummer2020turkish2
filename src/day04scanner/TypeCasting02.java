package day04scanner;

public class TypeCasting02 {

	public static void main(String[] args) {
		// ondal�k decimal bir say�y� byte,short,int, long gibi tamsay�ya assign edersek virgilden sonraki k�sm� iptal eder.
		// sadece tam k�sm� yazar.
		// Java yuvarlama yapmaz.
		int i1 = 5/2;
		System.out.println(i1);
		
		// Java tamsay�/tamsay� sonucunu tamsay� olarak return eder.
		double d1 = 5/2;
		System.out.println(d1);
		
		//matematiksel i�lemlerde birden fazla data type kullan�l�rsa Java sonucu en b�y�k data type a g�re verir.
		double d2 = 5.0/2.0;
		System.out.println(d2);
		
		double d3 = 5/2.0;
		System.out.println(d3);

	}

}
