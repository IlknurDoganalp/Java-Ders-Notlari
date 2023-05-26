package day35_interfaces;

public interface I01_Interface {

    static int sayi=10;
    final String str="Java Candir";
    public static final boolean b=true;


    // 1- Interface'de tum variablelar (yazilmasa bile) public,static ve finaldir.
    // Final oldugu icin sonradan degistirme imkani yoktur. olusturulurken deger atanmalidir.
    // Bu ozellikler standart olarak tum variablelara tanimlandigindan
    // bu tanimlamalari yapmakgerekli degildir.(inteliijey gri yapti)



    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoriyel();

    // 2- Tum methodlarda yazilmasa bile standart olarak public ve abstractir.


}
