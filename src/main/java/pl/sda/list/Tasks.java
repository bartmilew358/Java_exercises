package pl.sda.list;

import com.google.common.collect.Lists;
import org.checkerframework.common.aliasing.qual.Unique;

import java.util.*;
import java.util.stream.Collectors;

import static javax.swing.UIManager.get;

public class Tasks {

    public static void main(String[] args) {
        //#1
//        listOfIntegers();

        //#2
//        List<String> list1 = Lists.newArrayList("apple", "pear", "plum");
//        List<String> list2 = Lists.newArrayList("orange", "pear");
//        List<String> list3 = Lists.newArrayList("lemon", "peach", "cherry", "apple");
//        List<String> fruits = merge(list1, list2, list3);
//        System.out.println("fruits = " + fruits);

        //#3
//        List<Double> numbers = Lists.newArrayList(3.5, 0.5, 3.1, 7., 0.9);
//        List<Double> sortedNumbers = selectionSort(numbers);
//        System.out.println("sortedNumbers = " + sortedNumbers);

        //#4
        List<String> strings = Lists.newArrayList("ford", "lion", "orange", "adam", "julia", "elephant");
        boolean isLionFound = binarySearch(strings, "lion");
        boolean isCatFound = binarySearch(strings, "cat");
        System.out.println("isLionFound = " + isLionFound);
        System.out.println("isCatFound = " + isCatFound);

        //#5
        //List<Product> products = Lists.newArrayList(
        //                                new Product(1, "SmartTV", 1999.99),
        //                                new Product(2, "Laptop HD", 1500.55),
        //                                new Product(3, "Pencil", 15.59),
        //                                new Product(4, "SmartWatch", 999.05),
        //                                new Product(5, "Pen", 15.59),
        //                                new Product(6, "Laptop FullHD", 1500.55)
        //                                );
        //products = sortProducts(products);
        //System.out.println("products sorted:");
        //products.forEach(System.out::println);
    }

    /**
     * 1. Stwórz listę obiektów typu Integer. Wypisz na ekran pierwszy, środokowy i ostatni element listy.
     * Następnie wypisz na ekran co drugą liczbę z listy.
     */
    private static void listOfIntegers() {
        List<Integer> list1 = Lists.newArrayList(1,3,5,8,1,5,9);

        System.out.println(list1.get(0));
        System.out.println(list1.get(list1.size()-1));

        if (list1.size() % 2 != 0) {
            System.out.println(list1.get((list1.size()-1)/2)); }
        else {
            System.out.println(list1.get((list1.size()/2)-1) + " oraz " + list1.get((list1.size()/2)));
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
            i++;
        }
    }

    /**
     * 2. Napisz metodę która połączy wszystkie element 3 list w jedną listę, która ma być zwrócona z metody.
     *    Zwrócona lista nie powinna zawierać duplikatów.
     */
    private static List<String> merge(List<String> list1, List<String> list2, List<String> list3) {

        List<String> mergeList = new ArrayList<>();

        mergeList.addAll(list1);
        mergeList.addAll(list2);
        mergeList.addAll(list3);

        List<String> mergelist_wo_duplicated_value = mergeList.stream().distinct().collect(Collectors.toList());

        return mergelist_wo_duplicated_value;
    }

    /**
     * 3. Posortuj podane liczby bez użycia metod z klasy Collection - za pomocą algorytmu sortowanie przez wybieranie
     */
    private static List<Double> selectionSort(List<Double> numbers) {


        for (int curIndex = 0; curIndex < numbers.size(); curIndex++) {

            double smallest;
            int smallestIndex;

            smallest = numbers.get(curIndex);
            smallestIndex = curIndex;

            for (int i = curIndex + 1; i < numbers.size(); i++) {
                if (smallest > numbers.get(i)) {
                    // update smallest
                    smallest = numbers.get(i);
                    smallestIndex = i;
                }
            }
            if (smallestIndex == curIndex);
            else {
                double temp = numbers.get(curIndex);
                numbers.set(curIndex, numbers.get(smallestIndex));
                numbers.set(smallestIndex, temp);
            }
        }
        return numbers;
    }

    /**
     * 4. Napisz metodę, która wyszuka podany element w liście i zwróci true jeżęli element zostanie znaleziony, false - w przeciwnym przypadku
     */
    private static boolean binarySearch(List<String> strings, String searchedPhrase) {

        for (int i = 0; i < strings.size(); i++) {

            if (strings.get(i) == searchedPhrase) {
            return true;}
        }
        return false;
    }

    /**
     * 5*. Posortuje listę produktów po cenie rosnąco i po nazwie rosnąco. Zwróć posortowaną listę.
     */
//    private static List<Product> sortProducts(List<Product> products) {
//        return null;
//    }
}