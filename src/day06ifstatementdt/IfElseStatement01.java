package day06ifstatementdt;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		int num=-2;
		
		//if else statement'da ya if b�l�m� veya else b�l�m� �al���r.
		//Asla ikisi birden �al��maz.
		//condition do�ruysa if �al���r. condition yanl�� ise else �al���r. 
		
		if(num<0) {
			System.out.println("Negatif");			
		}else {
			System.out.println("negatif de�il");
		}
		
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num>=0) {
			System.out.println("Negatif De�il");
		}
	}

}
