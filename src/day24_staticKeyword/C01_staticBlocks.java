package day24_staticKeyword;

public class C01_staticBlocks {


    public static void main(String[] args) {

        System.out.println("Main method calisti");
        System.out.println("=====================");

        C01_staticBlocks obj1=new C01_staticBlocks();
    }
    static {

        System.out.println("Static Block calisti");
    /*
    STATIC BLOCKS; class ilk calismaya basladiginda calisir
    genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir.

    Birden fazla static blocks varsa yukaridan asagi dodru sirali bir sekilde calisir.
    Hangisi ustteyse ilk olarak o calisir.
     */

    }

    {
        /*
        Static olmayan bloklar ise obje olusturulurken constructordan once calisir.
        Obje icin yapiulmasi gereken on ayarlamalari yapmak icin kullanilir.
         */

        System.out.println("Static olmayan blok calisti");
    }
}
