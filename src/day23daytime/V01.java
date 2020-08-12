package day23daytime;

public class V01 {
	/*
	 * Varargs: (Variable Arguments)normalde bir ARRAYdir. Ancak uzunlugu kullanicinin 
	 * girdigi deger sayisina gore buyur.
	 * not; varargs dipsiz bir kuyu gibidir. icine ne atarsaniz 
	 * 1) Varargs dan sonra baska parametre kullanilamaz. varargs method parantezi icerisinde 
	 * en sonuncu olmalidir.
	 * 2)Varargs sonda olduktan Varargs in oncesinde varargs olmayan paran\metreler kullanilabilir.
	 * 3)bir method parantezinin icinde sadece bir 
	 * 
	 */
		
	public static void main(String[] args) {
		
		
		add(3,5,7,9,11,13,15,17,19);
		add(3,5);
		product(2,3);
		product(2,3,4,5);
		
	}
	
	public static void add(int s1,int s2) {
		System.out.println(s1+s2);
		System.out.println("ilk");
	}
	public static void add(int s1,int s2, int s3) {
		System.out.println(s1+s2);

	}
	
	public static void add(int...x) {
		int sum=0;
		for(int w : x) {
			sum = sum+w;
		}System.out.println(sum);
	}
	
	public static void product(int...y) {
		int product=1;
		for (int i : y) {
			product=product*i;
		}System.out.println(product);
	}
	
	
}