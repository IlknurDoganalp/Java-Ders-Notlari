package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {

        // soru-1



        int[] arr = {2, 3, 4, 5, 6, 7, 5, 3, 1, 3, 4, 5, 6, 7};

        List<Integer> benzersizElementListesi=new ArrayList<>();

        // ARRAYDEKI HERBIR ELEMENTI KONTROL EDELIM LISTE YOKSA EKLEYELIM, VARSA EKLEMEYELIM

        for (int each:arr
             ) {

            if (!benzersizElementListesi.contains(each)){
                benzersizElementListesi.add(each);
            }

        }
        System.out.println(benzersizElementListesi); // [2, 3, 4, 5, 6, 7, 1]

        arr=new int [benzersizElementListesi.size()];


        for (int i = 0; i <arr.length ; i++) {

            arr[i]=benzersizElementListesi.get(i);
            
        }

        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 6, 7, 1]
    }
}
