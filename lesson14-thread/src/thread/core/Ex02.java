package thread.core;

import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

public class Ex02 {
	// thread main
	public static void main(String[] args) {
		System.out.println("main start");

		Thread t1 = new Thread(new Task(), "Thread1");
		
		System.out.println("start t1");
		t1.start(); //automatically call t1.run >> runnable
		
		
		// current thread
		ThreadUtils.printCurrentThreadName();

		System.out.println("main end");

	}
	private static class Task implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			ThreadUtils.doTask(2, TimeUnit.SECONDS);
			
			ThreadUtils.printCurrentThreadName();
			System.out.println("Running task...");
		}
		
	}
}
