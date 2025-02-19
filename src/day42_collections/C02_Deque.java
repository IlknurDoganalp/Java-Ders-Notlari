package day42_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        Deque<String>urunler=new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");

        // Tum urunlerin basina "Y " ekleyiniz.


        String eleman="";
        Deque geciciDeque=new LinkedList();

        while (eleman!=null){

            eleman=urunler.poll(); // poll methodu ilk elementi silip, bize dondurur.
                                  // Deque bos olursa null dondurur, exception firlatmaz.

            if (eleman!=null){
                eleman="Y "+eleman;
                geciciDeque.add(eleman);
            }
        }

        urunler=geciciDeque;
        System.out.println(urunler); //[Y Nutella, Y Cikolatali Gofret, Y Cokoprens]

    }
}
