package ex03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

import utils.DateUtils;

public class Ex03_JV08 {
	private static final String PATTERN = "dd/MM/yyyy";
	
	private static String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thurs", "Friday", "Saturday" };
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
	static DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm:ss");
	public static void main(String[] args) {
		int choose;
		LocalDateTime datetime = LocalDateTime.now();
		LocalDate date = datetime.toLocalDate();
		LocalTime time = datetime.toLocalTime();
		while (true) {
			System.out.println("=========Menu=======");
			System.out.println("1.Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.");
			System.out.println("2.In ngày cuối cùng của tháng hiện tại");
			System.out.println("3.Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
			System.out.println("4.Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
			System.out.println("5.Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy");
			System.out.println("6.Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày");
			System.out.println("Ban chon?");
			choose = Integer.parseInt(DateUtils.sc.nextLine());

			switch (choose) {
			case 1:
				getDatetimeBerlin();
				break;
			case 2:
				getLastdayOfmonth(date);
				break;
			case 3:
				getFirstAndLastDateOfWeek(date);
				break;
			case 4:
				getCurrentWeekOfyeat(date);
				break;
			case 5:
				getAfter20days(date);
				break;
			case 6:
				getDaysYouLive(date);
				break;
			default:
				System.out.println("Chương trình kết thú");
				System.exit(0);
			}

		}

	}

	private static void getDatetimeBerlin() {
				LocalDateTime dtBerlin = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
				System.out.println("datetime berlin: " + dtf.format(dtBerlin.toLocalDate())+" "+dtfTime.format(dtBerlin.toLocalTime()));
	}

	private static void getFirstAndLastDateOfWeek(LocalDate date) {
		// TODO Auto-generated method stub
	
		DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
		LocalDate startOfCurrentWeek = date.with(TemporalAdjusters.previousOrSame(firstDayOfWeek));
		
		DayOfWeek lastDayOfWeek = firstDayOfWeek.plus(6); 
		LocalDate endOfWeek = date.with(TemporalAdjusters.nextOrSame(lastDayOfWeek));
		
		System.out.println("Ngày đầu tuần: "+dtf.format(startOfCurrentWeek));
		System.out.println("Ngày cuối tuần: "+dtf.format(endOfWeek));
	}

	private static void getCurrentWeekOfyeat(LocalDate date) {
		WeekFields weekFields = WeekFields.of(Locale.getDefault()); 
		int weekNumber = date.get(weekFields.weekOfWeekBasedYear());
		System.out.println("Bây giờ là tuần thứ "+weekNumber+ " của năm "+date.getYear());
	}

	private static void getDaysYouLive(LocalDate now) {
		LocalDate birthday;
		while(true) {
			try {
				System.out.println("Enter your birth date: ");
				String s =DateUtils.sc.nextLine(); 
				 birthday =DateUtils.toLocalDate(s, PATTERN);
				Period period = Period.between(birthday, now);
				if(birthday.isAfter(now)) {
					throw new IllegalArgumentException("birthday cannot exceed current time!");
				}
				System.out.println("Bạn đã sống được");
				System.out.println(period.getYears() + " year " + period.getMonths() + " month " + period.getDays() + "day");
				break;
			}catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
		
	}

	private static void getAfter20days(LocalDate date) {
		LocalDate lcd = date.plusDays(20);
		System.out.println("20 ngày sau là ngày "+dtf.format(lcd) +", "+ lcd.getDayOfWeek());
		
	}

	private static void getLastdayOfmonth(LocalDate date) {
		System.out.println("Ngày cuối cùng của tháng hiện tại là: "+ dtf.format(LocalDate.of(date.getYear(), date.getMonth(), date.lengthOfMonth())));
	}

}
