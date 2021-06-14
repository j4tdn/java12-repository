package access.modifier.pk2;

import access.modifier.pk1.Pk1Ex01;
import access.modifier.pk1.Pk1Ex02;
import access.modifier.pk1.Pk1Ex02Impl;

public class Pk2Ex01 {
        public static void main(String[] args) {
                Pk1Ex01 pk1 = new Pk1Ex01();
                pk1.publicMethod();

                Pk1Ex02 pk1Ex02 = new Pk1Ex02Impl();
                pk1Ex02.defaultMethod();

        }
}
