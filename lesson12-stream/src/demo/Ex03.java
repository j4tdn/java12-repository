package demo;

import bean.Apple;

public class Ex03 {
	public static void main(String[] args) {
		// local variable
		
		final int a = 10;
		
		final Apple a1 = new Apple();
		final Apple a2 = new Apple();
		
		a1.setColor("yellow");
		
		// final >> primitive: cannot resign value
		// final >> object : cannot reassign reference's address
	
		Runnable runnable = runing(2000);
		runnable.run();
	}
	
	private static Runnable runing(int time) {
		
		String job = "Queue Job";
		Apple jobDetail = new Apple(1, "black", 100, "Lao");
		// anonymous class >> contains method run
		return new Runnable() {
			// closure function is : 
			// function can be reference to outer scope variables
			// even those variables are cleared are separately
			// nonlocal variables are explicitly final >> From version 1.5|7
			@Override
			public void run() {
				System.out.println(job + " is running ...");
				System.out.println("JobDetail: " + jobDetail);
			}
		};
	}
}
