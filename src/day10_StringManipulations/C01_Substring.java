package day10_StringManipulations;

public class C01_Substring {
    public static void main(String[] args) {
        String str= "Java ne kadar guzel";
        System.out.println(str.substring(8)); // kadar guzel
        System.out.println(str.substring(0)); // Java ne kadar guzel
        System.out.println(str.substring(str.length()-3)); // zel

        System.out.println(str.substring(0 , 1)); // J
        System.out.println(str.substring(5 , 7)); // ne

         // 5. index'tedki karakteri yazdiriniz

        System.out.println(str.substring(5,6)); // n
        System.out.println(str.substring(2,2)); // hiclik
        System.out.println(str.substring(5,1));





    }
}
