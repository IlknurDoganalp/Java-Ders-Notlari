package day42_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {


        Deque<String> dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("H");

        dq1.addLast("F");// Eklemeyi kullaniciya birakir, isterse sona isterse basa ekleme yapabilir.
                      // Queue'daki gibi araya ekleme yapmaz. //[K, H, F]

        dq1.addFirst("A");// Eklemeyi basa yapar.  //[A, K, H, F]

        System.out.println(dq1.getLast());// Sondaki elementi getirir. F
        System.out.println(dq1.getFirst());// Bastaki elementi getirir. A

        System.out.println(dq1.remove()); // Bastaki elementi siler ve bize getirir. pool ile cok benzer.
                                          // Egerki  bos bir arayi remove yapmak istersek exceptions firlatir.

        System.out.println(dq1.poll()); // bos arrayi yazdirdigimizda "null" yazdirir exception firlatmaz.

        dq1.push("S"); // push; bizden bir Strin ister ve deque'in basina element ekler.
                          // Deque ile ilgili bir sinirlandirma
                         //varsa ve yer kalmamissa IllegalStateException verir.

        System.out.println(dq1.pop());// Ilk elementi siler ve bize dondurur. RemoveFirst ile ayni islevi gorur.

        System.out.println(dq1.element());// ilk elementi silmeden bize dondurur.Bos deque'de calisirsa exception firlatir

        System.out.println(dq1.peek());// Silmeden bastaki elementi bize dondurur. Bos deque'i calistirirsak null dondurur.
                                       // Exception firlatmaz.

        dq1.offer("C"); // Deque'in sonuna (kuyruguna) element ekliyor.
          // KApasite sinirlamasi oldugunda yerlestirdiginde "TRUE", yerlestiremediginde "FALSE" dondurur.


        System.out.println(dq1);
    }
}
