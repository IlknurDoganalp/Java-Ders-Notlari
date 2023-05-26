package day12_forLoops;

public class C09_NestedForLoop {
    public static void main(String[] args) {

        int satir=4;

        for (int i = 1; i <=satir ; i++) { // satirlar

            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
                
            }

            System.out.println("");
        }



    }
}
