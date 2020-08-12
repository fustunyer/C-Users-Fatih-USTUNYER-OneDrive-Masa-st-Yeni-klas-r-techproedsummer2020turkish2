package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		List<String> sl=new ArrayList<>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		
		System.out.println(sl);
		// Bir elemani degistime
		
		sl.set(0, "Aliye");
		System.out.println(sl);
		
		//Bir elmanin varligini nasil kontrol eder
		System.out.println(sl.contains("Kemal"));
		System.out.println(sl.contains("wwwww"));
		
		//Elemanlari naturel order'a(Kucukten buyuge Alfebetik sira) gore nasil dizeriz.
		
		Collections.sort(sl);//cok kullanilacak
		System.out.println(sl);
		
		// elemanlari tersten siralama
		
		Collections.reverse(sl);//[Kemal Ayse,Aliye]
		System.out.println(sl);
		
		//user story sebze-meyve- oyuncak reyonlarinda 10 dan fazla urun olmamalie
		//once sebze urunleri liste atip size bakip deneriz. sonra silerizdigerlerini deneriz.
		
		sl.clear();
		System.out.println(sl);
		
		//iki listin esit olup olmadigini nasil kontrol ederiz
		//Listler asla primitive data type ile calismazlar.
		
		/*
		 * her primitive data type inin bir WRAPPER CLASS'i vardir
		 * primitive  WrapperClass(Non-primitive)
		 * boolean==>Boolean
		 * Char==>Character
		 * byte==>Byte
		 * short==>Short
		 * int==>Integer
		 * long==>Long
		 * float==>Float
		 * double==>Double
		 */
		
		List<Integer> il1 = new ArrayList<>();
		il1.add(12);
		il1.add(13);
		il1.add(14);
		
		List<Integer> il2 = new ArrayList<>();
		il2.add(12);
		il2.add(14);
		il2.add(13);
		
		System.out.println(il1.equals(il2));
		//hem elemanlari hem de elemanlarin indexini kontrol eder
	}

}
