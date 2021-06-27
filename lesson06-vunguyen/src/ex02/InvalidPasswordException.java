package ex02;

public class InvalidPasswordException extends Exception {
    static final long serialVersionUID = -3387516993124229948L;
    private int[] passwordConditionViolatedArrays = null;
    public InvalidPasswordException(int[] i) {
        passwordConditionViolatedArrays = i;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i: passwordConditionViolatedArrays) {
            switch (i) {
                case 1:
                    string += "Password must contain at least 8 characters\n";
                    break;
                case 2:
                    string += "Password must contain at most 256 characters\n";
                    break;
                case 3:
                    string += "Password must contain at least 1 lowercase alphabetic character (a, b, c...)\n";
                    break;
                case 4:
                    string += "Password must contain at least 1 uppercase alphabetic character (A, B, C...)\n";
                    break;
                case 5:
                    string += "Password must contain at least 1 number (1, 2, 3...)\n";
                    break;
                case 6:
                    string += "Password must contain at least 1 special character (~!@#$%^&*()-_=+[]{}|;:,.<>/?)\n";
                    break;
                default:
                    string += "";
                    break;
            }
        }
        return string;
    }
}
