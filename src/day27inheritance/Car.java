package day27inheritance;

public class Car extends Vehicle{
	/*
	 * super() ile parenttan constructor cagirirken parametrelere dikkat edin
	 * parent classta olamyan bir constructor cagirirsaniz CTE alirsiniz
	 * this() class icindeki constructor lari parametrelere gore cagirmak icin kullanilir. 
	 */
	
	
	public Car() {
		super(2);
		System.out.println("Car");
	}
	public Car(String name) {
		this();
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Car car = new Car("Honda");
		System.out.println(car.toString().charAt(0));
		
		
		//method lar objenin olusturuldugu constructora gore secilir
		//metod secerken constructorlara bakin... veriable secerken data tiplerine bakin...
		
		
		

	}

}
