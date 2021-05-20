package data;

public class Ex08PriVsOb {
    public static void main(String[] args) {
        //ctrl + shift + o --> remove redundant import
        //char, Character
        char a = 'x';
        char b = '5';

        System.out.println("a " +isDigist(a));
        System.out.println("b " +isDigist(b));

        System.out.println("a " +Character.isDigit(a));


    }
    private static boolean isDigist(char tmp) {
        //	if(tmp >= '0'&& tmp<= '9') {
        //		return true;
        //	}else {
        //		return false;
        //	}
        return (tmp >= '0'&& tmp<= '9');
    }

}
