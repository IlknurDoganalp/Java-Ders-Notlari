package day14_MethodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan toplanmak uzere sayilar alin
        //toplam 500'u asinca
        //kac sayi girdigini ve sayilar toplamini yazdirin


        Scanner scan = new Scanner(System.in);


        int girilenSayi = 0;
        int toplam = 0;
        int girilenSayiAdedi = 0;


        while (toplam < 500) { // toplam 500'den kucuk oldugu surece

            System.out.println("Toplanmak uzere bir tamsayi giriniz");

            girilenSayi= scan.nextInt();

            toplam+=girilenSayi;
            girilenSayiAdedi++;

        }
        System.out.println("Toplam   "+girilenSayiAdedi+" adet sayi girildi ve toplami "  +toplam);
    }
}
