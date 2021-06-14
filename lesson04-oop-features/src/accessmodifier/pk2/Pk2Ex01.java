package accessmodifier.pk2;

import accessmodifier.pk1.Pk1Ex01;
import accessmodifier.pk1.Pk1Ex02;
import accessmodifier.pk1.Pk1Ex02Imol;

public class Pk2Ex01 {
	public static void main(String[] args) {
		Pk1Ex01 s1 = new Pk1Ex01();
		s1.publicMethod();
		
		Pk1Ex02 pk1Ex02 = new Pk1Ex02Imol();
		pk1Ex02.defaultMethod();
	}
}
