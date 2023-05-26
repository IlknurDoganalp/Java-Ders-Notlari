package day31_Inheritance;

public class DCorolla extends CToyota {

    String str3="Corolla";

  DCorolla(){
        System.out.println("Parametresiz corolla calisti");
    }

    DCorolla(int sayi){
        System.out.println("int Parametreli corolla calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1=new DCorolla(5);
    }
}
