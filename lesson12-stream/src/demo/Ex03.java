package demo;

import bean.Apple;

public class Ex03 {
	public static void main(String[] args) {
		Runnable r = running(2000);
		r.run();
	}
	
	private static Runnable running(int time) {
		//lexical scope
		//global variable 
		//outer scope
		String jobName = "Queue Job";
		Apple a1 = new Apple(1,"pink",10,"Lao");
		
		return new Runnable() {
			
			@Override
			public void run() {
				// local variable
				// inner scope
				System.out.println(jobName + "is running about " + time + "ms");
				System.out.println("a1" + a1);
				
			}
		};
		
	}
}
