//Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej zmiennej jest podzielna przez 3 i jednocześnie przez 5 lub false w przeciwnym przypadku.

public class Task4 {
    public static void main(String[] args) {

        int a = 12;
        int b, c;
        b = a%3;
        c = a%5;

        if (b==0 && c==0) System.out.println("true");
        else System.out.println("false");



    }
}

