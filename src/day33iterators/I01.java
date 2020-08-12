package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		//list 1 icindeki her elemanin sonuna "A" harfini ekleyiniz
		//Loop kullanarak List leri degistiremezsiniz. elemanlarini degistirebilirisniz ama listi update edemezsiniz
		
		for (String w : list1) {
			
			w=w+"A";
			System.out.print(w);
			
		}
		System.out.println();
		System.out.println(list1);
		//Bir listi update etmek isterseniz iterator kullanmak zorundasiniz
		//1. adim: ListIterator oobjesi olusturun
		
		ListIterator<String> li1=list1.listIterator();
		//2. adim://while loop kullanin
		/*
		 * //hasNext() pointer a gelip "senden sonra eleman var mi?" diye soruyor 
		 * varsa while in contitiooni true olur. 
		next () methodu Pointer i alir bir sonraki elemani isaret ettirirr.
		 Ustunden atladigi elemani alip element e atar boylece yeni bir 
		 object olusur.
		 set() methodu list icindeki methodu degistirmeye yarar.
		 */
		
		while(li1.hasNext()) {
			Object element=li1.next();
			li1.set(element+"A");
			
		}
		System.out.println(list1);
		
		/*
		 * String bir list olusturun her elemanin basina "K" sonuna "L" ekleyin 
		 */
		List<String> list2 = new ArrayList<>();
		list2.add("F");
		list2.add("T");
		list2.add("H");
		System.out.println(list2);
		
		ListIterator<String> li2=list2.listIterator();
		
		while(li2.hasNext()) {
			Object element=li2.next();
			li2.set("K"+element+"L");
			
		}
		System.out.println(list2);
		
		
		
		
		
		
	}

}
