package timezone;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import utils.DateUtils;

public class Ex01 {
	public static void main(String[] args) {
		//locale: language, contry
		//time:zone :: GMT,UTC,Area
		
		//theo system
		TimeZone tzdf= TimeZone.getDefault();
		System.out.println(tzdf);
		
		System.out.println("====================");
		String[] avaTzIds =TimeZone.getAvailableIDs();
		for(String tzIds : avaTzIds) {
			System.out.println(tzIds);
		}
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		
		Calendar c = Calendar.getInstance(tzBerlin);
		System.out.println("datetime berlin: " + DateUtils.format(c, tzBerlin));
		
		LocalDateTime dtBerlin = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println("datetime berlin: " + dtBerlin);
	}
}
