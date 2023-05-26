package day16_Scope_Arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoctor dok1= new ADoctor();
        System.out.println(dok1.askerlikYaptiMi);

        dok1.isim="Kemal";
        dok1.soyisim="Yilmaz";
        dok1.dogumYili=1980;

        System.out.println(dok1.isim); // Kemal


        ADoctor dok2= new ADoctor();
        System.out.println(dok2.isim); // null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim); // Celik

        System.out.println(dok1.fakulte); // Tip
        System.out.println(dok2.fakulte); // Tip

        dok1.isim="Burcu";
        System.out.println(dok1.isim); // null




    }
}
