package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {

	public static String printCurrentThreadName() {
		return Thread.currentThread().getName();
	}
	
	public static void starThread() {
		System.out.println(Thread.currentThread().getName()+" is running ...");
	}
	
	public static void endThread(long star) {
		System.out.println(Thread.currentThread().getName()+" took "+ (System.currentTimeMillis()-star));
	}
	
	//virtual task with certain time
	public static void doTask(long time, TimeUnit unit) {
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//block current thread
	public static void join(Thread t) {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
