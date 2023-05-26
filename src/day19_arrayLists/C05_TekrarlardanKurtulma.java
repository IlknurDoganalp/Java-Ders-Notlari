package day19_arrayLists;

import day17_Arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {

        // VERILEN BIR ARRAYDEN TEKRAR EDEN SAYILARI SILIP
        //HER BIR ELEMENTIN YALNIZCA 1 KEZ KULLANILDIGI HALE DONUSTURUN.


        int [] arr={3,4};
        arr= C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,5); //[3, 4, 5]

        System.out.println(Arrays.toString(arr));


        arr= C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,15); //[3, 4, 5, 15]

        System.out.println(Arrays.toString(arr));

        List<String> harfler= new ArrayList<>(); //  []
        System.out.println(harfler);

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler);  // [s, l, a]


    }
}
