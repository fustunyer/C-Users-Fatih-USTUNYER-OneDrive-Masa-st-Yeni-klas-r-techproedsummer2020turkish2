package day31abstraction;

public abstract class Otel {
	/*
	 * OTEL PROJECT
1) Bir otelde tek kisilik, aile ve kral odasi var.
2) Butun odalarda kahvalti servisi olmali.
3) Kral dairesinde cay servisi olmali, diger odalarda istege bagli.
4) wifi servisi tum odalar icin istege bagli.
5) Aile odasina ek yatak konmali diger odalarda olmamali.
	 */
/*
 * 1)Abstract classi final yapamayiz cunku final classlarin child classlari olmaz. 
 * 	Halbuki biz Abstract class lari cocuklarina yapacaklari zorunlu seyler icin olustururuz.
 * 	bu celiskiden dolayi Java abstract classlari final yaparsaniz Compile Time rerror verir
 * 2)abstract methodlar da final olamazlar. cunku final methodlar override edilemezler.
 *   biz abstract methodlari override edilmesi icin olusturuyoruz.
 * 3)private da olamazlar....
 */
	
	public abstract void kahvalti();
	
	public void wifi() {
		System.out.println("7/24 wi fi");
	}
	public void cayServisi() {
		System.out.println("7/24 Cay servisi");
	}
	
}

