package pl.sda.spoj;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            Integer value = scanner.nextInt();

            for (int i = 1; i <= (value / 2); i++) {
                if (value % i == 0) {
                    System.out.println("TAK");

                } else {
                    System.out.println("NIE");
                }
            }

        }
    }

// Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.
