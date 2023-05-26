package day41_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();

        ll1.add("K");
        ll1.add("T");


        List<String> ll2=new LinkedList<>();
        ll2.add("R");

        ll2.add("Z");

        ll2.add(0,"A");

        ll2.addAll(2,ll1); //[A, R, K, T, Z]



        System.out.println(ll2);

        /*
        Collections objeleri bir arada tutuan yapılardır.

        Günlük hayatta karşılaşılan durumlarla ilgili oluşan ihtiyaçlara göre farklı collections yapıları vardır.
        Bir uygulamada hangi collection'ı kullancağımıza  özelliğine göre karar veririz.

        3 ana collection'dan bahsedebiliriz
            1-List
            2-Queue
            3-Set
            3 Interface ile kuralları belirleniyor.

        Interfacelerden obje oluşturamadığımız için child classlardan conctructorlarını  kullanabiliriz.
        Özellikleri constructorlar değil DATA TÜRÜ olarak seçtiğimiz collection belirler.

         */


        List<String> Linked2=new LinkedList<>();
        Queue<String> Lineked3=new LinkedList<>();
        Deque<String > Linked4=new LinkedList<>();

    }
}
