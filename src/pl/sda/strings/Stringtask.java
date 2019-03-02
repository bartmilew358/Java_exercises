package pl.sda.strings;


import java.sql.SQLOutput;

public class Stringtask {

    public static void main(String[] args) {


        String s1 = "Ala ma kota";

        System.out.println(s1);
        System.out.println("Długość napisu: " + s1.length());
        System.out.println("Zmiana na duże litery: " + s1.toUpperCase());
        System.out.println(s1.lastIndexOf("T"));

        System.out.println(turnText("Okoń"));
        System.out.println("                 HALO HALO JANUSZ");
        System.out.println(deleteWhCharsAndToLower("          HALO HALO JANUSZ "));
        System.out.println(ifTheSameFirstChar("Okoń", "okonek"));
        System.out.println(ifTheSameFirstChar("Okoń", "Okonek"));
        System.out.println(ifTheSameThreeLastChar("ABCDEF", "ABCDEF"));
        System.out.println(ifTheSameThreeLastChar("ABCDEF", "ABCDEY"));

    }

    public static String turnText (String text) {

        return new StringBuilder().append("Simon says: ").append(text).toString();

    }

    public static String deleteWhCharsAndToLower (String text) {

        return text.trim().toLowerCase();

    }

    public static boolean ifTheSameFirstChar (String text1, String text2) {

        return (text1.charAt(0) == text2.charAt(0));

    }

    public static boolean ifTheSameThreeLastChar (String text1, String text2) {

        return (text1.substring((text1.length()-3), text1.length()).equals((text2.substring((text2.length()-3), text2.length()))));

    }
}
