package day26passbyvalueinheritance;

public class PassByValue {
	/*
	 * java bir methoda bir variable a ait degeri yollarken o degerin kopyasini olusturur
	 *  ve kopyayi methoda yollar. Method kendisine yollanan degeri degistiiken kopya degeri 
	 *  degistirmis olur Java bu sayede variable a ait orijinal korumus olur. 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		int gomlek=100;//100
		indOrg(gomlek);//80
		System.out.println(gomlek);//100
		askInd(gomlek);
		System.out.println(askInd(gomlek));
		System.out.println(gomlek);
		
		String hazine="Altin";
		System.out.println(hazineCal(hazine));
		System.out.println(hazine);
		
		
	}
	public static int indOrg(int gomlek) {
		return gomlek-20;
	}
	public static int askInd(int gomlek) {
		return gomlek - 5;
	}
	public static String hazineCal(String hazine) {
		return hazine+" Calindi";		
	}

}
