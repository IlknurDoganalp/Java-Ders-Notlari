package day16_Scope_Arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {

    public static void main(String[] args) {

        int [] arr = {3,5,6,7,8,2};

        // tum arry'i yazdirin dersek
        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 7, 8, 2]

        // tum arrray elementlerini yan yana aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " "); // 3 5 6 7 8 2

        }

    }
}
