package pl.sda.Arrays_old;

import java.util.Random;

public class RandomTable {

    public static void main(String[] args) {

//        bubbleSort(tableOfRandomValue(100,1,1000));
//        bubbleSort(tableOfRandomValue(1000,1,1000));
        bubbleSort(tableOfRandomValue(100000,1,1000));
//        bubbleSort(tableOfRandomValue(1000, 1, 1000));

    }

    private static int[] tableOfRandomValue(int lenghtOfTable, int a, int b) {

        long start = System.currentTimeMillis();

        int[] tableOfRandomInt = new int[lenghtOfTable];
        Random randomValueOfTable = new Random();

        for (int i = 0; i < lenghtOfTable; i++) {

            tableOfRandomInt[i] = randomValueOfTable.nextInt(b - a + 1) + a;
        }

        System.out.println("Wygenerowana tablica: ");
        for (int i = 0; i < tableOfRandomInt.length; i++) System.out.print(tableOfRandomInt[i] + " ");

        long stop = System.currentTimeMillis();

        System.out.println();
        System.out.println("Czas generowania i drukowania tablicy o rozmiarze " + lenghtOfTable + " = " + (stop - start) + "ms");
        return tableOfRandomInt;
    }

    private static void bubbleSort(int[] tab) {

        long start = System.currentTimeMillis();

        int i, j, temp;
        System.out.println();


        int temp2 = tab.length - 1;


        while (temp2 != 0) {
            for (i = 0; i < tab.length - 1; i++) {
                for (j = 0; j < tab.length - 1; j++) {
                    if (tab[j] > tab[j + 1]) {
                        temp = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = temp;
                    }

                    if (i == (tab.length - 2)) {
                        temp2--;
                    }
                }
            }
            System.out.println();
            System.out.println("Posortowana tablica: ");
            for (i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");

            long stop = System.currentTimeMillis();

            System.out.println();
            System.out.println("Czas sortowania tablicy o rozmiarze " + tab.length + " = " + (stop - start) + "ms");

        }
    }
}