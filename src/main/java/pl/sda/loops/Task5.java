package pl.sda.loops;

/*
* Napisz metodę sprawdzającą ilość wystąpień frazy: phrase w tekście: text. Parametry metody to: phrase i text.
Podpowiedź: użyj metody klasy String która sprawdza index dla podanej frazy
* */

public class Task5 {

    public static void main(String[] args) {

        System.out.println("Ilość powtórzeń phrase w text = ");
        System.out.println(countPhrase("pi", "pieczarkatypupipi"));
    }

    public static int countPhrase (String phrase, String text) {

        int i=0;
        int var = 0;

        while (text.indexOf(phrase, i) >= 0) {

       var++;
       i = text.indexOf(phrase, i) + 1;

        }
       return var;
    }


}
