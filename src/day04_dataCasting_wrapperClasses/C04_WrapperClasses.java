package day04_dataCasting_wrapperClasses;

public class C04_WrapperClasses {

    public static void main(String[] args) {

        Integer sayi= 10;

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        String sonucStr= "345";

        System.out.println(sonucStr + 10); //34510

        int sonuc = Integer.valueOf(sonucStr);
        System.out.println(sonuc+10); //355

        char krk= '3';

        System.out.println(Character.isDigit(krk)); // true
        System.out.println(Character.isLetter(krk)); // false




    }
}
