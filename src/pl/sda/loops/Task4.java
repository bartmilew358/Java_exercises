package pl.sda.loops;

public class Task4 {

    public static void main(String[] args) {

        theSameStrings("Janusz", "Janusz");

    }

    public static void theSameStrings(String text1, String text2) {

        if (text1.length() != text2.length()) System.out.println("Teksty są różne");

        for (int i = 0; i < text1.length(); i++) {

         if (text1.charAt(i) == text2.charAt(i)) {

         }   else
             {
                 System.out.println("Teksty są różne.");
                 break;
         }
            System.out.println("Teksty są takie same.");
        }

    }


}