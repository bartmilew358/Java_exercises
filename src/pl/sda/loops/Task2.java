package pl.sda.loops;

public class Task2 {

    public static void main(String[] args) {

        pow(2, 4);

    }

    public static void pow (int a, int n) {


        System.out.println(a);

    int wynik = a;

        for (int i = 1; i < n; i++) {

        wynik = wynik * a;

    }

        System.out.println(wynik);

    }



}
