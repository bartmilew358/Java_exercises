package pl.sda.introtasks;/*
Zobacz w jaki sposób można pobrać dane od użytkownika (z konsoli) analizując klasę: pl.sda.statements.ScannerApp.
Spróbuj dodać wczytywanie liczb z konsoli do każdego z zadań powyżej.

 */

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String firstName = scan.nextLine();

        System.out.println("Witaj " + firstName);

    }

}
