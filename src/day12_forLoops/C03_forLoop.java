package day12_forLoops;

import java.util.Scanner;

public class C03_forLoop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin,
        //Bitis degeri baslangic degerinden kucuk olsa da programi yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini tamsayi olarak giriniz");
        int bas= scan.nextInt();


        System.out.println("Lutfen bitis degerini tamsayi olarak giriniz");
        int bit= scan.nextInt();

        int sayilarToplami=0;

        if (bas<bit){
            for (int i = bas; i <= bit ; i++) {
                sayilarToplami +=i;
                
            }

        }else { // BURASI CALISTIYSA BASLANGIC DEGERI BITIS DEGERINDEN BUYUKTUR.

            for (int i = bas; i >=bit ; i--) {
                sayilarToplami +=i;
                
            }
        }
        System.out.println("SayilarinToplami  : " +sayilarToplami);
    }
}
