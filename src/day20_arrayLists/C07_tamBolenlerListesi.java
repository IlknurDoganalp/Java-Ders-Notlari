package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_tamBolenlerListesi {
    public static void main(String[] args) {

        // KULLANICIDAN MAIN METHOD'DA POZITIF BIR TAMSAYI ALIP
        //O TAM SAYIYI TAM BOLEBILEN TUM POZITIF TAMSAYILARI BIZE DONDUREN BIR METHOD OLUSTURUN.

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bolenleri bulunacak pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        System.out.println(pozitifBolenleriListele(girilenSayi));


    }

    public static List<Integer> pozitifBolenleriListele(int verilenSayi){ // 20

        List<Integer> pozitifBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=verilenSayi ; i++) {

            if (verilenSayi % i == 0){
                pozitifBolenlerListesi.add(i);
            }
        }

        return pozitifBolenlerListesi;
    }
}
