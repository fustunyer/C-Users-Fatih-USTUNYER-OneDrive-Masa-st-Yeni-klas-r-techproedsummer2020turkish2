package day32interface;

public class Honda implements Car,Klima{
	/*
	 * 1) bir classi bir interface in childi yapmak icin "implements" keyword kullaniriz
	 * 2)Abstract class kllanarak abstrction yaparsak bir classa birden fazlla parent koyamayiz 
	 *  cunku Java multiple inheritance musaade etmez bu nedenle interface kullaniriz cunku 
	 *  interface te bir class ta birden fazla parent alusturarak calistirabiliriz.
	 *  Well Organized  
	 * 3)Birden fazla interface i bir class icin parent yaptiginizda parent olan interface lerde yni isimli 
	 * 	methodlar kullanabilirsiniz ama ayni isimli methodlarin return type lari ayni olmak zorundadir 
	 *  ayni olmazsa CTE alirsiniz.
	 * 4)Birden fazla interface i bir class icin parent yaptiginizda parent olan interface lerde yni isimli 
	 *   variable lar kullanabilirsiniz ancak hangi variablei kullanacaginiza sizin karar vermeniz gerekir (interface ismiyle)
	 *   aksi halde Java hangi interface teki variable i kullancagina karar veremez ve CTE alirsiniz.
	 * 
	 */
	

	public static void main(String[] args) {
		Honda honda=new Honda();
		honda.antiBakteri();
		honda.isitma();
		honda.direksiyon();
		honda.motor();
		honda.teker();
		System.out.println(Car.i);
		System.out.println(Klima.i);

	}

	@Override
	public void motor() {
	System.out.println("1.6 VTEC Diesel");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("suni deri");
		
	}
	
	@Override
	public void teker() {
		System.out.println("16 inch alasim");
	}

	@Override
	public void isitma() {
		System.out.println("var");
	}

	@Override
	public void antiBakteri() {
		System.out.println("99% bakteri korumali");			
	}

	@Override
	public void fiyat() {
		System.out.println("ozellige gore degisir");
		
	}

}
