package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

import utils.DateUtils;

public class Ex01 {
	private static final String PATTERN = "dd/MM/yyyy";
	private static final Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhap thoi gian bat dau hen ho: ");
		//String date = ip.nextLine();
		LocalDate dateStart = DateUtils.toDate("05/06/2018");
		//String time = ip.nextLine();
		LocalTime timeStart = DateUtils.toTime("15:54:12");
		System.out.println("Ngay bat dau hen ho la thu ");
		System.out.println(DateUtils.getDayOfWeek(dateStart));
		System.out.println("Ban da chia tay chua? (Y/N)");
		String k = ip.nextLine();
		if(k.charAt(0)=='y') {
			yesBreakUp(dateStart, timeStart);
		} else noBreakUp(dateStart, timeStart);
	}
	private static void noBreakUp(LocalDate dateStart, LocalTime timeStart) {
		LocalDate dateEnd = LocalDate.now();
		LocalTime timeEnd = LocalTime.now();
		caculate(dateStart, timeStart, dateEnd, timeEnd);
	}
	private static void yesBreakUp(LocalDate dateStart, LocalTime timeStart) {
		System.out.println("Nhap thoi gian chia tay: ");
		//String date = ip.nextLine(); 
		LocalDate dateEnd = DateUtils.toDate("04/05/2019");
		//String time = ip.nextLine();
		LocalTime timeEnd = DateUtils.toTime("14:43:33");
		caculate(dateStart, timeStart, dateEnd, timeEnd);
	}
	
	private static void caculate(LocalDate dateStart, LocalTime timeStart, LocalDate dateEnd, LocalTime timeEnd) {
		if (dateStart.isAfter(dateEnd)) {
			System.out.println("Start time cannot exceed end time !"); 
			return;
		}
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeStart.isAfter(timeEnd)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		if(period.getDays()<0) {
			period = period.minusMonths(1);
			period = Period.ofDays(29);
		}
		System.out.println(period);
		System.out.println(duration);
		System.out.println(period.getYears() + " nam, " + period.getMonths() + " thang, " + period.getDays() + " ngay, " + duration.toHoursPart() + " gio, " 
								 + duration.toMinutesPart() + " phut, " + duration.toSecondsPart() + " giay.");
	}
}
