package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

import utils.DateUtils;

public class Ex01 {
	private static final String PT_DATE = "dd/MM/yyyy";
	private static final String PT_TITME = "HH:mm:ss";

	public static void main(String[] args) {
		boolean chk;
		LocalDate dateStart = null, dateEnd = null;
		LocalTime timeStart = null, timeEnd = null;
		String choose = choose();
		do {
			chk = true;
			try {
				System.out.println("Nhập ngày bắt đầu hẹn ho - dd/MM/yyyy: ");
				String sDateStart = DateUtils.sc.nextLine();
				dateStart = DateUtils.toLocalDate(sDateStart, PT_DATE);
				System.out.println("Nhập thời gian - HH:mm:ss : ");
				timeStart=DateUtils.toLocalTime(DateUtils.sc.nextLine(), PT_TITME);
				if (choose.equals("Y")) {
					System.out.println("Nhập ngày chia tay - dd/MM/yyyy: ");
					dateEnd = DateUtils.toLocalDate(DateUtils.sc.nextLine(), PT_DATE);
					System.out.println("Nhập thời gian - HH:mm:ss : ");
					timeEnd=DateUtils.toLocalTime(DateUtils.sc.nextLine(), PT_TITME);
				} else {
					dateEnd = LocalDate.now();
					timeEnd=LocalTime.now();
				}
				if (dateStart.isAfter(dateEnd))
					throw new IllegalArgumentException("Star cannot exceed current time!");
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace();
				chk = false;
			} catch (Exception e) {
				chk = false;
				System.out.println("Thời gian ko đúng định dạng!!!!");
			}
		} while (!chk);
		
		System.out.println("Ngày đàu tiên hẹn hò là: "+dateStart.getDayOfWeek());
		getTimeLove( timeStart ,  timeEnd, dateStart,dateEnd);
	}

	private static String choose() {
		String choose;

		System.out.println("Bạn đã chia tay chưa? - Y/N ");
		do {
			choose = DateUtils.sc.nextLine();
			if (!choose.toUpperCase().equals("N") && !choose.toUpperCase().equals("Y")) {
				System.out.println("Lựa chọn ko hợp le, chon lai: ");
				continue;
			} else {
				return choose.toUpperCase();
			}

		} while (true);
	}
	LocalDate dateStart, dateEnd ;
	LocalTime timeStart , timeEnd ;
	private static void getTimeLove(LocalTime timeStart , LocalTime timeEnd,LocalDate dateStart, LocalDate dateEnd) {
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeStart.isAfter(timeEnd)) { 
			duration = duration.plusDays(1); 
			period = period.minusDays(1);
		}

		System.out.println("Thoi gian yeu nhau: ");
		System.out.println(period.getYears() + " year " + period.getMonths() + " month " + period.getDays() + "day  / "
				+ duration.toHoursPart() + " hour " + duration.toMinutesPart()+ " minute " + duration.toSecondsPart()+ " seconds ");
	}
}
