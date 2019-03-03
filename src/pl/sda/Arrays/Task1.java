package pl.sda.Arrays;

/*
*Napisz metodę, która jako parametr przyjmuje zmienną typu String[] i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
*/

public class Task1 {

    public static void main(String[] args) {

        String[] tab1 = {"Janusz","Łukasz","Eltn","John"};

        showArray(tab1);

    }

    private static void showArray(String... str) {

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}




