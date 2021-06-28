package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime anotherTime = LocalTime.of(23, 30, 30);
		
		System.out.println(time);
		System.out.println(anotherTime);
		
		Duration duration = Duration.between(time, anotherTime);
		System.out.println("duration: "+duration);
	
		System.out.println(duration.toHoursPart()+" h \n"+
				duration.toMinutesPart()+ " m \n"+
				duration.toSecondsPart()+" s");
	
	}

}
