package day33_pollymorphism;

public class BChild extends AParent{


    @Override
    void method1() {
      //  super.method1();
        // burada super. olursa hem child class'daki method1
        // hem de super class'daki method1 calisir

    }


    @Override
    void method2() {
         /*
            bir method override edildiginde
            child class'da @Override notasyonu KULLANILABILIR
            kullanmak veya kullanmamak arasinda
            pratikte soyle bir sonuc olusur.
            eger notasyon kullanilirsa
            iki method arasindaki iliski takip edilir
            parent class'daki method silinirse
            notasyon CTE verir
            notasyon yoksa
            parent class'daki overriden method silinirse
            bir uyari verilmez, CTE olusmaz
         */

    }

    Integer method3(){
        /*
        Overridden method ile overridingmethod'un
        isim ve signature'lariayni olmalidir.

        return type ve access modifier
        SIGNATUR'A DAHIL DEGILDIR.

        1-ACCESS MODIFIER KURALI:
        child parent'i kisitlayamaz.

        *Eger Overridden ve Overriding method'lari
        private yaparsak bu iki method bagimsiz olarak calisir
        aralarinda override islami olmaz.

        2-RETURN TYPE KURALI:
        Return type Primitive veya void ise
        iki method'un return type'lari AYNI OLMALIDIR.

        *Non-Primitive oldugunda ya ayni olmali ya da
        parent class'daki return type child classdaki
        return type'i parent olmali.  (Covariant data )


         */

        return 5;
    }
}

