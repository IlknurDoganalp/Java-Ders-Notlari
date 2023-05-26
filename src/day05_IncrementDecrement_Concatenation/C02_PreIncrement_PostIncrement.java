package day05_IncrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        // a'nin degerini 1 arttirin ve yeni degerini olusturup b variable'ina atayin

        int a=20;
        int b=++a; //once arttir sonra atama yapar

        System.out.println("a : " + a + ", b : " + b); // a:21 , b:21

        //a"nin degerini b'ye atayin, sonra a'nin degerini 1 arttirin

        a=20;
        b=a++;
        System.out.println("a : " + a +", b : " + b); // a:21 , b:20


        // a'nin degerini yazdirin ve sonra a'yi 1 arttirin

        a=20;
        System.out.println("a :" + a); // a:20
        a++;
        System.out.println("============");

        a=20;
        System.out.println("a : " + a++);
        System.out.println("Bir sonraki satirda  a : " + a); //a:21

        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin
        a=20;
        System.out.println(--a); // a:19
        System.out.println("bir sonraki satirda a : " + a); // a:19













    }
}
