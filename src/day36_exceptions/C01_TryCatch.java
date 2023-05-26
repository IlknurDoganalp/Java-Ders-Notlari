package day36_exceptions;

public class C01_TryCatch {

    /*
    Kodlarimizi yazarken sorun olusma ihtimali gordugumuzde, sorun cikma potansiyeli olan kodlari
    Try-Catch ve (Finally) bloklari ile cevreleriz



     */

    public static <String> void main(String[] args) {

        try {
            int sayi1=20;
            int sayi2=0;
           // System.out.println(sayi1/sayi2); //ArithmeticException
        } catch ( ArithmeticException e) {
            // e.printStackTrace(); exception'da gordugumuz tum hata aciklamalarini yazdirir
            // System.out.println("Bolen sayi 0 olamaz");

            // System.out.println(e.getMessage()); / by zero hatanin kaynagini gosterdi
            // System.out.println(e.getCause());

        }

        /*

        Bir Try-Catch Blogu 3 bolumden olusur;

        1- try blogu: exception olusturma potansiyeli olan kodlar

        2- Catch Statement:
        ArithmeticException: olusma ihtimali olan exception
        e: karsilastigi exception'i kaydedecegimiz obje

        3- Catch Blogu:
        ongorulen exception gerceklestiginde calismasini istedigimiz kodlar

         */

}
}