package timezone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import utils.DateUtils;

public class Ex01 {
	public static void main(String[] args) {
		// locale: language-country
		// timezone: GMT,UTC,Abrivation

		TimeZone tzdefault = TimeZone.getDefault();
		System.out.println("time zone default: " + tzdefault);

		System.out.println("=================");
		String[] avTids = TimeZone.getAvailableIDs();
		for (String tzId : avTids) {
			System.out.println(tzId);
		}

		// Europe/Berlin
		TimeZone tzBerlin = TimeZone.getTimeZone("Etc/GMT-2");

		//Dùng calendar
		Calendar c = Calendar.getInstance(tzBerlin);
		System.out.println("dateTime berlin: " + DateUtils.format(c, tzBerlin));

		//Dùng LocalDatetime
		LocalDateTime dtBerlin = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println("datetime berlin: " + dtBerlin);
		
		

	}
}
