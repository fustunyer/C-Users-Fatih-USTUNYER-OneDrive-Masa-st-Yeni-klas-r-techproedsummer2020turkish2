package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class L01 {
/*1)Arrayin uzunluklari en basta belirlenir ve bir daha degistirilmez
	 * Arraylist(=List) lerde ise list olustururken uzunluk belirlemeye gerek yoktur cunku
	 * listler eleman eklendikce kendileirni buyuturler
	*Array ile Listin farki nedir? Array fixed size List ise flexible dir.
 2)Listler cok kullaniusli methodlara sahiptir 	
 3)Arrayler Primitive ve reference eleman olarak kabul ederler ama Listler sadece 
 NON PRIMITIVEleri eleman olarak kabul eder.
		*/
	public static void main(String[] args) {	
		//List olusturma nasil yapilir?
		//1. yol
		ArrayList<String> sl1= new ArrayList<>();
		
		//2. yol
		ArrayList<String> sl2= new ArrayList<>();
		System.out.println(sl1+""+sl2);
		//3. yol (bunu kullanacagiz)
		List<String> sl3=new ArrayList<>();
		System.out.println(sl3);
		
		//Liste eleman ekleme
		
		sl3.add("A");
		System.out.println(sl3);
		
		sl3.add("B");
		System.out.println(sl3);
		
		sl3.add("C");
		System.out.println(sl3);
		
		//herhangi bir indexe eleman ekleme
		
		sl3.add(0, "Mustafa");
		 System.out.println(sl3);//[Mustafa, A, X, B, C]
		 
		 //List'lerde eleman sayisini bulma nasil yapilir?
		 System.out.println(sl3.size());//5
		 
		 //Bir list'in bos olup olmadigin nasil anlariz?
		 System.out.println(sl3.isEmpty());//isEmpty() ==> bos ise true, dolu ise false verir
		 
		 //Bir list'den istenen elemani silme nasil yapilir?
		 
		 //1. Yol: index ile silme yapabilirsiniz.
		 System.out.println(sl3.remove(0));
		 System.out.println(sl3);//[A, X, B, C]
		 
		 //2. Yol: Eleman secip sil
		 sl3.remove("X");
		 System.out.println(sl3);//[A, B, C]
		 
		 sl3.add("B");//[A, B, C, B]
		 System.out.println(sl3.remove("B"));//true
		 //Ayni elemandan 1 den fazla varsa ilkini siler
		 System.out.println(sl3);//[A, C, B]
		 
		 
		 System.out.println(sl3.remove("W"));//false
		 //Java'dan olmayan bir elemani remove etmesini isterseniz
		 //remove edemez ve list'i aynen oldugu gibi birakir.
		 System.out.println(sl3);//[A, C, B]
		 
		 //remove(index) ne return eder?
		 // sl3 ==> [A, C, B]
		 System.out.println(sl3.remove(1));//C
		 System.out.println(sl3);//[A, B]
		 
		//remove(eleman) ne return eder?
		// sl3 ==> [A, B] 
		 System.out.println(sl3.remove("A"));//true
		 //remove() methodunun icine tamsayi koyarsaniz 
		 //Java onu index kabul eder. 
		 //Bu yuzden elemanlari integer olan bir listteki elemanlari silmek icin 
		 //remove() methodunun sadece indexlisini kullanabilirsiniz.

 
}

}
