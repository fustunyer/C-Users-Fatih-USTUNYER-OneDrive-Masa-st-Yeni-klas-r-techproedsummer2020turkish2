package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {

		List<Integer> il=new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		// for-each loop=Enhanced loop
		// for-each loop Array lerde kullanilmaz
		for(Integer w: il) {
			System.out.println(w);
		}
		
		// il listinin tum elemnlarini  toplayiniz
		int sum=0;
		for (Integer w : il) {
			sum=sum+w;
		}System.out.println(sum);
		
		// il listinin icindeki tek sayi olan elemanlarin carpimini bulunuz 
		
		int product=1;
		for (int w : il) {
			if (w%2!=0) 
				product=product*w;
		}System.out.println(product);
		
		//il listinin icindeki tek sayi olan elemanlari ekrana yazdiriniz
		
		for (int w : il) {
			if (w%2!=0) 
				System.out.println(w);
		}
		System.out.println("*******************");
		//break ve continue karsilastirmasi
		//il listinin ilk 3 elemanini yazdirrii
		//1, yol
		int count=0;
		for (int w : il) {
			if(count<3) {
			System.out.print(w+" ");
			count++;
			}
		}
		System.out.println();
		System.out.println("*******************");
		//2, yol
		int count1=0;
		for (int w : il) {
			System.out.print(w+" ");
			count1++;
			if(count1==3) {
				break;
			}
		
		}
		
		//il 
		System.out.println();
		System.out.println("*******************");
		for (int w : il) {
			if(w%3==0) {
				System.out.print(w+" ");				
			}
			
		}
		System.out.println();
		System.out.println("*******************");
		//2. yol
		for (int w : il) {
			if(w%3!=0) {
			continue;				
			}
			System.out.print(w+" ");
		}
		
		
	}

}
