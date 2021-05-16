package ex01;

import java.io.IOException;

public class Ex01 {
	public static boolean CheckSoLuyThua(int input) {
		int temp = input;
		for (int i = 1; i < input; i++) {
			if (temp % 2 != 0)
				return false;
			temp /= 2;
			if (temp == 1)
				break;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int Input;
		
		System.out.println("Nhập số: ");
		Input=readInt.ReadInt.nhapSo();
		String output = CheckSoLuyThua(Input) ?  
				" là luỹ thừa của 2" : " ko là luỹ thừa của 2";
		System.out.println(Input + output);
	}

}
