package pl.sda.collections.Maps;

// Stwórz mapę, która jako klucze będzie zawierała obiekty Integer,
// a jako wartości obiekty typu String. Wypisz na ekran rozmiar mapy oraz wszystkie wartości (klucz - wartość).

import pl.sda.interfaces.Insect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tasks {

    public static void main(String[] args) {

        Map<Integer, String> vocabulary = new HashMap<>();

        //add
        vocabulary.put(11, "cat");
        vocabulary.put(38, "bird");
        vocabulary.put(55, "deer");
        vocabulary.put(14, "bass");
        vocabulary.put(-3, "tiger");
        vocabulary.put(-1, "black cock");
        vocabulary.put(70, "shrimp");
        vocabulary.put(-70, "lion");

        //write whole map
        Set<Integer> keys = vocabulary.keySet();
        for (Integer key : keys) {
            System.out.println(key + " = " + vocabulary.get(key));
        }

        // Task 2 - Policz w mapie z pkt 1 (za pomocą pętli) ilość kluczy, które mają wartość mniejszą od zera
        // oraz takich które mają wartość większą lub równą zeru. Wypisz wyniki na ekran.

        int countBelowThanZero = 0;
        int countGreaterThanZero = 0;


        for (Integer key : keys) {
            if (key<0){
                countBelowThanZero++;
            } else {
                countGreaterThanZero++;
            }
        }
        //size of map
        System.out.println("Size of whole map: " + vocabulary.size());

        // less than zero and greater than zero
        System.out.println("Numer of keys below than zero: " + countBelowThanZero);
        System.out.println("Numer of keys greater than zero: " + countGreaterThanZero);

        // Task 3 - Z mapy stworzonej w pkt 1 wyciągnij wszystkie klucze, które mają wartość mniejszą od zera
        // i dodaj je do nowej listy obiektów Integer. Następnie usuń z mapy wszystkie wartości,
        // których klucze znajdują się w liście. Wypisz wszystkie pozostałe wartości mapy (klucz - wartość) na ekran.

        Map<Integer, String> vocabularyBelowThanZeroIndex = new TreeMap<>();

        int newKey = 1;

        for (Integer key : keys) {
            if (key<0){
                vocabularyBelowThanZeroIndex.put(newKey, vocabulary.get(key));
                newKey++;
            }
        }

        System.out.println("Map created from former map with index below zero:");

        Set<Integer> keys2 = vocabularyBelowThanZeroIndex.keySet();
        for (Integer key : keys2) {
            System.out.println(key + " = " + vocabularyBelowThanZeroIndex.get(key));
        }
    }
}
