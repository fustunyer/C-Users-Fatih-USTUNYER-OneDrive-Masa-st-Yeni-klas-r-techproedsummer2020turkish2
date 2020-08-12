package day30exceptions;

public class F01 {
	/*
	  final finally ve finalize() arasindaki farklar nelerdir.?
	  final ve finally keywordtur finalize() method tur
	  
	  final: final keyword variable dan methodlardan ve classlardan once kullanilabilir.
	 		1)Final variable: bir variable final ise o variable a deger atamasi yaparsiniz  ve o degeri degistiremezsiniz.
	 		2)final method : body si son halde olan methodlardir. yani bodysi degistirlemeyecek olan methodlardir
	 						final methodlar override edilemezler
	 						
	 		3)final class: Child i olamaz Inheritance yapilamaz.
	 
	 finally: try catch block tan sonra kullanilir. try block exception uretse de uretmese de calisir.
	 
	 finalize():Java Garbage Collecctor silmesi gereken datalari ponce finilize eder sonra imha eder.
	 */
	
	final static double pi=3.14;
	
	

	public static void main(String[] args) {
		
	
		

	}

}
