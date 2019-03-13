package pl.sda.dataTimeTasks;

// Napisz metodę, która pobierze tablicę dat (LocalDate) i zwróci najnowszą datę.

import java.time.LocalDate;

public class Task8 {


    public static void main(String[] args) {

        LatestDate();

    }

    public static int LatestDate () {

        int LocalDateArr [] = new int[365];

        LocalDate localDate = LocalDate.now();

        for (int i = 0; i < LocalDateArr.length ; i++) {
        //LocalDateArr[i] = LocalDate.now();

        }

        return LocalDateArr[0];
    }
}
