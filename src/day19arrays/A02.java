package day19arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
	
		//Bir Stringi parcalara ayirmak
		
		String str = "Ipek topu at, topu at Ipek. Ayse yeni kelime ekledi";
		
		String strArray[]=str.split(",");
		System.out.println(Arrays.toString(strArray));
		
		//str Stringinde kac kelime var
		String strArray1[]=str.split(" ");
		System.out.println(Arrays.toString(strArray1));
		System.out.println(strArray1.length);
		
		String tArray[]=str.split("");//bu code  space dahil tum karakterleri ayirir
		System.out.println(Arrays.toString(tArray));
		
		
		
		
		
		
		

	}

}
