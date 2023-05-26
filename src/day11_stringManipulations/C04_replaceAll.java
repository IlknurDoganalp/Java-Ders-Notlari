package day11_stringManipulations;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str= "J1a23va34 5C54and65ir87";

        //str'daki sayilari method ile temizleyiniz.

        /* Eger degistirmek istedigimiz metin tek bir metin degil,
        ortak ozelligi olan farkli metinlerse
        -tum sayilar
        -tum space'ler
        -sayi olmayanlarin tumu
        -space olmayan tum karakterler
         */

        str= str.replaceAll("\\d","");
        System.out.println(str); //Java Candir

    }
}
