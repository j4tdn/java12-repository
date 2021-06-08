package inheritance.java08;

public interface Mother {
	void adn();
	default void playSport() {
		System.out.println("Football");
	}
	static void drinkAlcohol(int qty) {
		System.out.println("Father drink "+ qty +"as max!" );
	}
}
