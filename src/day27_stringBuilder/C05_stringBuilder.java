package day27_stringBuilder;

public class C05_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");

        System.out.println(sb1.delete(4,5)); // baslangic ve son parametre girilince aradakileri siler. //JavaCandir

        System.out.println(sb1.deleteCharAt(9)); //JavaCandi
        System.out.println(sb1); // JavaCandi



    }
}
