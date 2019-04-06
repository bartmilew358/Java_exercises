package pl.sda.loops;
import java.util.Scanner;

/*
* Utwórz program który będzie pobierał od użytkownika liczby typu float aż do momentu osiągnięcia
* limitu podanego jako parametr metody. Na koniec wypisz ile było tych liczb,
* jaka była ich suma (z częścią ułamkową) i jaka jest ich średnia arytmetyczna.
* */

public class Task8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ile liczb chcesz sumować?");
        int howMuch = scan.nextInt();
        System.out.println();

        double var = addNumberFromUser(howMuch);

        System.out.println("Suma podanych liczb = " + var);
        System.out.println("Średnia podanych liczb = " + var / howMuch);
    }

    public static double addNumberFromUser(int howMuchNumbers) {

        double sum = 0;
        for (int i = 1; i <= howMuchNumbers; i++) {
            System.out.println("Podaj liczbę nr " + i);

            Scanner scan = new Scanner(System.in);
            double var = scan.nextInt();
            sum += var;
        }
        return sum;
    }
}
