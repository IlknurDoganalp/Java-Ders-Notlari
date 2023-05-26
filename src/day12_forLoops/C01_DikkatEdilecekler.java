package day12_forLoops;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {


        for (int i = 20; i <10 ; i++) {
            System.out.print(i + " ");

            //bu durumda For Loop calisir ancak ilk deger icin bitis sarti false verdiginden
            //Loop body'si hic devreye girmez

        }

        for (int i = 0; i <10 ; i--) {
            System.out.print(i + " ");

            // burada 0 < 10 true yazdirir. for loop bodysi devreye girer ancak 2. calistirmada 0,
            // -1 degeri alacagi icin hicbir zaman icin +10'a ulasamayacak yani bitis degerinden uzaklasir
            //bu durumda for loop teorik acidan sonsuza kadar calisir. (SONSUZ LOOP) SONSUZ DONGU.

        }


    }
}
