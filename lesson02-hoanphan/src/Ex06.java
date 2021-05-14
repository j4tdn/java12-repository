
public class Ex06 {
	public static void main(String[] args) {
		int primeCount=0;
        int max = 1500;
		for (int i = 1; i <= max; i++) {
            if (isPrimeNumber(i)) {
            	primeCount++;
            	if(primeCount==200)
                System.out.print("so nguyen to thu 200 la: "+i);
            }
        }
	}
	public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
