package day43_maps_entrySet;

import day39_Maps.MapMethodDepo;

public class C02_EntrySet {
    public static <Map> void main(String[] args) {



        // verilen okulMap'indeki soyisimleri buyuk harfe cevirin.

        java.util.Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap = MapMethodDepo.soyisimleriBuyukYap(okulMap);
        System.out.println(okulMap);

    }
}
