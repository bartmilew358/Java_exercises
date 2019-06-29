package programowanie2.primeNumbbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class primeNumbers {

    public static void main(String[] args) throws FileNotFoundException {

        long start = System.currentTimeMillis();

        File file = new File("src\\main\\resources\\numbers.txt");
        Scanner scanner = new Scanner(file);

        long count = 0;

        while (scanner.hasNextLong()) {
            long numberToCheckIsPrime = scanner.nextLong();

            if (isPrimeNumber(numberToCheckIsPrime)) {
                count++;
            }
        }
        System.out.println(count);

        long stop = System.currentTimeMillis();
        System.out.println("Czas = " + (stop - start));
    }

    public static boolean isPrimeNumber(long number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}