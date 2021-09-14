package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	private ThreadUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printCurrentThreadName() {
		System.out.println(">> #" + Thread.currentThread().getName());
	}
	public static void startThread() {
		System.out.println(Thread.currentThread().getName()+ " is running ...");
	}
	public static String getThreadName() {
		return Thread.currentThread().getName();
	}
	
	//virtual task within a certain time
	public static void doTask(long time, TimeUnit unit) {
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void join(Thread t) {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
