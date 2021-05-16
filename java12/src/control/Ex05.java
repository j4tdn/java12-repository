package control;

public class Ex05 {
    public static void main(String[] args) {
        int n=7;
        //print number < 7 3 ways
        printwithDoWhile(n);
        printwithFor(n);
        printwithWhile(n);
        demoBreakContinue(n);
    }
    private static void printwithFor(int n) {
        System.out.println("\n=================");
        for(int i=0;i<n;i++)
        {
            System.out.print(i);
        }
    }
    private static void printwithWhile(int n) {
        System.out.println("\n=================");
        int i=0;
        while(i<7)
        {
            System.out.print(i);
            i++;
        }
//	while (true)
//	{
//		if(i==n) break;
//		System.out.print(i+ " ");
//		i++;
//	}
    }
    private static void printwithDoWhile(int n)
    {
        System.out.println("\n=================");
        int i=0;
        do
        {
            System.out.print(i);
            i++;
        }
        while(i<7);
    }
    private static void demoBreakContinue(int n) {
        System.out.println("\n======Demo break==========");
        for(int i=0;i<n;i++)
        {
            if(i==3)
                break; // break 012
            System.out.print(i);

        }
        System.out.println("\n======Demo continue==========");
        for(int i=0;i<n;i++)
        {
            if(i==3)
                continue; //012456
            System.out.print(i);

        }
    }
    }

