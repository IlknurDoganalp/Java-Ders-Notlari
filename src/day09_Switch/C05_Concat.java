package day09_Switch;

public class C05_Concat {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Candir";
        String str3= "  ";

        System.out.println(str1  + str3  +str2); //Java Candir

        System.out.println(str1.concat(str3).concat(str2)); //Java Candir




    }
}
