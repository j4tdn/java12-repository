package access.modified.pk2;

import access.modified.pk1.Pk1Ex01;
import access.modified.pk1.Pk1Ex02;
import access.modified.pk1.Pk1Ex02Imp1;

public class Pk2Ex01 {
	public static void main(String[] args) {
		Pk1Ex01 pk1 = new Pk1Ex01();
		pk1.publicMethod();
		
		Pk1Ex02 pk1Ex02 = new Pk1Ex02Imp1();
		pk1Ex02.defaultMethod();
	}
}
