package day25_passByValue_ImmitableClasses;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat); //23:06:37.240118
        System.out.println(saat.getNano());// nano saat : 186642000

        // bir loop ile 1'den 10bin'e kadar olan sayilari toplayin
       // ve bu islemin kac nano saniye surdugunu yazdirin

        int toplam=0;


        int basSuresiNano= saat.getNano();

        for (int i = 1; i <=10000 ; i++) {
            toplam += i;
        }

            LocalTime saatSon=LocalTime.now();

            int bitSuresiNano= saat.getNano();

            
        

        System.out.println("Islem suresi : " +(bitSuresiNano-basSuresiNano));

    }
}
