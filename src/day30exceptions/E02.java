package day30exceptions;

public class E02 {
	/*
	 * 1)IllegalArgumentException bir Run Time Exception dur. istedigimiz sartlara uygun 
	 * argumentler kullanilmadigi zaman bu exception devreye girer.
	 * 
	 * 2)throw ile throws farki nedir?
	 * 	A)throw method body si icine yazilir throws Method parantezi ile curly brace arasinda 
	 * kullnilir ) throws IOException {
	 * 	B)throwu method body icinde istediginiz yerde istediginiz kadar kullanabilirz. throws ise
	 *  sadece bir kere kullanabilir.
	 *  C) 1 throw sadece 1 exception uretir. 1 throws tan sonr avirgulle birden cok exception uretebilirsiniz
	 *  D) throws tan sonrsa sadece exception c;\lassini ismi yazilir throws IOException
	 *  	throw dan sonra mutlaka new ve constructor yazilmasi gerekir.
	 *   
	 * 
	 */

	public static void main(String[] args) {
		
		countEgg(-8);
		division(15,5);
		

	}
	public static void countEgg(int numofEgg) {
		try {
			
		
		if(numofEgg<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println(numofEgg);
		}
		}catch(IllegalArgumentException e) {
			System.out.println("Ben sana yuurta sayisi diyorum sen negatif sayi kullaniyorsun.");
		}
		
			
		}
	public static void division(int a, int b) {
		try {
		if(b%2!=2) {
			throw new ArithmeticException();
		}else {
			System.out.println(a/b);
		}}
		catch(ArithmeticException e){
			
			System.out.println("tek sayilara bolme demedik mi?");
		}

}
}