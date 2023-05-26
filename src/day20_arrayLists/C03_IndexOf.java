package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");
        System.out.println(isimler); // [Kubra, Mustafa, Emre, Ferhat, Erdal]

        // 2. INDEXTEKI ISMI YAZDIR

        System.out.println(isimler.get(2)); // Emre

        // FERHATIN INDEXINI YAZDIRIN
        System.out.println(isimler.indexOf("Ferhat")); // 3 (Kacinci sirada oldugunu yazdirdi)


        System.out.println(isimler.indexOf("Hilal")); // -1 (Olmayan degeri yazdirdigimiz icin -1 yazdirdi)





    }
}
