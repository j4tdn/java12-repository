package ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static FastReader r=new FastReader();
    final static int mod=1000000007;
    final static int N=1000006;

    static int add(int a, int b){
        a+=b;
        if(a>=mod) a-=mod;
        return a;
    }

    static int mul(int a,int b){
        return (int)(1l*a*b%mod);
    }

    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static long lcm(long a, long b)
    {
        return (a / gcd(a, b)) * b;
    }

    static int MOD(long x){
        return (int)(x%mod);
    }


    static void solve(String s , String answer) {
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
        String s=r.next();
        String ans="";
        solve(s,ans);
    }
}