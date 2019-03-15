package pl.sda.collections.Task8;

import java.util.*;

public class Compare_Task8 {

    public static void main(String[] args) {

        int size = 10000;

        System.out.println("Czs dla tworzenia ArrayList z " + size + " elementów: " + ArrayListTime(size) + " ms");
        System.out.println("Czs dla tworzenia LinkedList z " + size + " elementów: " + LinkedListTime(size) + " ms");
        System.out.println("Czs dla tworzenia HashSet z " + size + " elementów: " + HashSetTime(size) + " ms");
        System.out.println("Czs dla tworzenia TreeSet z " + size + " elementów: " + TreeSetTime(size) + " ms");
        System.out.println("Czs dla tworzenia HashMap z " + size + " elementów: " + HashMapTime(size) + " ms");
        System.out.println("Czs dla tworzenia HashMap z " + size + " elementów: " + TreeMapTime(size) + " ms");


    }

    public static long ArrayListTime(int size) {

        long start=System.currentTimeMillis();

        List list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long stop=System.currentTimeMillis();
        return stop - start;
    }

    public static long LinkedListTime(int size) {

        long start=System.currentTimeMillis();
        List list = new LinkedList();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long stop=System.currentTimeMillis();
        return stop - start;
    }

    public static long HashSetTime(int size) {

        long start=System.currentTimeMillis();
        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long stop=System.currentTimeMillis();
        return stop - start;
    }

    public static long TreeSetTime(int size) {

        long start=System.currentTimeMillis();
        Set<Integer> list = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long stop=System.currentTimeMillis();
        return stop - start;
    }

    public static long HashMapTime(int size) {

        long start=System.currentTimeMillis();
        Map<Integer, String> list = new HashMap<Integer, String>();
        String a = "Janusz";

        for (int i = 0; i < size; i++) {
            a = a + 1;
            list.put(i, a);
        }
        long stop=System.currentTimeMillis();
        return stop - start;
    }

    public static long TreeMapTime(int size) {

        long start=System.currentTimeMillis();
        Map<Integer, String> list = new TreeMap<>();
        String a = "Janusz";

        for (int i = 0; i < size; i++) {
            a = a + 1;
            list.put(i, a);
        }
        long stop=System.currentTimeMillis();
        return stop - start;
    }


}
