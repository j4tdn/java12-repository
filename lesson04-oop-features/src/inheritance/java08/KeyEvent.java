package inheritance.java08;

public interface KeyEvent {
	
	// abstract method
	void keyPress();
	void keyEnter();
	void keyClick();
	
	// JAVAO8: Default, Static methods with body
	default void keyExit() {
		System.out.println("KeyExit");
	}
	
	static void keyReleased() {
		System.out.println("KeyReleased");
	}
	
	// JAVA09
	private void keyShift() {
		
	}
}
