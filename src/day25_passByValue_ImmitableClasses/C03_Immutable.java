package day25_passByValue_ImmitableClasses;

public class C03_Immutable {
    public static void main(String[] args) {

    /*
        JAVA DA BIR CLASS VE CLASSDAN OLUSTURULAN OBJELERYA MUTABLE
        YA DA IMMUTABLE'DIR.

        JAVA METINSEL IFADELERI ATAYABILECEGIMIZ 3 CLASS OLUSTURMUSTUR.

        1- STRING----- IMMUTABLE
        2- STRINGBUILDER----MUTABLE
        3- STRINGBUFFER-----MUTABLE


        * IMMUTABLE BIR CLASSDAN OLUSTURULAN OBJELER DE IMMUTABLE'DIR.
        STRING IMMUTABLE OLDUGUNDAN AYNI STR OBJESINE YENI DEGER ATANDIGINDA
        JAVA ESKI DEGERI DEGISTIRMEZ
        BUNU YERINE ISTENEN YENI DEGERE SAHIP YENI BIR OBJE OLUSTURUR
        VE STR'IN POINTER'INI YENI OBJEYE YONLENDIRIRLER

        * KULLANILMAYAN ESKI OBJELER GARBAGECOLLECTOR TARAFINDAN TOPLANMAK UZERE

    */
        String str="Java candir";

        str=str.toLowerCase();

        System.out.println(str); //java candir
        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR
    }
}
