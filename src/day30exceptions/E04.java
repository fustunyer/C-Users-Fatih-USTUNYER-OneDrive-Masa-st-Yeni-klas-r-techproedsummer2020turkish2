package day30exceptions;

public class E04 {

	public static void main(String[] args) {
		
		Object obj=new Integer(100);
		//Java byte short int long float double arasinda casting yapabilir ama wrapper classlari 
		//Stringe ceviremez. bunu yapmaya calisirsaniz "ClassCastException" alirsiniz
		// ClassCastException Run Time Exception dur
		System.out.println((byte) obj);
		
		
	}

}
