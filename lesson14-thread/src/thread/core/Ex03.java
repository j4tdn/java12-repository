package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex03 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		Thread t1 = new Thread(new Task(),"Thread 1");
		t1.start(); //automatically call t1.run()
		join(t1);
		
		Thread t2 = new Thread(new Task(),"Thread 2");
		t2.start();
		join(t2);
		
		//Current thread 
		printCurrentThreadName();
		System.out.println("main end");
	}
	private static class Task implements Runnable{
		@Override
		public void run() {
			//prepare data took 2s
			doTask(2, TimeUnit.SECONDS);
			
			printCurrentThreadName();
			System.out.println("running a task...");
		}
	}
}