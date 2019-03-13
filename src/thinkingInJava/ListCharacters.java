// Program w którym bawiłem się w tworzenie małego menu.

package thinkingInJava;

import java.util.Scanner;

public class ListCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Witaj!");
        System.out.println();
        System.out.println("Wybierz co chcesz zrobić:");

        System.out.println("1 - drukuje alfabet małych liter.");
        System.out.println("2 - drukuje alfabet dużych liter.");

        System.out.println("3 - Wyjście z programu.");

        while (true) {
            int a = scan.nextInt();

        switch (a) {
            case 1:
                smallCharacters();
            case 2:
                largeCharacters();
            }
            if (a == 3) {break;}
        }
    }


    public static void smallCharacters () {

        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c))
                System.out.println("Wartość: " + (int) c + " znak: " + c); //
        }
    }

    public static void largeCharacters () {

        for (char c = 0; c < 128; c++) {
            if (Character.isUpperCase(c))
                System.out.println("Wartość: " + (int) c + " znak: " + c); //
        }
    }
}
