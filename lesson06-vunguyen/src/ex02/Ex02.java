package ex02;

import java.util.Scanner;

public class Ex02 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String password = null;
        while (true) {
            try {
                password = inputPassword();
                break;
            } catch (InvalidPasswordException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println("Create password successfully");
        System.out.println("Password is " + password);
    }

    // using throws as Exception is checked exception
    private static String inputPassword() throws InvalidPasswordException {
        System.out.println("====== Create Account ======");
        System.out.println("Account Password: ");
        int[] passwordConditionViolatedArrays = new int[6];
        int index = 0;
        boolean flag = false;
        String password = scanner.nextLine();
        // 8 or more characters
        if (!password.matches(".{8,}")) {
            flag = true;
            passwordConditionViolatedArrays[index++] = 1;
        }
        // 1 to 256 characters
        if (!password.matches(".{1,256}")) {
            flag = true;
            passwordConditionViolatedArrays[index++] = 2;
        }
        // any lower case word
        if (!password.matches(".*[a-z].*")) {
            flag = true;
            passwordConditionViolatedArrays[index++] = 3;
        }
        // any upper case word
        if (!password.matches(".*[A-Z].*")) {
            flag = true;
            passwordConditionViolatedArrays[index++] = 4;
        }
        // any digit
        if (!password.matches(".*\\d.*")) {
            flag = true;
            passwordConditionViolatedArrays[index++] = 5;
        }
        // any special character (punctuation character)
        // \p{Punct}: Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
        // source: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
        if (!password.matches(".*\\p{Punct}.*")) {
            flag = true;
            passwordConditionViolatedArrays[index] = 6;
        }
        if (flag = true) {
            throw new InvalidPasswordException(passwordConditionViolatedArrays);
        }
        return password;
    }
}
