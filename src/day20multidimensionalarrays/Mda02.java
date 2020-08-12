package day20multidimensionalarrays;

public class Mda02 {

	public static void main(String[] args) {
		/*
		 * Integer multidimensional array olusturun ve tum elemanlari topalmini yazdirin
		 */

		int mdai[][]= {{1,2},{3},{4,5,6}};
		
		//1. yol; Hard coding (onerilmez)
		//System.out.println(mdai[0][0]+mdai[0][1]+mdai[1][0]+mdai[2][0]+mdai[2][1]+mdai[2][2]);
		
		//2. yol;Dynamic coding(tavsiye edilir.)
		int sum=0;
		for (int j = 0; j < mdai.length; j++) {
			for (int i = 0; i < mdai[j].length; i++) {
				System.out.print(mdai[j][i]+"-");
				sum=sum +mdai[j][i];
			}
		}
		System.out.println();
		System.out.println(sum);	
		
		
	}

}
