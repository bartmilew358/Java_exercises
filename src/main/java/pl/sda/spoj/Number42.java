package pl.sda.spoj;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number42 {
    public static void main(String[] args) {

        List<Integer> fibonacci_list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Integer howmaynumbers = scan.nextInt();

        for (int i = 0; i < howmaynumbers; i++ ) {

            Scanner scan2 = new Scanner(System.in);
            Integer n = scan2.nextInt();
            fibonacci_list.add(i, n);
        }

        for (int i = 0; i < fibonacci_list.size(); i++) {

            if (fibonacci_list.get(i) != 42 ) {
                System.out.println(fibonacci_list.get(i));
            } else {
                return;
            }
        }
    }
}

// Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.
