package day23daytime;

import java.time.LocalDate;

public class Date01 {
	

	/*
	 * 1)Anlik tarihi almak
	 * 2)Tarihi ilerletme veya geriletme
	 * 3)Tarihi farkli formatlarda 
	 */

	public static void main(String[] args) {
		
		//Alik tarih nasil alinir?
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		//ileri  tarihler ekrana masil yazdirilir?
		
		ld.plusDays(275);
		System.out.println(ld.plusDays(275));
		ld.plusMonths(3);
		System.out.println(ld.plusMonths(3));
		ld.plusYears(3);
		System.out.println(ld.plusYears(3));
		
		//Gevcmis tarihler
		
		ld.minusDays(34);
		System.out.println(ld.minusDays(34));
		System.out.println(ld.minusMonths(6));
		System.out.println(ld.minusYears(4));
		
		//Tarihi nasil farkli formatta yazdirabiliriz?
		// MM ==> Kacinci ay       MMM ==> Ayin ilk 3 harfi     MMMM ==> Ayin isminin tamami
		/*DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf1.format(ld.plusMonths(1)));//21/August/2020
				
				
		// d ==> 10 dan kubuk gunler icin tek rakam basar ama 10 ve yukarisi icin cift rakam basar
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM.d.yy");
		System.out.println(dtf2.format(ld));//Jul.21.20
*/
		
		

	}

}
