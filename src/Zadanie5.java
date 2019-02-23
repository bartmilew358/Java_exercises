/*
Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia
(dla 1 - "poniedziałek", 2 - "wtorek" itp).
Dodatkowo wyświetl ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.
 */

public class Zadanie5 {
    public static void main(String[] args) {

    dzien_tygodnia(1);
    dzien_tygodnia(2);
    dzien_tygodnia(3);
    dzien_tygodnia(4);
    dzien_tygodnia(5);
    dzien_tygodnia(6);
    dzien_tygodnia(7);
    dzien_tygodnia(8);

    }

    public static void dzien_tygodnia(int dzien) {

        switch (dzien) {
            case 1: System.out.println("Poniedziałek. De weekendu 5 dni.");break;
            case 2: System.out.println("Wtorek. De weekendu 4 dni.");break;
            case 3: System.out.println("Sroda. De weekendu 3 dni.");break;
            case 4: System.out.println("Czwartek. De weekendu 2 dni.");break;
            case 5: System.out.println("Piątek. De weekendu 1 dni.");break;
            case 6: System.out.println("Sobota. Jeste weekend!");break;
            case 7: System.out.println("Niedziela. Jutro poniedziałek :(");break;

            default:
                System.out.println("To nie jest dzień.");

        }


    }

}
