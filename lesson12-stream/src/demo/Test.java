package demo;

public class Test {
	public static void main(String[] args) {
		
		run(180);
		
	}
	
	private static Runnable run(int time) {
		String name = "nhan";
		return () -> {
			int age = 23;
			System.out.println(name + age + "years old.");
		};
	}
}
