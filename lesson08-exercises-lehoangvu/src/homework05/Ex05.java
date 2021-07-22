package homework05;

public class Ex05 {
// Copy by lethiquynhnhi
    private static String PATTERN_STRING = "[A-Z]+";

    public static void main(String[] args) {

        String inputString1 = "ABHSDDDDLLLLHHHJK";
        String inputString2 = "ABHASDDDLLLJK";
        String result = theSameStrings(inputString1, inputString2);
        System.out.println(result);

    }

    private static String theSameStrings(String s1, String s2) {
        String longestString = "";
        String temp = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                temp = s1.substring(i, j);
                if ((temp.length() > longestString.length()) && s2
                        .contains(temp)) {
                    longestString = temp;
                }
            }
        }
        return longestString;
    }

}
