//Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej zmiennej jest liczbą parzystą lub false w przeciwnym przypadku.

public class Task3 {
    public static void main(String[] args) {

        int a = 9;
        int b;
        b = a%2;

        if (b==0) System.out.println("parzysta");
        else System.out.println("nieparzysta");

        int x = 22;

        int y = x%2;
        boolean isEven = y == 0;

        System.out.println("Is even " + isEven);

        System.out.println("parzysta: " + (x%2 ==0));






    }
}

