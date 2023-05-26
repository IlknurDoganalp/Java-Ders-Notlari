package day15_doWhileLoop_scope;

public class C02_RakamlarToplamiBulma {


    //verilen pozitif tamsayinin
    // rakamlar toplamini bize donduren bir method olusturun


    public static int rakamlarToplaminiBul(int verilenSayi) {
        int sayi = verilenSayi;
        int birlerBasamagi = 0;
        int rakamlartoplami = 0;

        int basamakSayisi= (sayi + "").length();

        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagi=sayi%10;
            rakamlartoplami +=birlerBasamagi;
            sayi /=10;

            
        }
        return rakamlartoplami;

        }


    }      // BU CLASS MAIN METHOD OLMADIGI ICIN YAZDIRILMAZ. YALNIZCA  DÖNDÜRME ISLEMI YAPILDI.
           // BU CLASS'I BASKA CLASSLARDA YAZDIRABILIRIZ!!!


