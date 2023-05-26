package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        /*

        -Checked Exceptions kod yazilir yazilmaz, daha run etmeden javanin riskli
        kodlari tanimlayip calistirmadan once bana bir yol gostermelisin dedigi
        exception turleridir.

        -Checked Exceptions genelde dosya okuma ve yazma IO (Input,Output) islemlerinde olusur

        -IO exception olusma olasiligina karsi kodu yazar yazmaz
        java altini kirmizi cizer

        -Checked Exception kodun altini kirmizi cizdiginden
        kodumuzun calisir hale gelmesi icin kirmizi cizgiyi kaldirmamiz lazim
         Bunu icin 2 yol vardir;
         1- Try-Ctch Blogu kullanilarak exception handle edilebilir
         ve javaya exception olustugunda ne yapmasini

         */

        String dosyaYolu="src/day36_exceptions/text.txt";

        FileInputStream fis=new FileInputStream(dosyaYolu);


    }
}
