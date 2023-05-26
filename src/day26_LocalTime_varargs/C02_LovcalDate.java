package day26_LocalTime_varargs;

import java.time.LocalDate;

public class C02_LovcalDate {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih); // BUGUNUN TARIHINI VERIR  2023-03-09

        System.out.println(tarih.isLeapYear()); //ARTIK YIL OLUP OLMADIGINI KONTROL EDER. 2023 ICIN FALSE YAZDIRDI




    }
}
