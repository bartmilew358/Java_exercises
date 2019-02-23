/*Napisz program, który wypisze na ekran konsoli, czy dana liczba całkowita znajduje się w przedziale
     1-10, 11-100, 101-1000, 1001-10000, czy też może jest mniejsza od 0 lub większa od 10000.
     Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.
*/

public class Zadanie1 {


    public static void main(String[] args) {

        int a = 10;

        checkNumber(-10);
        checkNumber(-0);
        checkNumber(5);
        checkNumber(55);
        checkNumber(15);

    }

    public static void checkNumber (int a) {

        if (a<0) {
            System.out.println("Liczba mniejsza od zera");
        }
        else if (a<=10) {
            System.out.println("Liczba z przedziału 1-10");
        }
        else if (a<=100) {
            System.out.println("Liczba z przedziału 11-100");
        }
        else if (a<=1000) {
            System.out.println("Liczba z przedziału 101-1000");
        }
        else if (a<=10000) {
            System.out.println("Liczba z przedziału 1001-10000");
        } else
            System.out.println("Ponad 10000");

    }


}
