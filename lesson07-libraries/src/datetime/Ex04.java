package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {

		System.out.println("Cac  ngay CN trong thang: ");
		int n = countNumOfSundays(Calendar.JULY, 2021);
		System.out.println("So ngay CN la: " + n);

	}

	// Đếm số ngày chủ nhật có trong tháng
	private static int countNumOfSundays(int month, int year) {
		int count = 0;

		// 1 Tìm ngày đầu tháng và ngày cuối tháng
		Calendar star = Calendar.getInstance();
		star.set(year, month, 1); // set ve ngày đầu tháng

		Calendar end = Calendar.getInstance();
		end.set(year, month, star.getActualMaximum(Calendar.DAY_OF_MONTH)); // Set về ngay cuoi thang

		for (Calendar date = star; !date.after(end); date.add(Calendar.DAY_OF_MONTH, 1)) {
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.println(DateUtils.format(date));
				count++;
			}

		}
		return count;
	}
}
