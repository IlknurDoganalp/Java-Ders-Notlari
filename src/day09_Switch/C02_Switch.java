package day09_Switch;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ay numarasini giriniz");
        int ayNo= scan.nextInt();


        switch (ayNo){
            case 12:
            case 1 :
            case 2 :
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Ilkbahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Ay numarasi hatali");

        }

    }
}




