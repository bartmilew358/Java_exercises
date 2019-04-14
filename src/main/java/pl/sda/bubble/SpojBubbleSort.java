package pl.sda.bubble;

//FR_01_09 - Sortowanie babelkowe - SPOJ

/* Wejście
        W pierwszym wierszu jedna niewielka liczba t określająca liczbę zestawów danych.

        Każdy zestaw danych składa się z liczby n (1 ≤ n ≤ 106) określającej ilość liczb w ciągu do posortowania. Następnie n liczb całkowitych należących do przedziału [0..106].

        Wyjście
        Dla każdego zestawu jedna liczba określająca ilość zamian sąsiadujących liczb wykonanych przez algorytm sortowania bąbelkowego */

import java.util.Arrays;
import java.util.Scanner;

public class SpojBubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthOfTable = scanner.nextInt();
        bubbleSort(tableOfRandomValue(lengthOfTable));
    }

    private static int[] tableOfRandomValue(int lengthOfTable) {

        int[] tableOfRandomInt = new int[lengthOfTable];
        for (int i = 0; i < lengthOfTable; i++ ) {
            Scanner scan2 = new Scanner(System.in);
            Integer n = scan2.nextInt();
            tableOfRandomInt[i] = n;
        }
        return tableOfRandomInt;
    }

    private static void bubbleSort(int[] tab) {

        int i, j, temp;
        System.out.println();

        int temp2 = tab.length - 1;
        int count = 0;

        while (temp2 != 0) {
            for (i = 0; i < tab.length - 1; i++) {
                for (j = 0; j < tab.length - 1; j++) {
                    if (tab[j] > tab[j + 1]) {
                        temp = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = temp;
                        count++;
                    }
                    if (i == (tab.length - 2)) {
                        temp2--;
                    }
                }
            }
            System.out.println(count);
            System.out.println(Arrays.toString(tab));
            }
    }
}
