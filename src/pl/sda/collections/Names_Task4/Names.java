package pl.sda.collections.Names_Task4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Names {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Set<String> set = new HashSet<>();
        String name;

        while (true) {
            System.out.print("Podaj imie >>> ");
            name = scanner.nextLine();

            if ("q".equalsIgnoreCase(name)) {
                break;
            }
            set.add(name);
        }

        System.out.println("Number of names: " + set.size());

        for (String str : set) {

            System.out.println(str);
        }
    }
}
