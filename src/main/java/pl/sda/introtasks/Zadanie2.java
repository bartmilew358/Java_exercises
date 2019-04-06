package pl.sda.introtasks;/*
Napisz program, który wypisze na ekran konsoli, słowo oznaczające ocenę dla podanej cyfry.
Np. dla 1 - "niedostateczny", 2 - "mierny" itp. Obsłuż przypadek gdy cyfra jest poza skalą ocen.
 */


public class Zadanie2 {
    public static void main(String[] args) {


        byte a = 1;
        switch (a) {
            case 1:
                System.out.println("ndst");
                break;
            case 2:
                System.out.println("dop");
                break;
            case 3:
                System.out.println("dst");
                break;
            case 4:
                System.out.println("db");
                break;
            case 5:
                System.out.println("bdb");
                break;
            case 6:
                System.out.println("cel");
                break;
                default: {
                    System.out.println("To nie jest ocena");
                }
        }
    }
}
