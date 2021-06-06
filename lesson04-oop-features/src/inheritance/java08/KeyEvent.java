package inheritance.java08;

public interface KeyEvent {
	
	// abstract method
	void keyPress();
	void keyEnter();
	void keyClick();
	
	// JAVA08: Default, Static methods with body
	default void keyExit() {
		System.out.println("KeyExit");
	}
	
	static void keyReleased() {
		System.out.println("Keyreleased");
	};
	
	// JAVA09
	private void keyShift() {
		
	}
}
