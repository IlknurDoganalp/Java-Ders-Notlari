package day09_Switch;

import java.util.Locale;

public class C03_StringManipulations {
    public static void main(String[] args) {

        String str= "Java Candir";
        System.out.println(str.toUpperCase());// JAVA CANDIR


        System.out.println(str.toLowerCase()); //java candir

        str =str.toUpperCase();
        System.out.println(str.toLowerCase());



        str =str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str);

    }
}
