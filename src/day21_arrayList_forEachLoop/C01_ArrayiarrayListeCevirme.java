package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayiarrayListeCevirme {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 5, 3, 1, 3, 4, 5, 6, 7};

        // arr arrayinin elementlerini iceren bir array list olusturun

        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

            //


        }
        System.out.println("Sayilar Listesi : " + sayilar); // [2, 3, 4, 5, 6, 7, 5, 3, 1, 3, 4, 5, 6, 7]


        // Java'da bir array'i arrayList'e cevirmek icin kullanilan asList() vardir
        // ancak kullanimi tavsiye edilmez, cunku 2 tane buyuk dezavantaji vardir
        //   1- asList() kullanilarak array'den list'e cevrilen listelerde
        //   ekleme / silme gibi uzunlugu degistiren method'lar kullanilamaz

        // 2- Arka planda array ve array'den donusturdugumuz list beraber hareket eder
        //  birinde yaptigimiz update'ler otekine de islenir

    }
}