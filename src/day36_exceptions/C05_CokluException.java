package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {

    public static void main(String[] args) {

     String str="Java her gecen gun guzellesiyor";
     int[] arr={1,2,3,4,5,6,7,3,4,5,4,2,3};

     //Kullanicidan 0 veya pozitif tamsayi isteyiniz
        // Girilen degeri index olarak kullanip
        //str arr'in o indexsindeki elemanlarini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozitif bir tamsayi giriniz ");

        /*

        Birbirinden bagimsiz
        3 farkli turde exception riski var
        bunlari farkli sekilde handle edebiliriz.

        1- Hepsini ayri ayri try-catch yapabiliriz.
        2- Tek bir Try birden fazla Catch yapilabilir.
        3- Tek bir Try Catch yapip tum exceptionlari yakalayacak bir exception turu yazilabilir.

         */


        try {
            int index= scan.nextInt();

            System.out.println(str.charAt(index));

            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("Tamsayi girmelisiniz");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("");
        }

    }
}
