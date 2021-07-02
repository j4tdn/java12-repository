package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
	static DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
	
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		LocalTime anotherTime=LocalTime.of(23,30,30);
		
		System.out.println("time: "+dtf.format(time));
		System.out.println("another time: "+anotherTime);
		
		//duration
		Duration duration =Duration.between(time, anotherTime);
		System.out.println("duration: "+duration);
	
		System.out.println(duration.toHoursPart()+" Hour \n"+duration.toMinutesPart()+" minutes \n"+duration.toSecondsPart()+" seconds ");
	}
}
