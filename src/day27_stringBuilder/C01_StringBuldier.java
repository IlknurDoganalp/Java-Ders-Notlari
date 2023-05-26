package day27_stringBuilder;

public class C01_StringBuldier {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();

        System.out.println(sb1.capacity()); //16
        System.out.println(sb1.length()); //0

        sb1.append("Mustafa");

        System.out.println(sb1.capacity()); //16
        System.out.println(sb1.length()); //7

        sb1.append("Yilmazturk");
        System.out.println(sb1); // Mustafa Yilmazturk 18 karakter
        System.out.println(sb1.capacity()); //34  2 * eski kapasite + 2
        System.out.println(sb1.length()); //18

        sb1.append(" javayi cok sever, sabah aksam java calisir. ");
        System.out.println(sb1.capacity()); // 70
        System.out.println(sb1.length());// 62


        // 2. YONTEM

        StringBuilder sb2=new StringBuilder("Java Candir");
        System.out.println(sb1.capacity()); // 27
        System.out.println(sb1.length());// 11

        // 3. YONTEM

        StringBuilder sb3=new StringBuilder(11);
        sb3.append("26276473642");
        System.out.println(sb1.capacity()); // 11
        System.out.println(sb1.length());// 11

        sb3.append(" : Tc No");




    }
}
