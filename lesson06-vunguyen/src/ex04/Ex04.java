package ex04;

import java.util.Scanner;

public class Ex04 {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean oneExceptionFlag = false;

    public static void main(String[] args) {
        int number = 0;
        while (true) {
            System.out.println("Input number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >=0 && number <= 999) {
                    break;
                }
                System.out.println("Number has at most 3 digits\n");
            } catch (NumberFormatException e) {
                System.out.println("Number can't be string type\n");
            }
        }
        System.out.println(readNumber(number));
    }

    private static String readNumber(int number) {
        if (number == 0) {
            return "Không";
        }
        int[] digits = new int[3];
        int nofDigits = 0;
        while (number > 0) {
            digits[nofDigits++] = number % 10;
            number /= 10;
        }
        String expressingNumber = null;
        if (nofDigits == 1) {
            expressingNumber = readDigits(0, digits[0], true);
        }
        if (nofDigits == 2) {
            expressingNumber = readDigits(1, digits[1], true) + " " + readDigits(0, digits[0], false);
        }
        if (nofDigits == 3) {
            oneExceptionFlag = true;
            expressingNumber = readDigits(2, digits[2], true) + " " + readDigits(1, digits[1], false) + " " + readDigits(0, digits[0], false);
        }
        return expressingNumber;
    }

    /**
     * Expressing digit in Vietnamese
     *
     * @param digitPosition given digit position
     * @param digit         given digit
     * @param flag          given if digit in the first position
     * @return digit as String
     */
    private static String readDigits(int digitPosition, int digit, boolean flag) {
        // unit
        if (digitPosition == 0) {
            switch (digit) {
                case 0:
                	return "";
                case 1:
                    if (oneExceptionFlag) {
                        return "mốt";
                    }
                    return flag ? "Một" : "một";
                case 2:
                    return flag ? "Hai" : "hai";
                case 3:
                    return flag ? "Ba" : "ba";
                case 4:
                    return flag ? "Bốn" : "bốn";
                case 5:
                    return flag ? "Năm" : "năm";
                case 6:
                    return flag ? "Sáu" : "sáu";
                case 7:
                    return flag ? "Bảy" : "bảy";
                case 8:
                    return flag ? "Tám" : "tám";
                case 9:
                    return flag ? "Chín" : "chín";
            }
        }
        // dozen
        if (digitPosition == 1) {
            switch (digit) {
                case 0:
                    return "linh || lẻ";
                case 1:
                    return flag ? "Mười" : "mười";
                case 2:
                    return flag ? "Hai mươi" : "hai || hai mươi";
                case 3:
                    return flag ? "Ba mươi" : "ba mươi";
                case 4:
                    return flag ? "Bốn mươi" : "bốn mươi";
                case 5:
                    return flag ? "Năm mươi" : "năm mươi";
                case 6:
                    return flag ? "Sáu mươi" : "sáu mươi";
                case 7:
                    return flag ? "Bảy mươi" : "bảy mươi";
                case 8:
                    return flag ? "Tám mươi" : "tám mươi";
                case 9:
                    return flag ? "Chín mươi" : "chín mươi";
            }
        }
        // hundred
        if (digitPosition == 2) {
            switch (digit) {
                case 1:
                    return "Một trăm";
                case 2:
                    return "Hai trăm";
                case 3:
                    return "Ba trăm";
                case 4:
                    return "Bốn trăm";
                case 5:
                    return "Năm trăm";
                case 6:
                    return "Sáu trăm";
                case 7:
                    return "Bảy trăm";
                case 8:
                    return "Tám trăm";
                case 9:
                    return "Chín trăm";
            }
        }
        return null;
    }
}
