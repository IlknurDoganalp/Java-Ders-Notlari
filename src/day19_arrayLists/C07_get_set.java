package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_get_set {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar); //[3, 5, 2]

        System.out.println(sayilar.get(0));//3

        // SON ELEMENTI YAZDIR
        System.out.println(sayilar.size()-1); //2

        //2 ELEMENTI 12 YAZDIRIN
        System.out.println(sayilar.set(1, 7)); // 5

        System.out.println(sayilar);// LISTENIN YENI HALI [3, 7, 2]





    }
}
