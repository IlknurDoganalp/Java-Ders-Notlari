package day39_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapIlkClass {

    public static void main(String[] args) {

        Map<Integer,String> okulMap=new HashMap<>();

        /* Bir Map olusturulurken ve element eklerken dikkat edecegimiz hususlar:

        1- Bilgilere sonrasan erisimin mumukun olabilmesi icin tum elementlerin ayni bilgileri
                barindirdigina ve ayni siralama ile elemente eklendiginden emin olmaliyiz.
        2-

         */

        okulMap.put(101,"Ali, Cem, 10, H, MF");// Element eklemek icin put kullanilir.
        okulMap.put(102, "Veli, Can, 10, M, TM");
        okulMap.put(103, "Ali, Can, 11, M, Soz");
        okulMap.put(104, "Ayse, Cem, 11, H, TM");
        okulMap.put(105, "Ayse, Han, 10, H, MF");
        okulMap.put(106, "Veli, Han, 10, H, MF");
        System.out.println(okulMap);



        // Map'te kac element oldugunu yazdirmak icin
        System.out.println(okulMap.size()); // 6


        // Tum key'leri yazdirmak icin
        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106]

        // Tum value'lari yazdirmak icin
        System.out.println(okulMap.values()); //[Ali, Cem, 10, H, MF, Veli, Can, 10, M, TM, Ali, Can, 11, M, Soz,
        // Ayse, Cem, 11, H, TM, Ayse, Han, 10, H, MF, Veli, Han, 10, H, MF]

        // Valuecollection'i icerisinde kac element vardir?
        System.out.println(okulMap.size());// 6

    }
}
