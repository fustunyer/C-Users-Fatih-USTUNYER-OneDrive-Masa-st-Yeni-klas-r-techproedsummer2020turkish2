package day31abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
	
		KralDairesi krl=new KralDairesi();
		krl.cayServisi();
		krl.kahvalti();
		krl.wifi();
	}

	@Override
	public void kahvalti() {
		System.out.println("insan gibi ye...");
	}

	@Override
	public void cayServisi() {
		System.out.println("Kral dairesinde cay servisi olur");
	}
	
	

}
