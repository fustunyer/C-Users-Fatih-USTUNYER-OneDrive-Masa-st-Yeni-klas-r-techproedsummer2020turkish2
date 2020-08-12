package day32interface;

public interface Car {
	/*
	 * 1)interface class degildir. Interface interface tir.
	 * 2)Abstract classlarin icine concrete methodlar koyabilirdik ama interface lerin icine(
	 * 	bazi ozel durumlar haric) concrete method koytamayiz 
	 * 	yani interface ler sadece abstract method icerebilir bu nedenle interface kullanimi "full abstraction" olarak adandirilir.
	 *    
	 * 3)interface ler iclerindeki methodlari default olarak abstract kabul ederler. bu yuzden  abstract keyword kullanmak 
	 *  istege baglidir. 
	 * 4)Concrete  method olusturursan CTE verir
	 * 5)interface teki methodlar default olarak "public" olurlar. protected private veya default olamaz.
	 *   ***********************Child ve Parent ayni turden ise "extends" kullanlilr**********************
	 * 
	 * 6)Interface lerde variablelar default olarak "final" olurlar
	 * 7)Interrfacelerde variable larin access modifier lari "public" olur
	 * 8)Interfacelerde variable lar default olarak "static olurlar.
	 * 9)Interface lerde variable olusturdugumuzda mutlaka deger atamasi (initialize) yapmalisiniz 
	 * 10) Interfacelerde obje uretilemez
	 */
	int i=12;
	
	public final static int k=13; // int k=13; =======public final static int k=13; aynidir.
		
	public void motor();
	
	public abstract void direksiyon();
	
	void teker();//void teker()==abstract void teker()==public abstract void teker();
	
	void fiyat();
	
	
	
	
	
	
	
	

}
