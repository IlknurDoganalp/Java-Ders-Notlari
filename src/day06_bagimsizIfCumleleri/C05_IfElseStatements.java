package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan notunu alin
        //50 veya daha buyukse "Sinifi Gectin"
        // 50'den kucukse "maalesef Kaldin"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >= 50 && not <= 100) {
            System.out.println("Sinifi gectiniz");

        }

        else {

            System.out.println("Maalesef kaldin");
        }


        //Kullanicidan pozitif bir tam sayi alin,
        //Sayinin tek veya cift oldugunu yazdirin.


        //Kullanicidan pozitif bir sayi alin
        // 5 ile bolunup bolunmedigini yazdirin.

    }
}
