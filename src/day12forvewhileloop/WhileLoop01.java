package day12forvewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 ilk 10sayma say�s�n� ekrana yazd�r�n�z
		
		int i=1;
		while (i<=10) {
			 System.out.print(i+" ");
			 i++;
		}
		/*
note:yukar�daki kodda int i= 1; ifadesi for-loop un ilk b�lgesi
(i<=10) for-loop'un 2. b�lgesi
i++ for loop un 3. b�lgesi gibidir.
D�KKAT: i++ ifadesini yazmazsan�z whilw-loop sonsuz d�ng�ye girer 
bu da bilgisayara zarar verir*/
 		 //ilk 10 sayma 
		/*  int j=10;
		  while (j>0){
			 System.out.println(j);
			 j--;
		}*/
		/*yukar�daki kodda j--; yerine j++; yazarsan�z sonsuz d�ng� olu�ur.
		 * artt�rma azaltma b�l�m�ne dikkat et
		 * 
		 */
		
		//Ilk 100  �ift sayma say�s�n� yazd�r�n
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
		// j'den �nceki t�m k���k harfleri yazd�ran program
		/*
		char t='a';
		while (t<'j') {
			System.out.print(t+" ");
			t++;
		}
		
		*/
		//�lk 5 b�y�k harfin AsCII de�erlerinin toplam�n� yazd�r�n
		
		int sum=0;
		char n='A';
		while ( n <='E') {
			sum=sum+n;
			n++;	
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
