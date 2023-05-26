package day09_Switch;

public class C04_equals {
    public static void main(String[] args) {

        String str1= "java";
        String str2= "Java;";
        String str3= "JAVA";
        String str4= "JaVa";

        System.out.println(str1.equals(str2));//false verir.
        System.out.println(str3.equals(str4));// false verdi.


        //Eger buyuk veya kucuk harf farketmeksizin Stringleri karsilastirmak istersek
        //equalsIOgnorecase kullanilir.

        System.out.println(str1.equalsIgnoreCase(str3)); // true verdi
        System.out.println(str3.equalsIgnoreCase(str4)); // true verdi





    }
}
