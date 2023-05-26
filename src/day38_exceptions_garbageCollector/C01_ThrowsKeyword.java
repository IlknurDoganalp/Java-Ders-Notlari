package day38_exceptions_garbageCollector;

public class C01_ThrowsKeyword {
    public static void main(String[] args) {


        try {
            int sayi=10;
            if (sayi<10){
                throw new IllegalArgumentException("Sayi negatif olmamali");
            }
            System.out.println(" Sartli calisacak satir 1");
            System.out.println(" Sartli calisacak satir 2");
            System.out.println(" Sartli calisacak satir 3");



        } catch (IllegalArgumentException e) {

        }

        System.out.println(" Yola devam ");
    }
}
