package day16_Scope_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {


        String [] isimler={"Ali","Leyla","Halit"};
        int [] sayilar={1,2,3,4,5,6,7};
        char [] karakterler={'e','i','a'};


        String [] arr = new String[5];
        System.out.println(Arrays.toString(sayilar)); //[1, 2, 3, 4, 5, 6, 7]

        System.out.println(Arrays.toString(arr)); //[null, null, null, null, null]


        int [] a= new int[7];
        System.out.println(Arrays.toString(a));


        // ARRAY'DEKI ELEMENTLERE NASIL ULASIRIZ?  INDEX ILE

        a[0]=4;
        a[3]=7;

        System.out.println(Arrays.toString(a));


        // SAYILAR ARRAY'ININ 4. INDEXIN'DEKI ELEMENTI YAZDIRIN

        System.out.println(sayilar[4]);






    }
}
