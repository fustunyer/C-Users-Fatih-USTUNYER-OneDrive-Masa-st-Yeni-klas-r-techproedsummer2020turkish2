package day06ifstatementdt;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		int num=-2;
		
		//if else statement'da ya if bölümü veya else bölümü çalýþýr.
		//Asla ikisi birden çalýþmaz.
		//condition doðruysa if çalýþýr. condition yanlýþ ise else çalýþýr. 
		
		if(num<0) {
			System.out.println("Negatif");			
		}else {
			System.out.println("negatif deðil");
		}
		
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num>=0) {
			System.out.println("Negatif Deðil");
		}
	}

}
