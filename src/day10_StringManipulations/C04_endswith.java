package day10_StringManipulations;

import java.util.Scanner;

public class C04_endswith {
    public static void main(String[] args) {
         // Kullanicidan bir mail adresi alin
        //mail @ icermiyorsa "gecersiz mail
        //mail gmail icermiyorsa "mail gmail olmali"
        //mail @gmail ile bitmiyorsa "mailde yazim hatasi var" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen mail adresiniz giriniz");

        String mail= scan.nextLine();
        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
            
        }  if (mail.contains("gmail icermiyorsa")) {
            System.out.println("mail gmail olmali");
        } if (mail.endsWith("gmail")){
            System.out.println("mail'de yazim hatasi var");

        }

    }


    }

