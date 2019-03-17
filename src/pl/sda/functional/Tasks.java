package pl.sda.functional;

import org.w3c.dom.ranges.Range;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
        //#1
//        useLambdas();

        //#2
        useOptional();

        //#3
        useStreams();
    }

    /**
     * 1. Utwórz i użyj lambdę która:
     * - utworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {

        Supplier<Double> doubleSupplier = () -> 138.17;
        System.out.println("Value of doubleSupplier = " + doubleSupplier.get());

        Consumer<String> stringConsumer = (s) -> System.out.println(s);
//        System.out.println("Jestem w miejscu String Consumer.");
        stringConsumer.accept("lambda");

        Predicate<String> predicateStr = (s) -> (s != null) && (s.length() > 10);
        System.out.println("predicateStr.test() = " + predicateStr.test("Janusz na budowie!"));

        BiFunction<Integer, Integer, String> biFunction = (a,b) -> String.valueOf(a+b);
        System.out.println(biFunction.apply(8,13));
    }

    /**
     * 2. Utwórz obiekt Optional, który:
     * - nie będzie zawierał żadnej wartości (Optional.empty)
     * - będzie pozwalał przyjmować wartość typu String, która może być `null` (Optional.ofNullable)
     * - rzuci wyjątkiem, w momencie podania wartości null typu Float (Optional.of)
     * - rzuci własny wyjątek, jeśli podano wartość `null` i próbowano pobrać wartość (Optional.orElseThrow)
     * - zwróci wartość domyślną dla typu String jeśli podano wartość `null` (Optional.orElse)
     */
    private static void useOptional() {

//        Optional<String>optional = Optional.empty();
//        Optional<String>optional = Optional.ofNullable(null);
        Optional<String>optional = Optional.ofNullable("test");
//        Optional<String>optional = Optional.of("123");
        System.out.println(optional.isPresent());
        optional.ifPresent(s -> System.out.println("ok"));
//        optional.get();
//        optional.orElseThrow(() -> new RuntimeException());
        System.out.println(optional.orElse("e"));

    }

    /**
     * 3. Utwórz i użyj strumień danych (Stream):
     * - utwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - utwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - utwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     *   i utwórz listę przetworzonych elementów
     * - utwórz stream obiektów Person i utwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - utwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Files.list && Paths.get("."))
     */
    private static void useStreams() {

        Set<Double> list = new HashSet<>();
        list.add(5d);
        list.add(8d);
        list.add(17.28d);
        list.add(300.12d);

        Stream<Double> stream = list.stream();

//        System.out.println(stream.map());





        IntStream.range(10, 40);


//        List<String> names = Arrays.asList("Marcin", "Łukasz", "Marta", "Adam", "Ewa", "Adam");
//        List<String> listOfNames = names.stream()





    }
}