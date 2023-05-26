package day17_Arrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleme {
    public static void main(String[] args) {


        //verilen array'e istenen elementi ekleyelim

        int[] arr={4,5,6};
        int eklenecekElement=10;


       // arr = new int[4]; // [0,0,0,0] burada direkt atama yaparsak eski degerler kaybolur.


       int[] yeniArr= new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i];
        } //yeniArr[4,5,6,0]

        yeniArr[yeniArr.length-1]=eklenecekElement;
        System.out.println(Arrays.toString(yeniArr));//[4,5,6,7]

        arr=yeniArr;

        System.out.println(Arrays.toString(arr));//[4,5,6,7]


    }
}
