package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(61);
        sayilar.add(11);
        sayilar.add(14);
        sayilar.add(3);
        sayilar.add(72);

        // cift olan sayilari silin

        Iterator it1 = sayilar.iterator();





        while (it1.hasNext()){

            Integer sayi = (Integer) it1.next();

            if (sayi%2 == 0){
                it1.remove();

            }

            /* next methodunu calistirdigimizda bir yana gecer ve bize o sayiyi getirir. For each loop ile benzer
             ancak sirali ve biz cagirdikca  getirir.

             */
        }

        System.out.println(sayilar);

    }
}
