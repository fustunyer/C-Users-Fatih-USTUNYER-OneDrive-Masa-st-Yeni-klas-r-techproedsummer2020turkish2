package day11stringmethodsforloop;

public class ForLoop01 {

	public static void main(String[] args) {
		// Ekrana 10 dafa "Java" yazdýrýn
		/*System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		*/
		//yukarýdaki iþi for-loop kullanarak kýsaca yapabiliriz
		//   Baþlangýç   condition Arttýrma/azaltma 
	    //for (int i = 1  ; i<=10   ;    i++       ) {
	    //	System.out.println("Java");
	    //}
		//ekrana 1 den 7 ye kadar olan tamsayýlarý ayzdýýnýz
		//for (int i = 1  ; i<=7   ;    i++       ) {
			//System.out.println(i);
		//}
		//ekrana 4321 yazdýrýn
		//for (int i = 4  ; i>=1   ;    i--     ) {
		//	System.out.println(i);
		//}
		
		
		//ekrana ilk üç çift  sayma sayýsýný yazdýrýn
		//1.yol
		//for(int j=2   ;  j<=6     ; j=j+2      ) {
			//System.out.println(j);	
		//}
		//for (int i = 1 ; i<=6       ; i++     ) {
			//if (i%2==0) {
				//System.out.println(i);
			//}
			
		//ekrana ilk 100 çift sayma sayýsýný yazdýrýnýz
		for (int j = 1; j <=100 ; j++) {
			System.out.print(2*j+"-");
		}
		//loop larýn öncesinde bir variable oluþturup onu
		//loopun içinde kullanýrsanýzbu variable lara "Flag" denir 
		//Aþaðýdaki soruda sayma bir Flag dir. 
		int sayma=1;
		for (int i = 1; sayma<=100 ; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
				sayma++;
			}
		}
			
		
			
		
	}
	    	   
}
