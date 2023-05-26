package day12_forLoops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin



        int bas=20;
        int bit=40;

        int sayiToplami=0;

        if (bit<bas){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
        } else {
            for (int i = 20; i <= 40; i++) {

                sayiToplami +=i;

            }
        }

        System.out.println("Sayilarin Toplami :  " +sayiToplami );
    }
}
