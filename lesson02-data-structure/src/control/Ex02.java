package control;

public class Ex02 {
	
	enum Level {
		BAD, MEDIUM, PRETTY_GOOD, GOOD
	}
	
	public static void main(String[] args) {
		float point = 9.2f;
		System.out.println(getLevel(point));
	}
	
	private static Level getLevel(float point) {
		Level level = null;
		
		if (point < 5) {
			level = Level.BAD;
		}
		if (point < 6.5f) {
			level = Level.MEDIUM;
		}
		if (point < 8.5) {
			level = Level.PRETTY_GOOD;
		}
		level = Level.GOOD;
		return level;
	}
}
