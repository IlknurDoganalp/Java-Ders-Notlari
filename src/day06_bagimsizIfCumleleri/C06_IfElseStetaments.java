package day06_bagimsizIfCumleleri;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C06_IfElseStetaments {
    public static void main(String[] args) {

        //Kullanicidan yasini isteyin,
        //65 yas ve uzeri ise "Emekli Olabilirsin"
        //yoksa emekli olmasi icin gerekli gun sayisini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        double yas= scan.nextDouble();

        if (yas >=65) {
            System.out.println("Emekli olabilirsin");
        } else {

            System.out.println("Emekli olabilmek icin daha " +(65-yas)+ "yil calismalisin" );

        }


    }
}
