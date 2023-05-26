package day17_Arrays;

import java.util.Arrays;

public class C04_SagaKaydirma {
    public static void main(String[] args) {

        // Verilen int bir array'deki tum elementleri bir saga kaydirip
        // sondaki elementi de en basa alip kaydedin
        // Ornek; [3,4,5,6] son hali; [6,3,4,5]


        int [] arr={3,4,5,6};

        int temp= arr[arr.length-1];   // SON HARFI GECICI INDEKSE ALMAK ICIN ARR.LEGTIN-1'INI ALDIK

        for (int i = 0; i < arr.length; i++) {

            arr[arr.length-1-i] = arr[arr.length-2-i];
            
        }
      arr[0]=temp;

        System.out.println(Arrays.toString(arr));
    }

}
