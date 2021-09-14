package thread.core;

import java.util.concurrent.TimeUnit;

import static utils.ThreadUtils.*;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				doTask(2, TimeUnit.SECONDS);
				
				printCurrentThreadName();
				System.out.println("Thread 1 is running...");
			}
		}, "thread1");
		
		t1.start();
		
		// current thread
		printCurrentThreadName();
		System.out.println("main end");
		
	}
}
