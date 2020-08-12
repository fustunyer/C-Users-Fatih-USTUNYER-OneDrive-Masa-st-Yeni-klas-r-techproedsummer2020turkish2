package day28overriding;

public class Dog extends Animal {

	/*
	 * 1)Parent teki metogu method signature degistirmeden sadece 
	 * method body sini degistirerek Child class ta kullanmaya "method Overriding"denir. 
	 * 2)Parent class daki private method lar override edilemezlereden cunku override demek bu metodu baska classta kullanilamaz demek.
	 *  Kullanamaysin. JAWA kiziyor. Ya public yapmalisin ya da burada artistlik yapma diyor.
	 * 3)final methodlar override edilemezler. cunku method bodyleri son halini aldigi icin final olmustur.
	 *  overriding ise method body sini degistirmek istediginden java buna musade etmez
	 * 4)static methodlar override edilemezler. Cunku static methodlar zaten ortak kullanima aciktir. onun body sini 
	 *  degistirmak herkesi etkiler bu nedenle Java static methodlarin override edilmesine musaade etmez.
	 * 5)Child class taki Overriding methodun access modifieri Parent classtaki Overidden methodun 
	 *  access modifier den daha dar olamaz.
	 * 6)Child class taki override edilmis methodun return type i ya parent classtaki overridden methodun return type ile ayni olabilir 
	 * 	 veya child larindan biri de olabilir.
	 *  
	 *  Overridden==Parent taki override edilen method
	 *  overriding==Child taki degistirilmis method 
	 */
	public static void main(String[] args) {
	Dog dog = new Dog();
	dog.sound();

	}
	public void sound() {
		System.out.println("Havlarlar");
	}
	@Override//Annotation asagidaki methodun override kurallarina uygun olarak override edilip edilmedigini kontrol eder.
	public void numOfFoot() {
		System.out.println("dort ayaklidir");
	}

}//@Overridding ile @overloading arasindaki farki bilmeden interwiev'e girmeyin" Süleyman Alptekin
