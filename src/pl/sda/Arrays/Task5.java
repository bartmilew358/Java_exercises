package pl.sda.Arrays;

/*
* Napisz metodę, która jako parametr przyjmuje zmienną typu double[] i wyświetla na konsoli: pierwszy,
* środkowy (jeden lub dwa środkowe) i ostatni element tablicy, a także średnią arytmetyczną wszystkich liczb z tabeli.
*/


public class Task5 {

    public static void main(String[] args) {

        double[] tab1 = {1,1,2,3,5,8,13,21};
        showFirstMiddleLastElementAndAvgOfArray(tab1);
    }

    private static void showFirstMiddleLastElementAndAvgOfArray(double... str) {

        int var = str.length;
        System.out.println("Pierwszy element tablicy: " + str[0]);
        System.out.println("Ostatni element tablicy: " + str[var-1]);

        if (str.length%2 == 0){
            System.out.println("Tablica ma parzystą ilość elementów.");
            System.out.println("Środkowe wyrazy tablicy to: " + str[var/2-1] + " i " + str [var/2]);
        }
        else {
            System.out.println("Środkowy wyraz tablicy to: " + str[var/2]);
        }

        double sum = 0;

        for (int i = 0; i < var; i++){

            sum += str[i];
        }

        System.out.println("Średnia arytmetyczna elementów tablicy wynosi: " + sum/var);
        }
}

