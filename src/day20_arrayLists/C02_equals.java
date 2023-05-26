package day20_arrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_equals {
    public static void main(String[] args) {

        List<Integer>sayilar1=new ArrayList<>();
        sayilar1.add(3);
        sayilar1.add(8);
        sayilar1.add(1);
        sayilar1.add(2);


        List<Integer>sayilar2=new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(1);
        sayilar2.add(8);
        sayilar2.add(2);


        System.out.println(sayilar1.equals(sayilar2)); // false  "equals hem elementleri hem de indexleri kontrol eder."

        Collections.sort(sayilar1);
        Collections.sort(sayilar2);
        System.out.println("sayilar1 :" +sayilar1); // sayilar1 :[1, 2, 3, 8]
        System.out.println("sayilar2 :" +sayilar2); // sayilar2 :[1, 2, 3, 8]


        System.out.println(sayilar1.equals(sayilar2)); // true





    }
}
