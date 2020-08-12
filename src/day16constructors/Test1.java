package day16constructors;

public class Test1 {
	
	static int i=1;
	int k=1;
	
	public static void main(String[] args) {
	
			for (int i=1;i<10;i++) {
				i=i++;
				System.out.println(i+" ");
				
			}
			 System.out.println(i+" ");
			 
			for (int k=1;k<10;k++) {
				k=k++;
				System.out.println(k+" ");
			}
		
			//System.out.println(k +" ");
	}
//System.out.println(k +" "); hata verir cunku static olmayan k static 
	//olan main methodun icinde kullanilamaz
	
	
	
}
