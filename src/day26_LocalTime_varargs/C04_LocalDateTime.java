package day26_LocalTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); // 2023-03-09T21:52:56.942513

        System.out.println(ldt.toLocalDate()); // sadece tarihi yazdirdi 2023-03-09


    }
}
