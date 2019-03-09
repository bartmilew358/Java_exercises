package pl.sda.dataTimeTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calendar {

    public static void main(String[] args) {

        // Task 4

        LocalDate MyBirthday = LocalDate.of(1987, 5, 11);
        System.out.println("My Birthday: " + MyBirthday);

        String MyBirthdayAsString = MyBirthday.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println("My Birthday: " + MyBirthdayAsString);

        System.out.println("My Birthday: " + MyBirthday.getDayOfMonth() + " " + MyBirthday.getMonth() + " " +  MyBirthday.getYear());





    }
}
