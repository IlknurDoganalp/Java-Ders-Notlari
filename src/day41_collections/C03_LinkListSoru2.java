package day41_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkListSoru2 {

     static List<Double> notListesi=new LinkedList<>();


    public static void main(String[] args) {


        /*
        SORU: Bir ogretmenden ogrencilerin  notlarini girmesini isteyin,
        not girme islemi bittiginde Q'ya basilmalidir.
        asagidaki sekilde output olusturun
        not ortalamasi: .....
        ogrenci sayisi: ....
        ortalama altindaki ogrenci sayisi: ....
        ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi: .....
         */

        System.out.println("Oncelikle ogrenci not listesini olusturalim");
        notListesineDegerEkle();

        double notToplami=0;
        double notOrtalamasi;
        int ortalamaninAltindakiOgrenciSayisi=0;
        int ortalamanin10puanAltveUstundaOlanOgrenciSayisi=0;


        for (Double eachNot:notListesi
             ) {
            notToplami+=eachNot;
        }
         notOrtalamasi=notToplami/notListesi.size();

        for (Double eachNot:notListesi
             ) {

            if (eachNot < notOrtalamasi) {

                ortalamaninAltindakiOgrenciSayisi += 1;
            }

            if (eachNot >= notOrtalamasi - 10 && eachNot <= notOrtalamasi + 10) {
                ortalamanin10puanAltveUstundaOlanOgrenciSayisi += 1;
            }
        }

            System.out.println("Not Ortalamasi: "+notOrtalamasi+
            "\n Ogrenci Listesi: "+notListesi.size()+
                    "\nOrtalama altindaki ogrenci sayisi:"+ortalamaninAltindakiOgrenciSayisi+
                    "\nOrtalamanin 10 puan alt ve ustunde olan ogrenci sayisi:"+ortalamanin10puanAltveUstundaOlanOgrenciSayisi);
            
        }








    public static void notListesineDegerEkle() {

        Scanner scan = new Scanner(System.in);
        double not;
        boolean loopDevam = true;

        while (loopDevam) {
            try {
                System.out.println("Lutfen ogrenci notlarini giriniz \nBitirmek icin Q'ya basiniz");
                not = scan.nextDouble();
                notListesi.add(not);

            } catch (Exception e) {

                String girilenDeger = scan.nextLine();

                if (girilenDeger.equalsIgnoreCase("Q")) {
                    loopDevam = false;
                    break;
                } else{
                System.out.println("Not icin sayisal degerler girmelisiniz");
            }


        }
    }












    }


}
