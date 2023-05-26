package day26_LocalTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {


        // verilen 2 sayiyi toplayipyazdiran bir method olusturun
        topla(3, 5);
        topla(3, 5,7);
    }

    public static void topla(int a, int b) {
        System.out.println(a + b); // 8

    }

    public static void topla(int a, int b, int c) {
        System.out.println(a + b + c); //15
    }
}