package day15constructors;

public class Araba {

	int yil=2019;
	String marka="Toyota";
	String model="Rav4";
	int fiyat = 20000;
	
	Araba(String model, int fiyat){
		this.model=model;
		this.fiyat=fiyat;
	}
	Araba(){
		
	}
	Araba(String model, int fiyat,int yil, String marka ){
		this.model=model;
		this.fiyat=fiyat;
		this.marka=marka;
		this.yil=yil;
	}
	public static void main(String[] args) {
		Araba a1 = new Araba();
		System.out.println("Fiyat: "+ a1.fiyat);
		System.out.println("Marka: "+ a1.marka);
		System.out.println("Model: "+ a1.model);
		System.out.println("yil: " + a1.yil);
		a1.hizlanma(8);
		a1.tuketim();
		System.out.println("====================");
		
		Araba a2 = new Araba("Corolla",12000);
		System.out.println("Fiyat: "+ a2.fiyat);
		System.out.println("Marka: "+ a2.marka);
		System.out.println("Model: "+ a2.model);
		System.out.println("yil: " + a2.yil);
		a2.hizlanma(7);
		a2.tuketim();
//arabanin fiyat marka model ve yilini degistirebilen bir constructor uretiniz
		System.out.println("====================");
		Araba a3 = new Araba("passat",15000,2015,"volkswagen");
		System.out.println("Fiyat: "+ a3.fiyat);
		System.out.println("Marka: "+ a3.marka);
		System.out.println("Model: "+ a3.model);
		System.out.println("yil: " + a3.yil);
		a3.hizlanma(4);
		a3.tuketim();
		
	}
	public void hizlanma(int i) {
		System.out.println(i+ "sn'de 100km/sa e ulasir");
	}
	public void tuketim() {
		System.out.println("km'de 0.1 dolar yakar");
	}
}
