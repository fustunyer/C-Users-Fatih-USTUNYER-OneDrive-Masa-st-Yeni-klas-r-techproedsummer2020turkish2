package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
	 
	int arr1[] = new int[3];//0,0,0 default degerli bir array uretildi
	//Bir arrayi console a yaxzdirmak icin Arrays.toString() kullaniriz
	System.out.println(Arrays.toString(arr1));
	
	//Bir array e elaman ekleme
	arr1[2]=11;
	System.out.println(Arrays.toString(arr1));
	arr1[1]=9;
	System.out.println(Arrays.toString(arr1));
	arr1[0]=7;
	System.out.println(Arrays.toString(arr1));
	//arr1[3]=13;
	
	//Bir arrayde olmayan index i kullanmaya calisirsaniz CTE degil Run Time Error alirsiniz.
	//ArrayIndexOutOfBoundsException hatasi verir
	
	////Bir array e elaman ekleme kisa yol
	int arr2[]= {8,10,12,14};
	System.out.println(Arrays.toString(arr2));
	
	
	//bir arrayde belli bir elemani yazdirma 
	System.out.println(arr2[1]);
	System.out.println(arr2[3]);
	System.out.println(arr2[0]);//ilk eleman her zaman array ismi[0] ile yazdirilir.
	
	//her arrayde son elemani yazdiran code nedir?
	int arr3[] = {21,22,23,24,25,26,27};
	
	System.out.println(arr3[arr3.length-1]);//==> son eleman her zaman arrayismi(length-1)
	// bir array olusturunuz tum elemanlarini for llop kullanaraj ayni satirde araalrinda boslukl olarak
	
	int arr4[]= {1,2,3,4,5,6};
	for(int i=0; i<arr4.length;i++) {
		System.out.print(arr4[i]+" ");
	}
	
	int arr5[]= {21,22,23,24,25,26};
	int i=0;
	while(i<arr5.length) {
		if(i%2==0) {
			System.out.print(arr5[i]+" ");
		}
		i++;
	}
	//bir array olusturunuz bu array de indexi cift olan elemanlari while loop kullanarak
	//ekrasna ayni satirda aralarinda bosluk 
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
