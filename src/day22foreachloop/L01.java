package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
	
		String s[]= {"A","B","C","D"};
		List<String> sl= new ArrayList<>();
		
		//Bir Array'i nasil Liste cevirebiliriz.
		
		sl = Arrays.asList(s);
		System.out.println(sl);//[A,B,C]
		
		//sl.add("D");
		
		
		//Bir lst nasil arraye cevrilebilir
		/*
		 * Java da her class in en az bir tane parent'i vardir. Parent'i ol
		 * olmayan tek class Object Class tir. Object Class tum classlarin babasidir. 
		 */
		
		Object[] listtenArray=sl.toArray();
		System.out.println(Arrays.toString(listtenArray));
		
		
		
		
		
		

	}

}
