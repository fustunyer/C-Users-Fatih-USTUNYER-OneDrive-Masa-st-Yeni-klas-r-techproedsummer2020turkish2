package day30exceptions;

public class E03 {

	public static void main(String[] args) {
		
		String s= "12345";
		String t="abcde";
		
		//Integer wrapperin icinndeki ParseInt() methodu String leri sayiya cevirmek icin kullanilir.
		int i=Integer.parseInt(s);
		System.out.println(i+2);
		
		//eer bir String rakamlardan olusturulmamussa parseInt() methodunu kullanarak sayiya cevirmek isterseniz
		//NumberFormatException alirsiniz.
		int j=Integer.parseInt(t);
		System.out.println(j);
		
		
		
		
		
		
	}

}
