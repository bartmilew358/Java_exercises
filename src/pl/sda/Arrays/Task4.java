package pl.sda.Arrays;

public class Task4 {

    public static void main(String[] args) {

        float[] tab1 = {1,2,3,5,8,13};
        doubleArray(tab1);
    }

    private static void doubleArray(float... str) {

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]*2);
        }
    }
}
