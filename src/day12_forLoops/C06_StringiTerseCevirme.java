package day12_forLoops;

public class C06_StringiTerseCevirme {
    public static void main(String[] args) {


         // kullanicidan bir String isteyin ve
        //Stringi tersine cevirip kaydedin.

        String input="Java Candir";

        //output = ridnaC avaJ

        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {

            output +=input.charAt(i);


        }

        System.out.println(output);


    }
}
