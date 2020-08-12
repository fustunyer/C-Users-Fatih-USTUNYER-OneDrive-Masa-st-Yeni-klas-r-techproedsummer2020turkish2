package day30exceptions;

public class E01 {
	/*
	 * 	1)code yazarken kirmizi alt cizgi almadiginiz halse codu calistirdiktan sonra konsolda
	 * kirmizi mesaj alirsaniz buna "Run Time Exception" denir.
	 * 	A) ArithmeticException bir run time exception dur.bir sayiyi 0 a bolerseniz bu exception alirsiniz
	 * 	b) null atanmis bir String in length() ini basmak isterseniz NullPointerException alirsiniz.beforecatch
	 */

	public static void main(String[] args) {
	
		int a=12;
		int b=3;
		
		String s1="";
		//String s2=null;
		
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Bir sayiyi sifira bolememzsiniz");
		}
		System.out.println(s1.length());
		//System.out.println(s2.length());
		
		
		
	}

}
