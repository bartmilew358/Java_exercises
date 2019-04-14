package pl.sda.bubble;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

//        sort(tableOfRandomValue(10, 1,1000));
//        sort(tableOfRandomValue(100, 1,1000));
//        sort(tableOfRandomValue(1000, 1,1000));
//        sort(tableOfRandomValue(10000, 1,1000));
//        sort(tableOfRandomValue(100000, 1,1000));
//        sort(tableOfRandomValue(1000000, 1,1000));



        // to nie działa - trzeba przerobić
        // TODO

        quickSort(tableOfRandomValue(10, 1, 1000), 1, 1000);

    }

    public static int[] tableOfRandomValue(int lenghtOfTable, int a, int b) {

        int[] tableOfRandomInt = new int[lenghtOfTable];
        Random randomValueOfTable = new Random();

        for (int i = 0; i < lenghtOfTable; i++) {

            tableOfRandomInt[i] = randomValueOfTable.nextInt(b - a + 1) + a;
        }

//        System.out.println("Losowa tablica:");
//        System.out.println(Arrays.toString(tableOfRandomInt));

        System.out.println();
        return tableOfRandomInt;
    }


    public static int[] sort (int[] tab){

        long start = System.currentTimeMillis();

        int i, j;
        int key;

        for (i = 1; i < tab.length; i++) {

            j = i;
            key = tab[i];

            while ((j>0) && tab[j-1] > key){
                tab[j] = tab[j-1];
                j--;
            }
            tab[j] = key;
        }

        long stop = System.currentTimeMillis();

//        System.out.println("Posortowana tablica:");
//        System.out.println(Arrays.toString(tab));
//        System.out.println();

        System.out.println("Czas wykonania sortowania dla tablicy o długości [" + tab.length + "] = " + (stop - start));
        return tab;
    }

    private static void quickSort(int tab[], int left, int right)
    {
        long start = System.currentTimeMillis();

        int i, j;
        int x, y;
        i = left; j = right;
        x = tab[(left+right)/2];
        do {
            while((tab[i] < x) && (i < right)) i++;
            while((x < tab[j]) && (j > left)) j--;
            if(i <= j) {
                y = tab[i];
                tab[i] = tab[j];
                tab[j] = y;
                i++; j--;
            }
        } while(i <= j);
        if(left < j) quickSort(tab, left, j);
        if(i < right) quickSort(tab, i, right);
        long stop = System.currentTimeMillis();

        System.out.println("Czas wykonania sortowania dla tablicy o długości [" + tab.length + "] = " + (stop - start));

        System.out.println(Arrays.toString(tab));

    }



}
