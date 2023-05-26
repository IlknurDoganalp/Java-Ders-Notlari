package day10_StringManipulations;

public class C03_Startswith_endswith {
    public static void main(String[] args) {
        String str="Java harika";

        System.out.println(str.startsWith("java")); // false

        System.out.println(str.startsWith("Ja")); // true

        System.out.println(str.startsWith(str)); // true

        System.out.println(str.endsWith("a")); // true
        System.out.println(str.endsWith("harika")); // true

        System.out.println(str.endsWith("")); // true

        System.out.println(str.endsWith(str.substring(str.length()-1)));  // oncelik en icteki parantezde olacak.(tekrar et!)





    }
}
