package pl.sda.spoj;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number42v2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            String value = scanner.nextLine();
            if (value.equals("42")) {
                break;
            } else {
                System.out.println(value);
            }
        }
    }
}

// Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.
