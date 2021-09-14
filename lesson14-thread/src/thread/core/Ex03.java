package thread.core;

import utils.ThreadUtils;

public class Ex03 {
	// thread main
	public static void main(String[] args) {
		System.out.println("main start");

		Thread t1 = new Thread(new Task(), "Thread1");
		t1.start(); //automatically call t1.run >> runnable
		ThreadUtils.join(t1);
		
		Thread t2 = new Thread(new Task(), "Thread2");
		t2.start(); //automatically call t1.run >> runnable
		ThreadUtils.join(t2);
		
		// current thread
		ThreadUtils.printCurrentThreadName();


	}
	private static class Task implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			ThreadUtils.printCurrentThreadName();
			System.out.println("Running task...");
		}
		
	}
}
