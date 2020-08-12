package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X,Y,Z]
		//While loop icinde next() methodu kullanmazsaniz pointer hareket etmez. ve sonsuz dongu olusur.
		//listteki ilk 2 elemani siliniz.
		ListIterator<String> li1=list1.listIterator();
		
		while(li1.hasNext()) {
			Object el=li1.next();
			li1.remove();
			if(el.equals("Y"));{
			break;			}
		}
		System.out.println(list1);//[]
		
		/*
		 * Bir String list olusturun ve tum elemanlari XXXe donusturun
		 */
		List<String> list2= new ArrayList<>();
		list2.add("AB");
		list2.add("CD");
		list2.add("EF");
		System.out.println(list2);//[X,Y,Z]
		
		ListIterator<String> li2=list2.listIterator();
		while(li2.hasNext()) {
			li2.next();
			li2.set("XXX");
	}
		System.out.println(list2);
		
	}

}
