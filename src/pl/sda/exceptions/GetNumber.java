package pl.sda.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        try {
            number = scanner.nextInt();
        }
        catch (InputMismatchException ime) {
            System.out.println("wyjątek");
        }
        System.out.println(number);


    }
}
