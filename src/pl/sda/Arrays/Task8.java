package pl.sda.Arrays;

/*
* Przerób metodę z zadania nr 2 tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][]
* i liczyła sumę z wszystkich tablic.
* */

public class Task8 {

    public static void main(String[] args) {

        int[][] arrayInt2d = {{1, 2, 3, 4, 5, 6, 7, 8}, {8, 9, 10, 11, 12, 13, 14, 15}};

        show2dArray(arrayInt2d);
        System.out.println("Suma wszystkich elementów tablicy = " + add2dArray(arrayInt2d));

    }

    public static void show2dArray (int[][] arr2d){

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j]);
                System.out.print(" , ");
            }
            System.out.println("");
        }
    }

    public static double add2dArray (int[][] arr2d){

        double sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                sum += (arr2d[i][j]);
            }
        }
        return sum;
    }

}
