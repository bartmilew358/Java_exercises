package pl.sda.loops;

/*
* Napisz metodę sprawdzającą, czy dany łańcuch znaków jest palindromem.
* */

public class Task9 {

    public static void main(String[] args) {

        String word = "kajak";
        System.out.println(word.length());

        int var = word.length();

//        System.out.println(word.charAt(var-1));
//        System.out.println(word.charAt(0));

        System.out.println(itIsPalindrome(word));
    }

    public static boolean itIsPalindrome (String word) {

        int var = word.length();
        int i = -1;

        do {
            i++;
            if (word.charAt(i) != word.charAt(var - i - 1)) {
                return false;
            }
        } while (i == var);

        return true;
    }
}
