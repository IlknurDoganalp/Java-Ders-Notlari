package day36_exceptions;

public class C03_TryCatch {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=0;


        try {

            System.out.println(sayi1/sayi2);
            System.out.println("Deneme1");
            System.out.println("Deneme2");
            System.out.println("Deneme3");
        } catch (ArithmeticException e) {

            System.out.println("Bolen 0 olmamali");

        }

        /*

        Bir Try Blogunda exception olusursa o satirdan catch satirina kadar aradaki tum kodlar
        ignore edilir.
        Eger Try Blogunda exception olusmazsa catch devreye girmez. (If - Else gibi)

         */
    }
}
