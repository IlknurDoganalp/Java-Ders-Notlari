package day27_stringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        // JAVA'DA FARKLI DATA TURUNE SAHIP NON-PRIMITIVE OBJELER == ILE KARSILASTIRILAMAZ

        System.out.println(sb1 == sb2); // false
        System.out.println(sb1 == sb1); // true

        System.out.println(sb1.equals(sb2)); // false
        /* STRING BUILDER ICERIK AYNI OLSA BILE EQUALS METHODU "FALSE" DONER.
        CUNKU STRING BUILDER CLASSINDA EQUALS METHODU YOKTUR.
        EQUALS METHODUNUN PARENT CLASS'I OLAN OBJECT CLASS'INDAN
        KULLANIR. VE BUNDAN DOLAYI ICERIKLERE BAKMADAN "FALSE" VERIR.
         */

        System.out.println(sb1.equals(str)); // false

        /*
        2 STRING BUILDER'IN ICERIKLERININ AYNI OLDUGUNU KONTROL ETMEK ICIN
        "COMPARETO()" METHODU KULLANILIR.
         */

        System.out.println(sb1.compareTo(sb2)); //0

       //  System.out.println(sb1.compareTo(str)); SONUC: CTE VERIR


        StringBuilder sb3= new StringBuilder("Hava");
        StringBuilder sb4= new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); //2
        System.out.println(sb3.compareTo(sb4)); //4



        //NOT!!!!
    // CompareTo() Methodu karsilastirilan metinler ayni metne sahipse 0 doner
        // Ayni degilse  farkli olarak buldugun ilk harfin alfabetik olarak arasindaki farki yazdirir.



    }
}
