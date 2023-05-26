package day20_arrayLists;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {


        int[]arr={2,3,4,5,6,7,8,6,5,4,3,2,1,8};

        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }

        System.out.println(sayilar); //  [2, 3, 4, 5, 6, 7, 8, 6, 5, 4, 3, 2, 1, 8]

        // LISTEMIZDE 3 VAR MI DIYE KONTROL ETTIGIMIZDE CONTAINS KULLANILIR

        System.out.println(sayilar.contains(3)); // true


    }
}
