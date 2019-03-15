package pl.sda.collections.Names_Task4;

import java.util.Scanner;

public class Names {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj imie >>> ");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }


        }
    }
}
