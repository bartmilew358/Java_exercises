package pl.sda.loops;

/*
Napisz metodę, która wyświetli na ekranie n-pierwszych liczb parzystych.
Zmienna n to parametr metody. Czyli np. dla n = 4 program powinien wypisać: 2, 4, 6, 8
 */


public class Task1 {

    public static void main(String[] args) {

        firstEvenFigures(5);

    }


    public static void firstEvenFigures (int a) {


        for (int i = 0; i <= 4; i++) {

        a = a + 2;

        System.out.print(" " + a);
    }

    }

}

