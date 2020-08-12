package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		//Multi Dimentional Array(cok boyutlu Array)
		int mda[][]=new int[3][2];
		
		//Multi Dimentional Array'e deger atamasi nasil yapilir?
		mda[1][0]=7;
		
		//Multi Dimentional Array'ler console a nasil yazdirilir.
		System.out.println(Arrays.deepToString(mda));
		
		mda[2][0]=11;
		System.out.println(Arrays.deepToString(mda));
		mda[0][1]=23;
		System.out.println(Arrays.deepToString(mda));
		mda[0][0]=10;
		mda[1][1]=12;
		mda[2][1]=55;
		System.out.println(Arrays.deepToString(mda));	
		
		/*Multi Dimentional Array'ler console a nasil yazdirilir.
		int mda2[][]= {{10,23},{7,12},{11,55}};
		System.out.println(Arrays.deepToString(mda2));*/
		
		//Multi Dimentional Array'ler istenen bir elemani console a nasil yazdirilir.
		System.out.println(Arrays.toString(mda[0]));
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		
		System.out.println(mda[0][0]);
		System.out.println(mda[1][1]);
		System.out.println(mda[2][0]);
		
		//Multi Dimentional Array olusturmanin kisa yolu.
		
		char mdac[][]= {{'a','b','c'},{'d'},{'e','f'},{'g','h','i','k'}};
		System.out.println(Arrays.deepToString(mdac));
		
		//Soru: yukaridaki mutidimentional Arraydeki ilk arrayin elemanlarinin ASCII degerleri toplaminii ekrana yazdiriniz
		//1. yol
		System.out.println(mdac[0][0]+mdac[0][1]+mdac[0][2]);
		
		int sum=0;
		for (int i = 0; i < mdac[0].length; i++) {
			sum=sum +mdac[0][i];
		}
		System.out.println(sum);
		
		for (int j = 0; j < mdac.length; j++) {
			for (int i = 0; i < mdac[i].length; i++) {
				sum=sum +mdac[j][i];
			}
		}System.out.println(sum);
		
		
		
		
		
		
	}

}
