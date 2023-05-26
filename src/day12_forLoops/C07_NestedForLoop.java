package day12_forLoops;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        //verilen bir rakam icin carpim tablosu olusturun


        int sayi=4;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");
        for (int i = 1; i <=sayi ; i++) {
            System.out.print(2 * i + " ");

        }
        System.out.println("");
        for (int i = 1; i <=sayi ; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println("");
        for (int i = 1; i <=sayi ; i++) {
            System.out.print(4 * i + " ");
        }

        System.out.println("===========");

        for (int m = 1; m <=sayi ; m++) {

            for (int i = 1; i <= sayi; i++) {
                System.out.print(m * i + " ");

            }
            System.out.println("");
        }
    }
}
