package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_TekrarlardanKurtulma2 {
    public static void main(String[] args) {

        int[] arr={3,4,5,6,3,4,2,3,5,4,6,4,5,5,4,3,5,7};


        List<Integer> benzersizElementlerList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!benzersizElementlerList.contains(arr[i])){
                benzersizElementlerList.add(arr[i]);
            }
            
        }
        System.out.println(benzersizElementlerList); //[3, 4, 5, 6, 2, 7]

         // ISTENEN LISTEYI LIST OLARAK ELDE  ETTIK
        //BUNU DIREKT ARR'YE ATAYAMAYIZ


        arr=new int[benzersizElementlerList.size()]; //size da uzunlugu verir !!!!

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=benzersizElementlerList.get(i);


        }

        System.out.println(Arrays.toString(arr)); //[3, 4, 5, 6, 2, 7]
    }
}
