package pl.sda.regex.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
    public static boolean isValidPostalCode(String text) {

        String text1 = text;
        Pattern pattern = Pattern.compile("\\d{2}\\-\\d{3}");

        Matcher matcher = pattern.matcher(text1);
        System.out.println("Matcher.matches > ");

        return matcher.matches();
    }

    public static boolean isValidHttpAddress(String text) {

        String text1 = text;
        Pattern pattern = Pattern.compile("((\\http://)|(\\https://))+.+(\\.)+.{2,3}");

        Matcher matcher = pattern.matcher(text1);
        System.out.println("Matcher.matches > ");

        return matcher.matches();

    }

    public static boolean isVaildDateFormat(String text) {

        String text2 = text;
        Pattern pattern2 = Pattern.compile("([1-31]{1,2}\\.)+(((0+[1-9])|([0-12]))\\.)+([1-9][1-9][1-9][1-9]|[1-9][1-9][1-9]|[1-9][1-9]|[1-9])");

        Matcher matcher = pattern2.matcher(text2);
        System.out.println("Matcher.matches > ");

        return matcher.matches();

    }
}
