package day41_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();  // Queue her zaman icin sona ekleme yapar


        q1.add("H");
        q1.add("Y");

        q1.offer("K"); // offer eleman sayisi ile ilgili bir sinirlama varsa eklemez,
                    // ancak Queue'da boyle bir durum soz konusu degildir.
                   // Kapasite sinirlamasi yapilmadigi muddetce add() ile ayni islemi yapar.

        System.out.println(q1.remove()); //H
        // Remove'da  normalde kaldiracagimiz objeyi soylememiz gerekiyor ancak
        // Queue eklemeyi sona yapip, kullanmayi bastan yaptigi icin, parametre girmedigimizde
        // bastaki elemani remove eder ve bize dondurur.

        System.out.println(q1.remove("K")); //true

        q1.poll(); // q'nun basindaki sayiyi siler ve bize dondurur. q bos ise "null dondurur.

        System.out.println(q1.poll()); // null

        /*
        NOT:
        q1.pool() remove ile ayni islemi yapar yani bastaki elementi siler
        ve bize dondurur.

       !!! Aralarindaki fark bos queue'da calistirildiklarinda remove exception firlatirken,
        pool exception firlatmaz.
         */


          q1.peek();
        // silmeden queue'nun basindaki elementleri bize getirir,
        // Egerki queue bossa null getiriyor.

        q1.element();
        // egerki bos bir queue'yu calistirirsak q1.element() bize exceptions firlatir.

        System.out.println(q1);



    }
}
