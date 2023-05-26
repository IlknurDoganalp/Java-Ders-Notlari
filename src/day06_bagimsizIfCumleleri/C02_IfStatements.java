package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        //Kullanicidan 1 sayi isteyin,
        //sayiyi kontrol edip, 5 ile bolunebiliyorsa "Sayi 5'in tam kati" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 5 ==0){
            System.out.println("Sayi 5'in tam kati");
        }


    }
      }
