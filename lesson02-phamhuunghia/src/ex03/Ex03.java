package ex03;

import java.io.IOException;

public class Ex03 {

	public static int SodaoNguoc(int input) {
		int SoReturn = 0, nRem;
		while(input!=0) {
			nRem=input % 10;
			SoReturn = (SoReturn * 10) + nRem;
			input /= 10;
		}
		return SoReturn;
	}
	
	public static boolean isSoDoiXung(int input) {
		return ( input == SodaoNguoc(input));
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int Input;
		
		System.out.println("Nhập số: ");
		Input=readInt.ReadInt.nhapSo();
		
		String output = isSoDoiXung(Input) ? " Là số đảo ngược"
				:" Ko phải là số đảo ngược";
		System.out.println(Input + output);
	}

}
