package ex02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {

        String pw;
        System.out.println("--- Create a new password ---");

        while (true) {
            try {
                System.out.println("Enter your new password : ");
                pw = ip.nextLine();
                amount(pw);
                character(pw);
                break;
            } catch (AmountCharactersException | CharacterException e) {
                e.printStackTrace();
            }
        }

    }

    public static boolean amount(String pass) throws AmountCharactersException {
        if (pass.length() < 8 || pass.length() > 256) {
            throw new AmountCharactersException("Your Password At Least 8 Characters Or At Most 256 Characters");
        }
        return true;
    }

    public static boolean character(String pass) throws CharacterException {
        int countLower = 0;
        for(int i = 0; i < pass.length(); i++) {
            if(Character.isLowerCase(pass.charAt(i))) {
                countLower++;
            }
        }
        if( countLower == 0) {
            throw new CharacterException("Your Password Must Be Have At Least One Lowercase Alphabetic Char");
        }

        int countUpper = 0;
        for(int i = 0; i < pass.length(); i++) {
            if(Character.isUpperCase(pass.charAt(i))) {
                countUpper++;
            }
        }
        if( countUpper == 0) {
            throw new CharacterException("Your passwork must be have at least 1 uppercase alphabetic char");
        }

        int countNumber = 0;
        for(int i = 0; i < pass.length(); i++) {
            if(Character.isDigit(pass.charAt(i))) {
                countNumber++;
            }
        }
        if( countNumber == 0) {
            throw new CharacterException("Your password must be have at least 1 number");
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(pass);
        boolean b = m.find();
        if(!b) {
            throw new CharacterException("Your password must be have at least 1 special character");
        }

        return true;
    }
}
