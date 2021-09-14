package thread.core;

import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

public class Ex01 {
	// thread main
	public static void main(String[] args) {
		System.out.println("main start");

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				//prepare data
				ThreadUtils.doTask(2, TimeUnit.SECONDS);
				
				ThreadUtils.printCurrentThreadName();
				System.out.println("Running task...");
			}
		}, "Thread1");
		
		System.out.println("start t1");
		t1.start(); //automatically call t1.run >> runnable
		
		

		
		
		
		// current thread
		ThreadUtils.printCurrentThreadName();

		System.out.println("main end");

	}
}
