package day28_Deneme;

import day28_AccessModifierv_encapsulation.C01;

public class Deneme {
    public static void main(String[] args) {

        C01 obj = new C01();

        // obj.str = "Fava";  farkli package default access modifier
        // C01.s="Fava"; farkli package default access modifier

        // obj.b=10; private access modifier

        // C01.c= 30;  private access modifier

        obj.d=50;
        C01.a=30;
    }
}
