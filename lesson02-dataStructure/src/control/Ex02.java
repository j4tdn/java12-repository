package control;

public class Ex02 {
    enum Level {
        BAD, MEDIUM, PRETY_GOOD, GOOD;
    }

    public static void main(String[] args) {
        float point = 0.2f;
        System.out.println(getLevel(point));
    }

    private static Level getLevel(float point) {
        Level level = null;
        if (point < 5) {
            return level.BAD;
        }
        if (point < 6.5f) {
            return level.MEDIUM;
        }
        if (point < 8.5f) {
            return level.PRETY_GOOD;
        }
        return level.GOOD;
    }
}
