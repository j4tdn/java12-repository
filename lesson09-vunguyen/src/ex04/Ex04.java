package ex04;

public class Ex04 {
    public static void main(String[] args) {
        String input = "   Welcome  to JAVA10    class  ";
        System.out.println("Input: " + input);
        System.out.println("Output: " + revert(input));
    }

    private static String revert(String s) {
        // \s: space
        // +: 1 or more
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = revertWord(words[i]);
            System.out.println("word: " + words[i]);
        }
        return String.join(" ", words);
    }

    // first solution
    private static String revertWord(String word) {
        char[] newWord = new char[word.length()];
        for (int i = 0; i < newWord.length; i++) {
            newWord[i] = word.charAt(word.length() - i - 1);
        }
        return String.valueOf(newWord);
    }

    // second solution
    private static String revertWord01(String word) {
        char[] newWord = word.toCharArray();
        for (int i = 0; i < newWord.length / 2; i++) {
            char temp = newWord[i];
            newWord[i] = newWord[newWord.length - i - 1];
            newWord[newWord.length - i - 1] = temp;
        }
        return String.valueOf(newWord);
    }

    // third solution
    private static String revertWord02(String word) {
        StringBuilder str = new StringBuilder(word);
        str.reverse();
        return str.toString();
    }
}
