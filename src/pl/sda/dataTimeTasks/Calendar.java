package pl.sda.dataTimeTasks;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Calendar {

    public static void main(String[] args) {

        // Task 4 Wyświetl godzine i date urodzin

        LocalDate MyBirthday = LocalDate.of(1987, 5, 11);
        System.out.println("My Birthday: " + MyBirthday);

        LocalDateTime MyBirthdayExtend = LocalDateTime.of(1987, 5, 11, 16, 14);
        System.out.println("My Birthday: " + MyBirthdayExtend);

        System.out.println("My Birthday: " + MyBirthdayExtend.getDayOfMonth() + " " + MyBirthdayExtend.getMonth() + " " + MyBirthdayExtend.getYear() +
                " " + MyBirthdayExtend.getHour() + ":" + MyBirthdayExtend.getMinute());

        String MyBirthdayAsString = MyBirthday.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println("My Birthday: " + MyBirthdayAsString);

        System.out.println("My Birthday: " + MyBirthday.getDayOfMonth() + " " + MyBirthday.getMonth() + " " +  MyBirthday.getYear());

        // Task 5 Wświetl datę urodzin uwzględniając strefę czasową

        ZonedDateTime MyBirthday3 = ZonedDateTime.now();
        System.out.println("My Birthday: " + MyBirthday.getDayOfMonth() + " " + MyBirthday.getMonth() + " " +  MyBirthday.getYear() + " " + MyBirthday3.getZone());

         // Task 6 - Dla swojej daty urodzenia wyświetl ilość lat, miesięcy, dni i godzin, które miały miejsce do obecnego momentu.
         // Następnie wypisz ile minut (całkowicie) i sekund (całkowicie) minęło od daty urodzenia.

        LocalDateTime localTime = LocalDateTime.now();
         System.out.println("LocalTime: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = LocalDate.now();
        LocalDate initialDate  = LocalDate.parse("1987-05-11");

        Period between = Period.between(MyBirthday, localDate);

        LocalTime birthdayTime = LocalTime.of(16, 14, 30);

        Duration between2 = Duration.between(birthdayTime, LocalTime.now());
        long durationMinutes = between2.toMinutes();
        long durationMinutes2 = ChronoUnit.MINUTES.between(birthdayTime, localTime);
        long durationSeconds = between2.getSeconds();
        long durationSeconds2 = ChronoUnit.MINUTES.between(birthdayTime, localTime);

        System.out.println("Period: " + between);
        System.out.println("Period: " + between2);
        System.out.println("Od Twojego urodzenia minęło: " + between.getYears() + " lat " + between.getMonths() + " miesięcy " + between.getDays() + " dni. ");

        System.out.println(durationMinutes);
        System.out.println(durationMinutes2);

        System.out.println(durationSeconds);
        System.out.println(durationSeconds2);



         // Task 7 - Napisz program, który wyświetli dni tygodnia, w których obchodzić będziesz urodziny przez kolejne 10 lat.

        for (int i = 2019; i <2030; i++) {
            LocalDate MyBirthday2 = LocalDate.of(i, 5, 11);
            System.out.println("W roku " + i + " urodziny przypadają w " + MyBirthday2.getDayOfWeek());
        }

         Instant test

        Instant instant = Instant.now();
        System.out.println("Instant = " + instant);

        // Task 8 - Napisz metodę, która pobierze tablicę dat (LocalDate) i zwróci najnowszą datę.




    }
}