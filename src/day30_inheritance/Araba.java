package day30_inheritance;

public class Araba {

    // - Marka gozetmeksizin tum arabalarin sahip olacagi
    // ozellikleri bu class'a koyariz.

    String marka="Tum arabalarin markasi olur";
    String model="Tum arabalarin bir modeli olur";
    String vites="Tum arabalarin vitesi olur";
    String yakit="Tum arabalar yakitla calisir";

    public void uretimYeri(){
        System.out.println("Tum arabalar fabrikada uretilir");
    }

    public void motor(){
        System.out.println("Tum arabalarin motoru olur");

    }

}
