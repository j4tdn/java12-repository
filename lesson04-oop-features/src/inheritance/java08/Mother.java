package inheritance.java08;

public interface Mother {
	void adn();
	
	default void playSport() {
		System.out.println("Badminton");
	}
	
	static void drinhkAlcohol(int qty) {
		System.out.println(qty + "glasses are no problem with mother");
	}
}
