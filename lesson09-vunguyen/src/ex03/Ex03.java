package ex03;

public class Ex03 {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("output: ");
        permutation(input, "");
    }

    private static char[] chars = new char[0];

    private static void permutation(String s, String result) {
        if (s.length() == 0) {
            System.out.println(result + " ");
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean flag = false;
            String s1 = s.substring(0, i) + s.substring(i + 1);
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == c) {
                    flag = true;
                }
            }
            if (!flag) {
                chars = Ex03Utils.add(chars, c);
                permutation(s1, result + c);
            }
        }
    }
}
