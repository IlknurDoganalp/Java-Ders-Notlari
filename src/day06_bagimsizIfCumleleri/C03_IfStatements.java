package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise "Eskenar ucgen yaziniz".

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin uckenar uzunlugunu giriniz");


        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0);{
        System.out.println("Girilen kenarlar bir eskenar ucgen olusturur");
        }






    }
}
