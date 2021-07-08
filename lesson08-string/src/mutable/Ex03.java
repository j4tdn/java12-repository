package mutable;

import java.util.concurrent.TimeUnit;

//StringBuilder, StringBuffer
public class Ex03 {
	public static void main(String[] args) throws InterruptedException {
		
		Mutable task = new Mutable();
		
		Thread to = new Thread(task, "Thread-0");
		to.start();
		
		Thread t1 = new Thread(task,"Thread-1");
		t1.start();
		
		to.join();
		t1.join();
		
		System.out.println("Mutable String Length: " + task.length());
	}
	private static class Mutable implements Runnable{
		private StringBuffer mutable;
		private static long COUNT =5000;
		public Mutable() {
			mutable = new StringBuffer();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("thread " +Thread.currentThread().getName() + " is running...");
			for(int i =1;i<=5000;i++) {
				mutable.append("a");
			}
		}
		public int length() {
			return mutable.length();
		}
	}
	
}
