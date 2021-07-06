package ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 11, 27);
		LocalDate startTetDate = LocalDate.of(2020, 12, 29);
		LocalDate endTetDate = LocalDate.of(2021, 01, 05);
		int i = 0;
		int k = 0;
		while(i<=110) {
			date = date.plusDays(1);
			if(date.equals(startTetDate)){
				while(!date.equals(endTetDate)) {
					date = date.plusDays(1);
				}
				continue;
			}

			if(date.getDayOfWeek().equals(DayOfWeek.SUNDAY) || date.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			
				continue;
			}
			System.out.println(date);
			i++;	
		}
		System.out.println(date);
	}}
