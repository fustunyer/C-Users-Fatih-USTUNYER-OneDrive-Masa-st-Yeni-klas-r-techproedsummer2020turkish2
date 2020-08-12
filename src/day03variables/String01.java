package day03variables;

public class String01 {

	public static void main(String[] args) {
		
		String isim="süleyman";
		System.out.println(isim);
		
		String soyIsim="Can";
		
		System.out.println(isim+soyIsim);
		System.out.println(isim+ " "+ soyIsim);
		
		//int data tipine char atamasý yaparsýnýz Java o char sayý deðerini alýr
		int ilkKüçükHarf='a';
		System.out.println(ilkKüçükHarf);
		
		//iki char arasýna matemaiksel iþlem koyarsan o
		//char larýn ASCII deðerleri iþlem yapar...
		System.out.println('a' + 'b');
		
		//ýlla ki charlarý yanyana yapýþtýrmak isterseniz en baþa boþ String koyun
		System.out.println(""+'a'+'b');
		
	}

}
