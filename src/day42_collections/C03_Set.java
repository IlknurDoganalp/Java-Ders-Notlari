package day42_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {

    public static void main(String[] args) {

        // Verilen bir Array'in tekrar eden elementlerini silip,
        // her elementin sadece 1 kere kullanildigi hale getirin

        int[]arr={2,3,4,5,7,8,6,5,4,3,2,3,45,6,6,6,4,3,3,5,6,2,4,5,6};

        //[2, 3, 4, 5, 6, 7, 8, 45] // Elementlerimizin tekrarsiz hali.

        Set<Integer> geciciSet=new HashSet<>();

        for (Integer each:arr
             ) {
            geciciSet.add(each);

        }

        arr=new int[geciciSet.size()]; // Eski arr'e yeni boyut tanimladik(8 uzunlugunda ve bos)
                                             // Arr'yi yeni haline uygun uzunluga getirmis olduk.
                                                  //Set'teki benzersiz hale getirilen elementleri
                                                 // gecici Arr'ye tasiyalim.


        int index=0;
        for (Integer each:geciciSet
             ) {
            arr[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 6, 7, 8, 45]
    }
}
