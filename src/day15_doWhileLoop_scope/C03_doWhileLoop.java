package day15_doWhileLoop_scope;

public class C03_doWhileLoop {
    public static void main(String[] args) {


        int sayi=3;
        int toplam=0;

        while (sayi>0){

            toplam +=sayi*sayi;
            sayi--;
        }

        System.out.println("while toplam :" + toplam); //14

      sayi=3;
      toplam=0;

      do {

          toplam += sayi * sayi;
          sayi--;

      }while (sayi>0);

        System.out.println("do while toplam : " +toplam); //14

          }
      }



