package day42_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {


        Set<Integer> sayilar = new HashSet<>();

        sayilar.add(12);
        sayilar.add(15);


        Set<Integer> siraliSet = new TreeSet<>();

        siraliSet.add(23);
        siraliSet.add(34);
        siraliSet.addAll(sayilar);

        System.out.println(siraliSet); //[12, 15, 23, 34]


         /*
         Bir  hasSet ve bir treeSet olusturup,
         ikisine de 100 tane sayi ekleyip
         islem surelerini kiyaslayalim
          */

        Random rnd = new Random();
        int sayi;

        LocalTime hashBas = LocalTime.now(); // Aradaki sure farkini hesaplayabilmek icin for'un basina ve sonuna
        // local time tanimladik. Bu islem sirali set icinde gecerli

        for (int i = 0; i <= 100; i++) {

            sayi = rnd.nextInt(1000);
            sayilar.add(sayi);

        }
        LocalTime hashBit = LocalTime.now();


        LocalTime treeBas = LocalTime.now();

        for (int i = 0; i <= 100; i++) {

            sayi = rnd.nextInt(1000);
            siraliSet.add(sayi);
        }

        LocalTime treeBit = LocalTime.now();

        System.out.println("Hash Set Baslangic: "+ hashBas+ "Bitis: "+hashBit);//Hash Set Baslangic: 19:18:21.233845Bitis: 19:18:21.235029
        System.out.println("Tree Set Baslangic: " +treeBas+ "Bitis: "+treeBit);//Tree Set Baslangic: 19:18:21.235115Bitis: 19:18:21.235887
    }
}
