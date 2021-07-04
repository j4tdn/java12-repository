package BT2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import BT1.WeekDay;
import utils.DateUtils;

public class BT2 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the Date:  ");

		String date = scanner.next();
		Date start = null;
		start = DateUtils.to(date);

		Calendar startTest = DateUtils.to(start) ;
		
		WeekDay[] wdEnums = WeekDay.values();

		Calendar dayOfWeek = DateUtils.to(start);
	    int dayOfW = dayOfWeek.get(Calendar.DAY_OF_WEEK);
		System.out.println(DateUtils.format(startTest) + " is a: " + wdEnums[dayOfW-1]);
		
		Month[] monthEnums = Month.values();

		Calendar monthOfYear = DateUtils.to(start);
	    int monthOfY = dayOfWeek.get(Calendar.MONTH);
//		System.out.println(DateUtils.format(startTest) + " is a: " + monthEnums[monthOfY]);
	
		
		System.out.println("-----------Additional Facts------------");
		System.out.println("It is a day number "+ startTest.get(Calendar.DAY_OF_YEAR)+", "+(365 - startTest.get(Calendar.DAY_OF_YEAR))+" days left" );
		System.out.println("It is Monday number : "+countNofMonday(startTest.get(Calendar.MONTH),startTest.get(Calendar.YEAR)) +" out of "+countNofMondaysInYear(1995)+" in "+startTest.get(Calendar.YEAR));
		System.out.println("It is Monday number : "+countNofMondayOfMonthPresent(startTest.get(Calendar.DAY_OF_MONTH),startTest.get(Calendar.MONTH),startTest.get(Calendar.YEAR)) +" out of "+countNofMondayOfMonth(startTest.get(Calendar.MONTH),startTest.get(Calendar.YEAR))+" in "+ monthEnums[monthOfY] +" "+startTest.get(Calendar.YEAR));
		System.out.println( monthEnums[monthOfY] +" "+startTest.get(Calendar.YEAR)+" has "+startTest.getActualMaximum(Calendar.DAY_OF_MONTH)+" days");

	}
	 private static int countNofMondaysInYear(int year) {
		
		 Calendar start = Calendar.getInstance(); 
		 start.set(Calendar.YEAR,year);
		 start.set(Calendar.MONTH,0);
		 start.set(Calendar.DAY_OF_MONTH,1);
		  
		 Calendar end =Calendar.getInstance();
		    end.set(Calendar.YEAR,year);
		    end.set(Calendar.MONTH,11);
		    end.set(Calendar.DAY_OF_MONTH,31);
		 
		 int count=0;
		 
		 for(Calendar date = start; !date.after(end);date.add(Calendar.DAY_OF_MONTH, 1)) {
			 if(date.get(Calendar.DAY_OF_WEEK)== Calendar.MONDAY) { 
				 count++;
			 }
		 }
		 return count;
	 }
	 private static int countNofMonday(int month, int year) {
		
		 Calendar start = Calendar.getInstance(); 
		 start.set(Calendar.YEAR,year);
		 start.set(Calendar.MONTH,0);
		 start.set(Calendar.DAY_OF_MONTH,1);
		 
		 Calendar end =Calendar.getInstance();
		    end.set(Calendar.YEAR,year);
		    end.set(Calendar.MONTH,month);
		    end.set(Calendar.DAY_OF_MONTH,31);
		 
		 int count=0;
		 
		 for(Calendar date = start; !date.after(end);date.add(Calendar.DAY_OF_MONTH, 1)) {
			 if(date.get(Calendar.DAY_OF_WEEK)== Calendar.MONDAY) {
				 count++;
			 }
		 }
		 return count;
	 }
	 private static int countNofMondayOfMonth(int month, int year) {
			
		 Calendar start = Calendar.getInstance(); 
		 start.set(year, month,1);
		 
		 Calendar end= Calendar.getInstance();
		 end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH));//31.5.2021
		 
		 int count=0;
		 
		 for(Calendar date = start; !date.after(end);date.add(Calendar.DAY_OF_MONTH, 1)) {
			 if(date.get(Calendar.DAY_OF_WEEK)== Calendar.MONDAY) {
				 count++;
			 }
		 }
		 return count;
	 }
	 private static int countNofMondayOfMonthPresent(int day,int month, int year) {
			
		 Calendar start = Calendar.getInstance(); 
		 start.set(year, month,1);
		 
		 Calendar end= Calendar.getInstance();
		 end.set(year, month, day);
		 
		 int count=0;
		 
		 for(Calendar date = start; !date.after(end);date.add(Calendar.DAY_OF_MONTH, 1)) {
			 if(date.get(Calendar.DAY_OF_WEEK)== Calendar.MONDAY) {
				 count++;
			 }
		 }
		 return count;
	 }
}
