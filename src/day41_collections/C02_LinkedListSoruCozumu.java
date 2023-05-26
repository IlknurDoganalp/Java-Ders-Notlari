package day41_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoruCozumu {
    public static void main(String[] args) {

        // Kullanicidan deger alarak iki String Liste olusturun.
        // Kullanici deger girmeyi birakmak icin  0' a basmalidir.
        //Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin

        // Liste1 : .....
        // Liste2 : .....
        // Ortak elementler : .....


        System.out.println("Once List1'i olusturunuz");
        List<String> list1=kullanicanDegerAlarakListOlusturma();

        System.out.println("Simdi List2'yi olusturunuz");
        List<String>list2=kullanicanDegerAlarakListOlusturma();

        System.out.println("Liste1 : "+list1 );
        System.out.println("Liste2 : "+list2);

        list1.retainAll(list2); // ortak elemanlari yazdirmak icin

        System.out.println("Ortak Elemanlar :"+ list1);



    }

    public static List<String> kullanicanDegerAlarakListOlusturma(){

        // Kullanicidan deger alarak String bir liste olusturup main methoda dondurecek
        //Kullanici  deger girmeyi birakmak icin 0'a basmalidir.

        List<String>isimListesi=new LinkedList<>();

        Scanner scan=new Scanner(System.in);
        String isim="";

        while (!isim.equalsIgnoreCase("0")){

            System.out.println("Lutfen listeye eklemek icin isim giriniz \nBitirmek icin 0'a basiniz");

            isim=scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }


        }
        return isimListesi;


    }
}
