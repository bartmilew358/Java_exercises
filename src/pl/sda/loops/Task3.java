package pl.sda.loops;

public class Task3 {


    public static void main(String[] args) {

        doAlfphabet();


    }

    public static void doAlfphabet () {

        char c = 'A';

        while (c <= 'Z') {
            System.out.print(c);
            c++;
            c++;
        }

    }


}
