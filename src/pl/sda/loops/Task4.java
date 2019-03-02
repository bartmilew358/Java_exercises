package pl.sda.loops;

public class Task4 {

    public static void main(String[] args) {

        theSameStrings("Janusz", "Janusz");

    }

    public static void theSameStrings(String text1, String text2) {

        if (text1.length() != text2.length()) {

            System.out.println("Wyrazy są różne");

        } else {

            int textLength = text1.length();
            int i;

            for (i = 0; i < textLength; i++) {

                if (text1.charAt(i) == text2.charAt(i)) {
                    //continue;

                } else {
                    System.out.println("Wyrazy są różne.");
                    break;
                }
            }

            if (i == (textLength)) {
                System.out.println("Wyrazy są identyczne.");
            }
        }
    }
}