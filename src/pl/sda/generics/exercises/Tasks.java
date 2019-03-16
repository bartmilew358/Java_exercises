package pl.sda.generics.exercises;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        Set<Double> doubles = setOfDoubles();
        System.out.println("--------------------------------------------");

        //#2
        Map<Integer, String> genericMap = genericMap();
        System.out.println("--------------------------------------------");

        //#3
        List<Number> numbers = doublesToNumbers(setOfDoubles());
        System.out.println("numbers = " + numbers);
        System.out.println("--------------------------------------------");

        //#4
        NumbersBox numbersBox = numbersToNumbersBox(numbers);
//        System.out.println(numbersBox.isEmpty(numbers));
//        System.out.println(numbersBox.firstElement(numbers));
//        System.out.println(numbersBox.lastElement(numbers));


        //#5
        //NumbersBox<Double> doubleNumbersBox = boxOfDoubles(doubles);
    }

    /**
     * 1. Stwórz kolekcję typu Set, zawierającą obiekty klasy Double. Dodaj do niej kilka liczb.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy kolekcji.
     * Metoda powinna zwrócić stworzoną kolekcję.
     */
    private static Set<Double> setOfDoubles() {

        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.2);
        doubleSet.add(null);
        doubleSet.add(2.2);
        doubleSet.add(1.8);
        doubleSet.add(3.9);


        for (Double aDouble : doubleSet){
            System.out.println(aDouble);
        }
        return doubleSet;
    }

    /**
     * 2. Stwórz mapę zawierającą obiekty typu Integer jako klucze i String jako wartości. Dodaj kilka obiektów do mapy.
     * Pobierz i wyświetl w konsoli pojedyncze elementy.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy mapy.
     * Metoda powinna zwrócić stworzoną mapę.
     */
    private static Map<Integer, String> genericMap() {

        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "adin");
        sampleMap.put(2, "two");
        sampleMap.put(3, "drei");
        sampleMap.put(4, "vier");
        sampleMap.put(5, "pięć");
        sampleMap.put(6, "down");
        sampleMap.put(7, "up");
        sampleMap.put(8, "halt");

        for (Integer key : sampleMap.keySet()) {
            System.out.println(key + " : " + sampleMap.get(key));
        }
        return sampleMap;
    }

    /**
     * 3. Skopiuj podany zbiór liczby Double do listy obiektów klasy Number.
     * Nie kopiuj obiektu jeżeli jest równy null.
     * Zwróć nową listę jako wynik metody.
     */
    private static List<Number> doublesToNumbers(Set<Double> doubles) {

        List<Number> list = new ArrayList<>();

        for (Double aDouble : doubles) {
            if (aDouble !=null) {
                list.add(aDouble);
            }
        }
        return list;
    }

    /**
     * 4. Uzupełnij klasę NumbersBox która ma przechowywać listę obiektów klasy Number.
     * Dodaj metody które:
     * - sprawdzą czy lista jest pusta
     * - pobierze pierwszy element listy
     * - pobierze pierwszy element listy jako int
     * - pobierze ostatni element listy
     * - pobierze ostatni element listy jako int
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox numbersToNumbersBox(List<Number> numbers) {

        NumbersBox<Number> numbersBox = new NumbersBox<Number>(numbers);

        System.out.println("Is empty: " + numbersBox.isEmpty(numbers));
        System.out.println("First element: " + numbersBox.firstElement());
        System.out.println("First element: " + numbersBox.firstElementAsInt());
        System.out.println("Last element: " + numbersBox.lastElement());
        System.out.println("Last element: " + numbersBox.lastElementAsInt());

        return numbersBox;
    }

    /**
     * 5. Zmień klasę NumbersBox - tak żeby przyjmowała różne typy liczbowe - np. Double
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox<Double> boxOfDoubles(Set<Double> doubles) {
        return null;
    }
}
