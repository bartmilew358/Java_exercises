package pl.sda.Arrays_old;

/*
* Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
* */

public class Task2 {

    public static void main(String[] args) {

        int[] tab1 = {1,2,3,5,8,13};

        System.out.println("Suma elementów tablicy = " + addArray(tab1));
        System.out.println("Ilość elementów tablicy = " + tab1.length);
        printArray(tab1);

    }

    private static void printArray(int... str) {

        for (int i=0; i < str.length; i++){
            System.out.println("Element na pozycji "+ i +" = " + str[i]);
        }
    }

    private static int addArray(int... str) {

        int sum = 0;
        for (int i = 0; i < str.length; i++) {
           sum = sum + str[i];
        }
        return sum;
    }
}
