package day12forvewhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
		// ilk 30 sayma say�s�n�n toplam�n� ekrana yazd�ran program yaz�n�z.
		int sum = 0;
		for (int i = 1; i <=30 ; i++) {
			sum = sum+i;
		}
		//Sadece final result sonucu g�rmek isterseniz for loopun d���na yaz�n�z
		System.out.println(sum);
		
		
		//ilk 10 sayma say�s�n�zn �arp�mlar�n� ekrana yazd�r�n 
		//Matematikte 1*2*3*4*5 ifadesine 5 fakt�riyel denir ve 5! ile g�steirlr
		//7!=7*6*5*4*3*2*1
		// interview sorusu: Fakt�r�yel hesab� yapan bir program yaz�n�z
		int product=1;
		for (int i = 1; i <=10; i++) {
			product=product*i;
		}
		System.out.println(product);
		
		
		//100 ile 200 aras�ndaki 3 ile b�l�nebilen say�lar�n toplam�n�n bulan
		int sum1=0;
		for (int i = 101; i <=199; i++) {
			if (i%3==0) {
				sum1=sum1+i;
			}
		}
		System.out.println(sum1);
		
		
	}

}
