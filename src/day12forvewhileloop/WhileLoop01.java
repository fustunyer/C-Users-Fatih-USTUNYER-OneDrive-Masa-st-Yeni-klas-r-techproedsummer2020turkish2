package day12forvewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 ilk 10sayma sayýsýný ekrana yazdýrýnýz
		
		int i=1;
		while (i<=10) {
			 System.out.print(i+" ");
			 i++;
		}
		/*
note:yukarýdaki kodda int i= 1; ifadesi for-loop un ilk bölgesi
(i<=10) for-loop'un 2. bölgesi
i++ for loop un 3. bölgesi gibidir.
DÝKKAT: i++ ifadesini yazmazsanýz whilw-loop sonsuz döngüye girer 
bu da bilgisayara zarar verir*/
 		 //ilk 10 sayma 
		/*  int j=10;
		  while (j>0){
			 System.out.println(j);
			 j--;
		}*/
		/*yukarýdaki kodda j--; yerine j++; yazarsanýz sonsuz döngü oluþur.
		 * arttýrma azaltma bölümüne dikkat et
		 * 
		 */
		
		//Ilk 100  çift sayma sayýsýný yazdýrýn
		/*
		int k=1;
		int sayma = 1;
		while(sayma<=100) {
		
			if(k%2==0) {
				System.out.print(k+" ");
				sayma++;
			}
			k++;
		}
		*/
		// j'den önceki tüm küçük harfleri yazdýran program
		/*
		char t='a';
		while (t<'j') {
			System.out.print(t+" ");
			t++;
		}
		
		*/
		//Ýlk 5 büyük harfin AsCII deðerlerinin toplamýný yazdýrýn
		
		int sum=0;
		char n='A';
		while ( n <='E') {
			sum=sum+n;
			n++;	
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
