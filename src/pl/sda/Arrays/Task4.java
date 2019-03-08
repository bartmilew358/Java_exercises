package pl.sda.Arrays;
/*
* Napisz metodę, która jako parametr przyjmuje zmienną typu double[] i wyświetla na konsoli: pierwszy,
* środkowy (jeden lub dwa środkowe) i ostatni element tablicy, a także średnią arytmetyczną wszystkich liczb z tabeli.
* */

public class Task4 {

    public static void main(String[] args) {

        float[] tab1 = {1,2,3,5,8,13};
        doubleArray(tab1);
    }

    private static void doubleArray(float... str) {

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]*2);
        }
    }
}
