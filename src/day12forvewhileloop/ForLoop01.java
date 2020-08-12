package day12forvewhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
		// ilk 30 sayma sayýsýnýn toplamýný ekrana yazdýran program yazýnýz.
		int sum = 0;
		for (int i = 1; i <=30 ; i++) {
			sum = sum+i;
		}
		//Sadece final result sonucu görmek isterseniz for loopun dýþýna yazýnýz
		System.out.println(sum);
		
		
		//ilk 10 sayma sayýsýnýzn çarpýmlarýný ekrana yazdýrýn 
		//Matematikte 1*2*3*4*5 ifadesine 5 faktöriyel denir ve 5! ile gösteirlr
		//7!=7*6*5*4*3*2*1
		// interview sorusu: Faktörüyel hesabý yapan bir program yazýnýz
		int product=1;
		for (int i = 1; i <=10; i++) {
			product=product*i;
		}
		System.out.println(product);
		
		
		//100 ile 200 arasýndaki 3 ile bölünebilen sayýlarýn toplamýnýn bulan
		int sum1=0;
		for (int i = 101; i <=199; i++) {
			if (i%3==0) {
				sum1=sum1+i;
			}
		}
		System.out.println(sum1);
		
		
	}

}
