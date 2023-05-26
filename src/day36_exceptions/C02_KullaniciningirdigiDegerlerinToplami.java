package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullaniciningirdigiDegerlerinToplami {
    public static void main(String[] args) {


         /*
         Kullanicidan istedigi kadar tamsayi alip toplayiniz.
         -Kullanici q veya Q 'ya bastiginda isl;emi sonlandirip kac sayi girildigini ve
         toplamini yazdirin.
         -Q veya q disinda tamsayi olmayan bir deger girilirse hata mesaji verip yeni deger
         isteyerek isleme devam edin.
          */

        Scanner scan=new Scanner(System.in);

        int sayac=0;
        int toplam=0;
        int girilenSayi=0;


           do {
               System.out.println("Toplanmak uzere pozitif tamsayi giriniz \nBitirmek icin Q'ya basiniz  ");

               try {
                   girilenSayi=scan.nextInt(); // q,Q girebilir. Veya gecersiz baska input girerse exception olusur.
                   toplam+=girilenSayi;
                   sayac ++;
               } catch (InputMismatchException e) {

                   char input=scan.next().charAt(0);
                   if (input=='q' || input=='Q'){
                       System.out.println("Girilen " +sayac +" adet tamsayinin toplami : " +toplam);
                       break;
                   }else {
                       System.out.println("Tamsayi degeri girmelisiniz");
                   }

               }


           }while (true);

        System.out.println("Bu is bu kadar");
    }



}
