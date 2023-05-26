package day12_forLoops;

public class C10_NestedForLoop {
    public static void main(String[] args) {


        /*

        Verilen satir sayisina gore
        asagidaki sekli olusturan kod yaziniz

        *
        * *
        * * *
        * * * *
         */


        int satir=6;

        for (int i = 1; i <=satir ; i++) { // Satirlar Outer Loop / Dis dongu

            for (int j = 1; j <=i ; j++) {  // Sutunlar Inner Loop / Ic dongu

                System.out.print("* ");
                
            }

            System.out.println("");
            
        }
        
        
        
        
    }
}
