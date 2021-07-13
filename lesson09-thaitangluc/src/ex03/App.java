package ex03;

import java.util.Scanner;

public class App {
    public static void solve(String s , String answer) {
        if (s.length()==0) {
            System.out.println(answer);
            return;
        }

        for(int i=0;i<s.length();++i) {
            char ch = s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String ret=left+right;
            solve(ret,answer+ch);
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
    	String s=ip.next();
        String ans="";
        solve(s,ans);
    }
}