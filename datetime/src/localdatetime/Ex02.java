package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02 {
	public static void main(String[] args) {
	LocalTime time = LocalTime.now();
	
	LocalTime anothertime = LocalTime.of(23,30,30);
	System.out.println("time: " + time);
	System.out.println("anotherTime: " + anothertime);
	
	Duration duration = Duration.between(time, anothertime);
	System.out.println("duration: " +duration);
	
	
	}
	
}
