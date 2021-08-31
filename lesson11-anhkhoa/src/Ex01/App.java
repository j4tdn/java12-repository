package Ex01;

public class App {
	public static void main(String[] args) {
		int n = 9;
		int k=0;
		int h = 0;
		for (int i = 0; i < n; i++) {
			if(k>0)
			{
				h++;
			}
			if(i>n/2)
			{
				k++;
			}
			
			for (int j = 0; j < n; j++) {
				
				if(i<=n/2)
				{
					if (j <= i || n - 1 - i  <=j)
						System.out.print(j +1);
					else
						System.out.print(" ");
				}
				else
				{
					if(j<i-k-h||j>=i)
						System.out.print(j+1);
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
