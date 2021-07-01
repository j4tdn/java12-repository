package timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import utils.DateUtils;

public class Ex01 {
	public static void main(String[] args) {
		// locale: language -country
		// time-zone: GMT, UTC, Abbreviation(HSK, ICT), Area
		
		// system
		TimeZone tzdef = TimeZone.getDefault();
		System.out.println("tzdef" + tzdef);
		
		System.out.println("=================");
		String[] availableTzIds = TimeZone.getAvailableIDs();
		for (String i : availableTzIds) {
			System.out.println(i);
		}
		
		// Europe/Berlin = Etc/GMT-2
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		
		Calendar c = Calendar.getInstance(tzBerlin);
		System.out.println("datetime berlin: " + DateUtils.format(c, tzBerlin));
		
		LocalDateTime dtBerlin = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println("datetime berlin: " + dtBerlin);
	}
}
