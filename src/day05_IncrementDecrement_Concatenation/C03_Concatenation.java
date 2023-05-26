package day05_IncrementDecrement_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {
        //Bir String baska bir String veya baska data turunden bir variable ile
        // + isareti ile birlestirilebilir

        String a= "Java";
        String b= "Guzeldir";
        System.out.println( a + " " + b ); // Java Guzeldir

        int c=10;
        int d=20;
        System.out.println(a+c+d); // Java1020

        // Eger String ile baska data turundeki bir deger toplanirsa Java sonucu String yapar
        // Java 30 yazmak istersek

        System.out.println(a+(c+d)); // Java30

        System.out.println(a+c*d); //Java200

        System.out.println(d+c+a); //30Java





    }
}
