package day05_IncrementDecrement_Concatenation;

public class C01_IncrementDecrement {
    public static void main(String[] args) {

        int a = 20;
        a +=3;
        int b = a;
        System.out.println( "a : " + a +", b : " + b); // a:23 , b:23

        a=20;

        b=a;
        a += 3;

        System.out.println( "a : " + a +", b : " + b);

        a=20;
        System.out.println("a :" + a);
        a += 5;
        System.out.println("a :" + a);

        System.out.println("=================");

        a=20;
        //a'nin degerini 2 azaltin ve sonra a'nin degerini yazdirin

        a -= 2 ;
        System.out.println("a : " + a); //18







    }
}
