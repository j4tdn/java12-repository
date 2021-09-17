package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	private ThreadUtils() {

	}

	public static void currentThread() {
		System.out.println("current Thread #" + Thread.currentThread().getName());
	}

	public static void startThread() {
		System.out.println(Thread.currentThread().getName() + " is running...");
	}

	public static String getThreadName() {
		return Thread.currentThread().getName();
	}

	public static void dotask(long time, TimeUnit timeUnit) {
		try {
			timeUnit.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void join(Thread thread) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
