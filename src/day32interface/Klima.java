package day32interface;

public interface Klima {
	
	int i=15;
	
	void isitma();
	
	void antiBakteri();
	
	void fiyat();
	
	/*
	 * 1)interface icinde bodysi olan bir meethod isterseniz  ya "default" veya "static" keyword lerden birini kullanmaniz gerekir
	   2) default veya static kullanirsaniz mutlaka body koymalisiniz yoksa CTE alirsiniz
	   3)Interface 
	*/
	
	public default void sogutma() {
		System.out.println("Iyi sogutur.");
	}
	
	public static void fresh() {
	}
	
	
	
	
	

}
