package helloworld;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sasad {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        for (String x : list) {
            if (x.equals("B")) {
                list.remove(x);
            }
        }
    }
}
