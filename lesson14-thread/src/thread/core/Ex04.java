package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex04 {
	// Demo performance case with 3 calculation tasks - Should be 9 seconds
    // Run parallel took ~3 seconds
	// Task : took 3 seconds
	// Demo single thread: took 9s
	// Rim parallel with 3 threads: took 3s
	private static long start;
	public static void main(String[] args) {
		Task task1 = new Task(3,TimeUnit.SECONDS);
		Task task2 = new Task(4,TimeUnit.SECONDS);
		Task task3 = new Task(5,TimeUnit.SECONDS);
		
		start = System.currentTimeMillis();
		
		Thread t1 = new Thread(task1, "thread1");
		t1.start();
		
		Thread t2 = new Thread(task2, "thread2");
		t2.start();
		
		Thread t3 = new Thread(task3, "thread3");
		t3.start();
		
		
		
	}
	private static class Task implements Runnable{
		private long time;
		private TimeUnit unit;
		public Task(long time, TimeUnit unit) {
			this.time=time;
			this.unit=unit;
		}
		@Override
		public void run() {
			startThread();
			//prepare data took 2s
			doTask(time, unit);
			demoSync();
			System.out.println( getThreadName() +"tooks: " + (System.currentTimeMillis() - start) + "ms");
		}
		
		//synchronized data
		//synchronized method
		public synchronized void demoSync() {
			System.out.println(getThreadName()+ "acccess sychronized method");
			System.out.println("end sychronized method");
		}
	}
}
