package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		int arr[]= {3,7,1,18};
		
		//Array elemanlarini kucukten buyuge siralayiniz.
		
		System.out.println(Arrays.toString(arr));//[3,7,1,18]
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[1,3,7,18]
		
		//Bir String arra
		
		String srr[]= {"Ali","Veli","Osman"};
		Arrays.sort(srr);
		System.out.println(Arrays.toString(srr));
		
		//Bir integer array deki en buyuk ve en kucuk sayyii
		
		int arr1[]= {1,23,55,6,4,65,25,852};
		Arrays.sort(arr1);
		System.out.println("En kucuk = "+ arr1[0]+" En buyuk = "+arr1[(arr1.length-1)]);
		
		// string array olusturun bastan ve sonde 2. elemanlari yazdirin
		
		String srr2[]= {"Ali","Veli","Osman","Suleyman"};
		Arrays.sort(srr2);
		System.out.println("bastan ikinci="+srr2[1]);
		System.out.println("sondan ikinci="+srr2[srr2.length-2]);
		
		//Bir elemaninin arrayde var olup olmadigini kontrol etmek
		
		int nrr[]= {2,1,7,3,5};
		
		//nrr arrayinde 7 elemaninin var olup olmadigini kontrol ediniz
		//1. yol: loop ile
		int count=0;
		for (int i = 0; i < nrr.length; i++) {
			if (nrr[i]==7) {
				count++;
			}			
		}
		if (count!=0) {
			System.out.println("7 eleman olarak var");
		}else {
			System.out.println("7 eleman olarak yok");
		}
		//2. yol binarySearch() kullanmak
		//==>a. once kesinlikle sort() kullanmalisiniz.
		//==>b. aradiginiz eleman arrayde varsa binarySearch() o elemanin indexini verir
		
		Arrays.sort(nrr);//[1,2,3,5,7]
		System.out.println(Arrays.binarySearch(nrr, 7));//4
		
		/*
		 * binarySearch() methodu eleman arrayde var oldugunda asla negatif output vermez
		 binarySearch() methodu eleman arrayde YOK oldugunda  negatif output verir
		 */
		System.out.println(Arrays.binarySearch(nrr,6));
		//-5 verir==> "-" nin anlami elamn yok demek
		//			 "5" in anlami 6 eleman olarak bulunsaydi 5. eleman olurdu 
		
		System.out.println(Arrays.binarySearch(nrr,4));//-4
		System.out.println(Arrays.binarySearch(nrr,99));//-6
		
		//Bir arrayde tekrarli elemanlar varsa binarySearch() methodu elemanin 
		// var olup olamdigi hakkinda dogru karar verir ama elemanin sirasi hakkinda bazen yanilir
		
		int mrr[]= {1,3,8,3,11};
		Arrays.sort(mrr);//[1,3,3,8,11]
		System.out.println(Arrays.binarySearch(mrr,3));//1 veya 2
	
	}

}
