package pl.sda.introtasks;/*
Napisz program, który wypisze na ekran konsoli czy podany kod Unicode jest liczbą (0-9),
małą literą (a-z) czy też dużą literą (A-Z).
Kody każdej z grup znaków następują po sobie więc wystarczy znaleźć kod np. dla litery 'a' i 'z'
i sprawdzić czy podany kod zawiera się w tym przedziale.
 */




public class Zadanie4 {
    public static void main(String[] args) {

        char x = 'A';

        System.out.println("Wprowadziłeś znak: " + x);

        if (x>='0' && x<='9')
            System.out.println("Jest to liczba od 0 do 9");

        else if (x>='A' && x<='Z')
            System.out.println("Jest to wielka litera od A do Z");

        else if (x>='a' && x<='z')
            System.out.println("Jest to mała litera od a do z");

        else System.out.println("Dana wejściowa nie jest ani cyfrą z przedziału 0-9 ani literą a-z / A-Z");

    }
}
