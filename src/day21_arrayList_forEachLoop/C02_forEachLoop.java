package day21_arrayList_forEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 9, 8, 7, 6, 5, 4, 2, 3, 4, 5, 4, 6,};
         /*

         BIZDEN ISTENEN GOREVDE SIRALAMA ONEMSIZ ISE ASIL AMACLANAN
         TUM ELEMENTLERI ELDEN GECIRMEK ISE FOR LOOP YERINE FOOR EACH LOOP KULLANILABILIR!!!
         FOR EACH LOOPTA INDEX, BASLANGIC VE BITIS DEGERI YOK.
          */


        // arr'in tum elementlerinin  toplamini yazin
        int toplam = 0;
        for (int each : arr
        ) {
            toplam += each;
        }
        System.out.println("Elementlerin Toplami  : " + toplam); //77


        // arr'in elementlerinden 3 ile bolunebilenleri yazdirin

        for (int each : arr
        ) {
            if (each % 3 == 0) {
                System.out.print(each + " "); //3 9 6 3 6
            }

        }


        // arr'in elementleri icinde kac tane tek sayi oldugunu bulun

        int sayac=0;

        for (int each:arr
             ) {

            if (each %2 !=0)sayac++;
            
        }
        System.out.println("Array'deki tek sayiadedi : " +sayac); // 7
    }
}