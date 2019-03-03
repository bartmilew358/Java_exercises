package pl.sda.Arrays;

/*
* Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
* */

public class Task2 {

    public static void main(String[] args) {

        int[] tab1 = {1,2,3,5,8,13};

        System.out.println(addArray(tab1));

    }

    private static int addArray(int[] str) {

        int sum = 0;

        for (int i = 0; i < str.length; i++) {


           sum = (str[i]) + str[i];
        }
        return sum;
    }
}
