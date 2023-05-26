package day12_forLoops;

import java.util.concurrent.Callable;

public class C08_NestedForLoop {
    public static void main(String[] args) {


        // dinamik olarak verilen satir ve sutun sayisina gore
        //yildizlardan bir dikdortgen olusturun

        /* ornek:

         * * * * *
         * * * * *
         * * * * *

         */

        int satirSayisi = 3;
        int sutunSayisi = 5;


        int sayi=4;

       /* code sekmesine tiklayinca for loobu acilmadi!!!!


        for (int m =1; m <=sayi ;m++) {

            for (int i = 1; i <= sutunSayisi; i++) {
                System.out.print(m * i + " ");
            }
            System.out.println("");

        */


        System.out.println("");
        System.out.println("===========");


        for (int i = 1; i <=sayi; i++) { //satirlar 

            for (int j = 0; j <=sayi; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");

        }




    }

}


