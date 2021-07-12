package ex03;

public final class Ex03Utils {
    private Ex03Utils() {
    }

    /**
     * Append a character to the end of char array
     *
     * @param chars given char array
     * @param c given a character to be append to this array
     * @return new char array
     */
    public static char[] add(char[] chars, char c) {
        int length = chars.length + 1;
        char[] newCharArr = new char[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (i > chars.length - 1) {
                newCharArr[i] = c;
            } else {
                newCharArr[i] = chars[count];
                count++;
            }
        }
        return newCharArr;
    }
}
