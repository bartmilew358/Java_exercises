package pl.sda.Arrays;

/*
* Napisz metodę, która jako parametr przyjmuje parametr int count i w wyniku zwraca tablicę wypełnioną liczbami parzystymi
* zaczynając od 2, tablica ma zawierać ilość liczb wskazanych przez parametr count.
* */

public class Task3 {

    public static void main(String[] args) {

        System.out.println(oddArray(8));
        showArray(oddArray(8));
    }

    private static int[] oddArray(int n) {

        int[] temp = new int[n];


        for (int i = 0; i < temp.length; i++) {
            temp[i] = 2 * (i + 1);
        }
        return temp;

    }

    private static void showArray(int[] str) {

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
    }
}
