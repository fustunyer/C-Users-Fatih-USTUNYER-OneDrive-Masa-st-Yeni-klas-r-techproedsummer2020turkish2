package day11stringmethodsforloop;

public class ForLoop01 {

	public static void main(String[] args) {
		// Ekrana 10 dafa "Java" yazd�r�n
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
		//yukar�daki i�i for-loop kullanarak k�saca yapabiliriz
		//   Ba�lang��   condition Artt�rma/azaltma 
	    //for (int i = 1  ; i<=10   ;    i++       ) {
	    //	System.out.println("Java");
	    //}
		//ekrana 1 den 7 ye kadar olan tamsay�lar� ayzd��n�z
		//for (int i = 1  ; i<=7   ;    i++       ) {
			//System.out.println(i);
		//}
		//ekrana 4321 yazd�r�n
		//for (int i = 4  ; i>=1   ;    i--     ) {
		//	System.out.println(i);
		//}
		
		
		//ekrana ilk �� �ift  sayma say�s�n� yazd�r�n
		//1.yol
		//for(int j=2   ;  j<=6     ; j=j+2      ) {
			//System.out.println(j);	
		//}
		//for (int i = 1 ; i<=6       ; i++     ) {
			//if (i%2==0) {
				//System.out.println(i);
			//}
			
		//ekrana ilk 100 �ift sayma say�s�n� yazd�r�n�z
		for (int j = 1; j <=100 ; j++) {
			System.out.print(2*j+"-");
		}
		//loop lar�n �ncesinde bir variable olu�turup onu
		//loopun i�inde kullan�rsan�zbu variable lara "Flag" denir 
		//A�a��daki soruda sayma bir Flag dir. 
		int sayma=1;
		for (int i = 1; sayma<=100 ; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
				sayma++;
			}
		}
			
		
			
		
	}
	    	   
}
