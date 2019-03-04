package pl.sda.strings;

 /* Napisz klasę, która wykorzysta większość z metod dostępnych w klasie String */

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Stringtask {

    public static void main(String[] args) {


        String s1 = "Ala ma kota";
        String s2 = "ALA MA KOTA";

        System.out.println("Zadany tekst to: " + s1);
        System.out.println("Długość napisu = " + s1.length() + "znaków.");
        System.out.println("Zmiana małe litery na duże: " + s1.toUpperCase());
        System.out.println("Czy zdania są równe pomimo różnej wielkości znaków: " + s1.equalsIgnoreCase(s2));

        System.out.println(turnText("Okoń"));

        String s3 = "                 HALO HALO JANUSZ";

        System.out.println(s3);
        System.out.println(deleteWhCharsAndToLower(s3));
        System.out.println(ifTheSameFirstChar("Okoń", "okonek"));
        System.out.println(ifTheSameFirstChar("Okoń", "Okonek"));
        System.out.println(ifTheSameThreeLastChar("ABCDEF", "ABCDEF"));
        System.out.println(ifTheSameThreeLastChar("ABCDEF", "ABCDEY"));
        System.out.println(ifStringHaveThreeTimesNIE("nie"));
        System.out.println(ifStringHaveThreeTimesNIE("niepiesniekonniepieczarka"));
    }



    // Napisz metodę, która zwróci tekst: “Simon says: [{text}]”, gdzie {text} - to argument metody. Użyj konkatenacji lub StringBuildera.

    public static String turnText (String text) {

        return new StringBuilder().append("Simon says: ").append(text).toString();

    }

    //Napisz metodę, która jako argument otrzyma jedną zmienną typu String, usunie z niej białe znaki z początku
    //i końca tekstu oraz zamieni wszystkie litery na małe.

    public static String deleteWhCharsAndToLower (String text) {

        return text.trim().toLowerCase();

    }


    //Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String i zwróci true
    //jeżeli oba teksty zaczynają się od tego samego znaku.

    public static boolean ifTheSameFirstChar (String text1, String text2) {

        return (text1.charAt(0) == text2.charAt(0));

    }

    //Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String i zwróci true
    //jeżeli 3 ostatnie znaki w obu tekstach są takie same.

    public static boolean ifTheSameThreeLastChar (String text1, String text2) {

        return (text1.substring((text1.length()-3), text1.length()).equals((text2.substring((text2.length()-3), text2.length()))));

    }

    //*Napisz metodę sprawdzającą, czy dany łańcuch zawiera co najmniej trzy razy słowo “nie”.

    public static boolean ifStringHaveThreeTimesNIE (String s) {

        if (s.indexOf("nie") >= 0) {

            int var;
            var = s.indexOf ("nie");

            if (s.indexOf("nie", var+1) >= 0) {

                var = s.indexOf("nie", var+1);

                if (s.indexOf("nie", var+1) >= 0) {

                    return true;
                }
            }
        }
        return false;
    }
}
