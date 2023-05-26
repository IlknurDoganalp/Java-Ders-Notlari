package day13_MethodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {

        // Verilen bir Stringi tersine cevirip+
        // bize donduren bir method olusturun

        stringTersineCevir("Java Candir");
    }
    public static String stringTersineCevir(String metin){ //Java


String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        return tersMetin;

    }


}
