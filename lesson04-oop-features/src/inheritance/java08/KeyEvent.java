package inheritance.java08;


public interface KeyEvent {
	
	//abstract method
	void keyPress();
	void keyEnter();
	void keyClick();
	
	//JAVA 08: default, static methods with body
	default void keyExit() {
		System.out.println("keyExit");
	};
	static void keyRelease() {
		System.out.println("keyRelease");
	};
	
	// JAVA 09
	private void keyShift() {
		
	}
	

}
