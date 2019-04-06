package pl.sda.exceptions;

import javax.print.attribute.IntegerSyntax;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
            System.out.println(fruits[index]);
        }
        catch (InputMismatchException e){
            System.out.println("Index is not integer - " + e);
        }
        catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Index is out of the table - " + aioobe);
        }
        finally {
            System.out.println("Fin. Konec. The End. Już nic nie sprawdzam albowiem nie ma co.");
        }
    }
}
