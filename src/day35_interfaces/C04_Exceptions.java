package day35_interfaces;

import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=4;

        System.out.println(sayi1 / sayi2); // 5


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi3= scan.nextInt();
        if (sayi3==0){
            System.out.println("Sifir giremezsiniz");
        }else
        System.out.println(sayi1 / sayi3); //2


    }
}
