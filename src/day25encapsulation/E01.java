package day25encapsulation;

public class E01 {
	/*
	 * 1)Encapsulation "data saklamak(Data Hiding) demektir.
	 * 2)Encapsulation yapmak icin variable'lari "private" yapariz.
	 * 3)Encapsualtion yaptiginiz variable i
	 * 	a)okumak icin
	 * 	b)degistirn\mek icin acabilirsiniz.
	 */
	private int sifre = 1234;
	private String isim = "Ali Can";
	private char chr = 'F'; 

	public static void main(String[] args) {
		
	
	}
	//Encapsulation yaptiginiz variable'in baska class lardan okunabilmesini isterseniz 
	//getter method olusturmaniz gerekir.
	//getter olusturmak icin 
	//1)AccessModifier public olsun
	//2)Return type variablein return type ile ayni olsun
	//3)Isim get+Encapsulation yaptiginiz variable
	//4)Methodun icinde "return variable ismi" yazilir.
	
	public int getSifre() {
		return sifre;
	}
	public String getIsim() {
		return isim;
	}
	/*
	 * variable olusturup encapsulation yapiniz 
	 * bu variablein diger classlarda okunabilmesi icin gerekenleri yapiniz
	 * bu  variable i diger class tan cagiriniz
	 */
	
	
	
	public char getChr() {
		return chr;
	}
	/*Setter method 
	 * AccessModifier public olsun
	//2)Return type void olsun
	//3)Isim set+Encapsulation yaptiginiz variable
	//4)Methodun parantezinin icinde variable i retur type'i ile yazilir.
	  5) method body icine "this.ch=ch" gibi yazuiniz
	 */
	
	public void setSifre(int sifre) {
		this.sifre=sifre;		
	}
	
	public void setChr(char chr) {
		this.chr=chr;
	}
	public void setIsim(String isim) {
		this.isim=isim;
	}
	
	
	
	
	
	
	

}
