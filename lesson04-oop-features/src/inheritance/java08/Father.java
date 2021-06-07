package inheritance.java08;

public interface Father {
	void adn();
	
	default void playSport() {
		System.out.println("Football");
	}
	
	static void drinhkAlcohol(int qty) {
		System.out.println("Father drink " + qty + "as max !");
	}
}
