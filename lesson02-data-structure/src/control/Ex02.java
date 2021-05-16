package control;

public class Ex02 {

	enum Level {
		BAD, MEDIUM, PRETTY_GOOD, GOOD
	}

	public static void main(String[] args) {
		float point = 6.2f;
		System.out.println(getLevel(point));
	}

	private static Level getLevel(float point) {
		if (point < 5) {
			return Level.BAD;
		}
		if (point < 6.5f) {
			return Level.MEDIUM;
		}
		if (point < 8.5) {
			return Level.PRETTY_GOOD;
		}
		return Level.GOOD;
	}
}