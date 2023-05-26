package day04_dataCasting_wrapperClasses;

public class C01_AsciiTable {
    public static void main(String[] args) {


        /*
        24==> 11000
        a ==> 97 ==> 10100010
        b ==> 98
         */

        System.out.println(5 + 'a'); // 5+97=102

        char ilkHarf= 101;

        System.out.println(ilkHarf);  //e

        char girilenChar= 'f';
        System.out.println(girilenChar+1); //102+1=103

        System.out.println("Girilen harfin bir sonrasi : "+(char) (girilenChar+1));

        girilenChar= 'M';










    }
}
