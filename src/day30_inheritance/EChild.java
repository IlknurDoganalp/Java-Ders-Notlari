package day30_inheritance;

public class EChild extends DParentAccessModifier{

    static int sayiChildStatic;

    public static void main(String[] args) {

        // INHERITANCE'DA PRIVATE CLASS UYELERI INHERIT EDILEMEZ.
       //



        EChild eChild=new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);

        System.out.println(eChild.sayiChildStatic);
        /*
          // ancak parent class'daki static variable'lar
        // obje uzerinden KULLANILAMAZ
        // System.out.println(eChild.sayiStaticPrivate);
         */


        System.out.println(DParentAccessModifier.sayiStaticProtected);
        /*

       BU KULLANIM ICIN INHERITANCE'A IHTIYAC YOK
        HERHANGI BIR CLASS'DAKI STATIC VARIABLE'I
        CLASSISMI.STATICVARIABLEISMI SEKLINDE KULLANABILIRIZ.

         */


    }
}
