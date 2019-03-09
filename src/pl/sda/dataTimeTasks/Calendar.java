package pl.sda.dataTimeTasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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

//        System.out.println("Od mojego urodzenia minęło: " + (localTime.getYear() - MyBirthday.getYear()) +
//                " lat " + (MyBirthday.getMonthValue() + localTime.getMonthValue()) + " miesięcy " +
//                        (MyBirthday.getDayOfMonth() - localTime.getDayOfMonth()) + " dni " +
//                        (localTime.getHour() - MyBirthdayExtend.getHour()) + " godzin " +
//                        (localTime.getMinute() - MyBirthdayExtend.getMinute()) + " minut.");

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = LocalDate.now();
        LocalDate initialDate  = LocalDate.parse("1987-05-11");
//        LocalDate finalDate = LocalDate.parse("2018-10-01");
        Period between = Period.between(MyBirthday, localDate);

        // To niżej nie działa. Muszę to rozkminić.
//        Period between2 = Period.between(MyBirthdayExtend, localDateTime);
        System.out.println("Period: " + between);

        System.out.println("Od Twojego urodzenia minęło: " + between.getYears() + " lat " + between.getMonths() + " miesięcy " + between.getDays() + " dni. ");

        // Task 7 - Napisz program, który wyświetli dni tygodnia, w których obchodzić będziesz urodziny przez kolejne 10 lat.

        // TODO: 2019-03-09  

    }
}
