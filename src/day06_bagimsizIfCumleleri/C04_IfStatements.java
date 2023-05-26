package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan notunu yazmasini isteyin,
        // 50 veya daha buyukse "sinifi gectiniz";
        //50'Den kucukse "maalesef kaldin" yazdir.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >= 50 && not<= 100){
            System.out.println("Sinifi gectiniz");


            if (not<50){
                System.out.println("Maalesef kaldin");
            }

        }


    }
}
