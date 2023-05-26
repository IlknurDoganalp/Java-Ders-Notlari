package day31_Inheritance;

public class CToyota extends BAraba{

    String str="Toyota";

    protected CToyota(){
        System.out.println("Parametresiz Toyota constructor calisti");
    }

    protected CToyota(int sayi){
        System.out.println("Int Parametreli Toyota constructor calisti");
    }

    protected CToyota(String str){
        System.out.println("String Parametreli Toyota constructor calisti");
    }

}
