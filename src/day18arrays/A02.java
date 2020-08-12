package day18arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		
	//length ayni olan iki array olusturunuz bu array larin tum elemanlari ayni
	//	ise ekrana ayni farkli ise "farkli " yazdirin
		
		/*char ch1[]= {'a','d','c','k'};
		char ch2[]= {'a','d','c','k'};
		
		int z=0;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i]) {
				z++;
			}
		}
		if(z==ch1.length) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni degil");
		}
		*/
		char ch1[]= {'a','d','x','k'};
		char ch2[]= {'a','d','c','k'};
		int z=0;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i]) {
				z++;
			}
		}
		if(z==ch1.length) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni degil");
		}
		//length ayni olan iki array olusturunuz bu array larin tum elemanlari ayni
		//	ise ekrana ayni farkli ise "farkli " yazdirin
		//2. YOL
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni degil");
		}
		

	}

}
