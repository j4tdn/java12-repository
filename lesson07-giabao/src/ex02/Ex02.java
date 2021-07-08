package ex02;
	import java.text.DateFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;

	public class Ex02 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập ngày tháng năm (dd/mm/yyyy): ");
			Calendar c = Calendar.getInstance();

			do {
				String sdate = sc.nextLine();
				try {
					c = convertToCalendar(sdate);
					break;
				} catch (Exception e) {
					System.out.println("Invalid DateFormat (dd/mm/yyyy)");
				}
			} while (true);

			showDateDetail(c);
		}

		private static void showDateDetail(Calendar c) {
			String[] daysInWeek = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
			Calendar startDate = Calendar.getInstance();
			Calendar endDate = Calendar.getInstance();

			startDate.set(c.get(Calendar.YEAR), 0, 1);
			endDate.set(c.get(Calendar.YEAR), 11, 31);

			long passedDay = c.get(Calendar.DAY_OF_YEAR );
			long leftDay = (c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR ));
			

			System.out.println("Là ngày thứ " + passedDay + " trong năm và còn " + leftDay + " ngày trong năm");
			System.out.println("Là ngày thứ " + daysInWeek[c.get(Calendar.DAY_OF_WEEK) - 1] + ", " + showRankDayOfYear(passedDay, leftDay) +"trong tổng số thứ trong năm");
			showRankDayOfMonth(c.get(Calendar.DAY_OF_MONTH), c.getActualMaximum(Calendar.DAY_OF_MONTH));
			System.out.println("Có " + (passedDay + leftDay) + " ngày trong năm");
			System.out.println("Có " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày trong tháng đó");
		}

		private static void showRankDayOfMonth(int date, int maxDate) {
			long rank = (date % 7 != 0) ? (date / 7 + 1) : (date / 7);
			long leftDayNumberInMonth = (maxDate - date) / 7;
			System.out.println("Đứng thứ " + rank + "/" + (rank + leftDayNumberInMonth) + " trong tháng");
		}

		private static String showRankDayOfYear(long passedDay, long leftDay) {
			long rank = (passedDay % 7 != 0) ? (passedDay / 7 + 1) : (passedDay / 7);
			long leftDayNumber = leftDay / 7;
			long amountDayOfYear = rank + leftDayNumber;
			
			return rank + "/" + amountDayOfYear;

		}

		static Calendar convertToCalendar(String sdate) throws ParseException {
			if (sdate.isEmpty()) {
				return null;
			}
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date date = df.parse(sdate);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			return c;
		}
}
