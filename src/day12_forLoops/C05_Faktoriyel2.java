package day12_forLoops;

public class C05_Faktoriyel2 {
    public static void main(String[] args) {

        //Kullanicidan 20'den kucuk bir sayi alin,
        //bu sayinin faktoryel degerini hesaplayin.
        //Konsolda faktoriyel hesabinin yapilisini da yazdirin.
        //Or: 6!=6*5*4*3*2*1=720

        int sayi = 6;
        int faktoriyel = 1;
        System.out.print("6!  = ");

        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;

            if (i != 1) {
                System.out.print(i + " * ");

            } else {
                System.out.print(i + "  ");
            }

        }
            System.out.println("= " + faktoriyel);



    }
}
