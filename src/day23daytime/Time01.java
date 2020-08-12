package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);//22:20:57.839===> 839 nanosecond demektir
		
		//zamanda ileri nasil gidilir
		
		lt.plusMinutes(7);
		System.out.println(lt.plusMinutes(7));//22:29:45.941
		System.out.println(lt.plusHours(6));//04:25:10.724
		
		//zamanda geri gitme
		System.out.println(lt.minusSeconds(23));//22:26:55.449
		
		//Time formati nasil degistirilir
		//hh==> 12 lik sistem kullanir HH==> 24 luk sistem kulanir
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf1.format(lt));
		
		//farkli ulkelerdeki yerel saati nasil yazdirabilirim.
		
		LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		LocalTime.now(ZoneId.of("Japan"));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		//LocalTime.now(ZoneId.of("europe/moscow"));
		//System.out.println(LocalTime.now(ZoneId.of("russian")));

	}

}
