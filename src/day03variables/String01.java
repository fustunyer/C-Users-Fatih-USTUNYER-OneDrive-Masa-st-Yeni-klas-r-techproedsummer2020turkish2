package day03variables;

public class String01 {

	public static void main(String[] args) {
		
		String isim="s�leyman";
		System.out.println(isim);
		
		String soyIsim="Can";
		
		System.out.println(isim+soyIsim);
		System.out.println(isim+ " "+ soyIsim);
		
		//int data tipine char atamas� yapars�n�z Java o char say� de�erini al�r
		int ilkK���kHarf='a';
		System.out.println(ilkK���kHarf);
		
		//iki char aras�na matemaiksel i�lem koyarsan o
		//char lar�n ASCII de�erleri i�lem yapar...
		System.out.println('a' + 'b');
		
		//�lla ki charlar� yanyana yap��t�rmak isterseniz en ba�a bo� String koyun
		System.out.println(""+'a'+'b');
		
	}

}
