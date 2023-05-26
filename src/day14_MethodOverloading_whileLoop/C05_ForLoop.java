package day14_MethodOverloading_whileLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 50 ve 100 arasindaki sinirlar dahil sayilari toplayin

        int toplam = 0;

        for (int i = 50; i <= 100; i++) {
            toplam += i;

        }

        System.out.println("Toplam " + toplam);


        toplam = 0;
        int sayi = 50;

        while (sayi <= 100) {
            toplam += sayi;
            sayi++;

        }

        System.out.println("While ile toplam  " + toplam);
    }
}

