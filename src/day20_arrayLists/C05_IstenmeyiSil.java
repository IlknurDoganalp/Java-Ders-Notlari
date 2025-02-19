package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyiSil {
    public static void main(String[] args) {

        // VERILEN STRING BIR LISTEDE ISTENMEYEN HARF ICEREN ELEMENTLERI SILIP,
        // KALAN KISMINI LIST OLARAK BIZE DONDUREN BIR METHOD OLUSTURUN


        List<String> liste = C04_KullaniciyaListeOlusturtmak.kullaniciyaListOlusturtma();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanilmasini istemediginiz bir harf girin");
        String istenmeyenHarf = scan.next().substring(0,1);


        List<String> ayiklanmisList =istenmeyenHarfIcerenleriSil(liste,istenmeyenHarf);

        System.out.println(ayiklanmisList);
    }

    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {

        // mesela listemiz ali, veli, ayse, fatma ve istenmeyen harf a
        // for loop ile elementleri ele alirken remove yaparsak
        // list'in uzunlugu degisecegi icin sorun yasariz
        // farkli bir list olusturup, silinmeyecekleri yeni listeye kaydedelim

        List<String> kalanlarListesi = new ArrayList<>();

        for (int i = 0; i < liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarListesi.add(liste.get(i));
            }
        }

        return kalanlarListesi;

    }
}
