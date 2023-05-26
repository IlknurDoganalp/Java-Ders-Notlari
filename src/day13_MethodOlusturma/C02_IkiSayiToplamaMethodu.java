package day13_MethodOlusturma;

import java.util.Scanner;

public class C02_IkiSayiToplamaMethodu {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip
        // toplamlarini yazdiran  bir method olusturun.
  ikiSayiTopla();
    }

    public static void ikiSayiTopla(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak uzere iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Iki sayinin toplami  : " +(sayi1+sayi2));


    }




}
