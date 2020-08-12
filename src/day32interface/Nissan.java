package day32interface;

public class Nissan implements Car,Klima{

	public static void main(String[] args) {
	
		Nissan nissan=new Nissan();
		System.out.println(Car.i);
		System.out.println(Klima.i);
		nissan.antiBakteri();
		nissan.direksiyon();

	}

	@Override
	public void motor() {
		
	}

	@Override
	public void direksiyon() {
		
		
	}

	@Override
	public void teker() {
		
		
	}

	@Override
	public void fiyat() {
		
	}

	@Override
	public void isitma() {
	
		
	}

	@Override
	public void antiBakteri() {
		
	}

}
