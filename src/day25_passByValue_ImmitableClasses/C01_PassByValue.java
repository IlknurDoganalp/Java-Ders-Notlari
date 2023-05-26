package day25_passByValue_ImmitableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar); // 3 , 4 , 5

        elementleriArttir(sayilar);

        // ELEMENTLERI ARTTIR METODUNU CALISTIRDIKTAN SONRA

        System.out.println("Elementleri arttir methodundan sonra : " + sayilar);


          yeniListeAta(sayilar);
        System.out.println("Yeni liste ata methodundan sonra : " +sayilar);

    }

    public static void elementleriArttir(List<Integer> sayilar){

        // tum elementleri 2 katina cikartin. 

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, 2*sayilar.get(i));
            
        }
        System.out.println("Elementleri arttir metodunda : " +sayilar);
        
    }

     public static void yeniListeAta(List<Integer>sayilar){

        // SAYILAR LISTESINE YENI BIR LIST DEGERI ATAYIP
         //SONRA 1,2,3 ELEMENTLERINI EKLEYIN

         sayilar=new ArrayList<>();
         sayilar.add(1);
         sayilar.add(2);
         sayilar.add(3);

         System.out.println("Yeni liste ata methodu : " + sayilar);


     }


}
