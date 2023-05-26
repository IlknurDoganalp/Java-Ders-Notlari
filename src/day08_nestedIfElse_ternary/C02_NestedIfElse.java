package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        /* Kullanicidan cinsiyet ve yasini alin
        -Kadin, 60 yas uzeri , Erkek 65 yas uzeri emekli olabilir.
        -Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak icin .... yil daha calisman gerekir" yazdirin.
         -hatali giris yapilirsa kullaniciyi uyarin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("Lutfen cinsiyetinizi giriniz..." +
                "\nKadin icin : K, Erkek icin : E giriniz");

        char cinsiyet = scan. next().charAt(0);

        if (cinsiyet == 'k' || cinsiyet == 'K') { // Kadin

        if (yas<16 || yas>80){
            System.out.println("Gecersiz yas girisi,lutfen tekrardan deneyiniz");
        } else if (yas<60){
            System.out.println("Emekli olabilmek icin " + (60-yas) + " yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }

        } else if (cinsiyet == 'e' || cinsiyet == 'E') { //Erkek
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi,lutfen tekrardan deneyiniz");

        } else if (yas<65) {
                System.out.println("Emekli olabilmek icin "  + (65-yas) + " yil daha calismalisin");
            } else {
                System.out.println("Emekli olabilirsin");
            }

            } else{
            System.out.println("Gecersiz cinsiyet girisi yaptiniz duzeltiniz");




        }


    }
}
